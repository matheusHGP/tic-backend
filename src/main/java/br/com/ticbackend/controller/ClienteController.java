package br.com.ticbackend.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ticbackend.dto.ClienteDto;
import br.com.ticbackend.model.Cliente;
import br.com.ticbackend.repository.ClienteRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	ClienteRepository injecao;

	@Autowired
	ModelMapper modelMapper;

	@PostMapping()
	public ResponseEntity<String> cliente(@RequestBody Cliente cliente) {
		injecao.save(cliente);
		return new ResponseEntity<>("Cliente cadastrado", HttpStatus.OK);
	}

	@GetMapping()
	public List<ClienteDto> getAll(@RequestParam(name = "nomeCliente", required = false) String nomeCliente,
			@RequestParam(name = "cpfCliente", required = false) String cpfCliente) {

		List<Cliente> clientes;

		clientes = injecao.findAll(nomeCliente, cpfCliente);

		List<ClienteDto> clientesDto = new ArrayList<ClienteDto>();

		clientes.forEach(cliente -> clientesDto.add(convertToDto(cliente)));

		return clientesDto;
	}

	@GetMapping("/{id}")
	public ClienteDto getOnly(@PathVariable long id) {
		Optional<Cliente> cliente = injecao.findById(id);

		return convertToDto(cliente.get());
	}

	@PutMapping("/{id}")
	public ResponseEntity<ClienteDto> put(@PathVariable long id, @RequestBody Cliente cliente) {
		injecao.save(cliente);
		return new ResponseEntity<>(convertToDto(cliente), HttpStatus.OK);
	}

	private ClienteDto convertToDto(Cliente cliente) {
		ClienteDto clienteDto = modelMapper.map(cliente, ClienteDto.class);
		return clienteDto;
	}

	// private Cliente convertToEntity(ClienteDto clienteDto) {
	// Cliente cliente = modelMapper.map(clienteDto, Cliente.class);
	// return cliente;
	// }

	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Cliente removido";
	}

}
