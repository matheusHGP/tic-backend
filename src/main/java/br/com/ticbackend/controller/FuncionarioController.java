package br.com.ticbackend.controller;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ticbackend.dto.FuncionarioDto;
import br.com.ticbackend.dto.UsuarioDto;
import br.com.ticbackend.model.Funcionario;
import br.com.ticbackend.model.Usuario;
import br.com.ticbackend.repository.FuncionarioRepository;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	FuncionarioRepository injecao;
	
	@Autowired
	ModelMapper modelMapper;
	
	@CrossOrigin("*")
	@GetMapping()
	public List<Funcionario> get(){
		return injecao.findAll();
	}
	
	@CrossOrigin("*")
	@GetMapping("/{id}")
	public Funcionario getOnly(@PathVariable long id){
		Optional<Funcionario> funcionario = injecao.findById(id);
		return funcionario.get();
	}
	
	
	@CrossOrigin("*")
	@PostMapping()
	public String post(@RequestBody Funcionario funcionario){
		injecao.save(funcionario);
		return "Inserção com Sucesso!";
	}
	
	@CrossOrigin("*")
	@PutMapping()
	public String update(@RequestBody Funcionario funcionario) {
		injecao.save(funcionario); 
		return "Inserção com sucesso";
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
