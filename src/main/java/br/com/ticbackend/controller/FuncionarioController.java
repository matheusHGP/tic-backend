package br.com.ticbackend.controller;

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

import br.com.ticbackend.dto.FuncionarioDto;
import br.com.ticbackend.dto.UsuarioDto;
import br.com.ticbackend.model.Funcionario;
import br.com.ticbackend.model.Usuario;
import br.com.ticbackend.repository.FuncionarioRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	FuncionarioRepository injecao;
	
	@Autowired
	ModelMapper modelMapper;
	
	@GetMapping()
	public List<Funcionario> get(@RequestParam(name = "nomeFuncionario", required = false) String nomeFuncionario,
			@RequestParam(name = "cargoFuncionario", required = false) String cargoFuncionario,
			@RequestParam(name = "statusFuncionario", required = false) Integer statusFuncionario){
		return injecao.findAll(nomeFuncionario, cargoFuncionario, statusFuncionario);
	}
	
	@GetMapping("/{id}")
	public Funcionario getOnly(@PathVariable long id){
		Funcionario funcionario = injecao.findById(id);
		return funcionario;
	}
	
	@PostMapping()
	public String post(@RequestBody Funcionario funcionario){
		injecao.save(funcionario);
		return "Funcionário cadastrado com sucesso!";
	}
	
	@PutMapping("/{id}")
	public String update(@PathVariable long id, @RequestBody Funcionario funcionario) {
		injecao.save(funcionario); 
		return "Funcionário atualizado com sucesso!";
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable long id){
		Funcionario funcionario = injecao.findById(id);
		funcionario.setStatusFuncionario(99);
		injecao.save(funcionario);
		
		return new ResponseEntity<>("Usuário deletado com sucesso !", HttpStatus.OK);
	}
	
	private FuncionarioDto convertToDto(Funcionario funcionario) {
		FuncionarioDto funcionarioDto = modelMapper.map(funcionario, FuncionarioDto.class);
		return funcionarioDto;
	}
	
	private Funcionario convertToEntity(Funcionario funcionarioDto) {
		Funcionario funcionario = modelMapper.map(funcionarioDto, Funcionario.class);
		return funcionario;
	}
	
}
