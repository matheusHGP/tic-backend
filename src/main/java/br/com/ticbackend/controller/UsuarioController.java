package br.com.ticbackend.controller;

import java.util.ArrayList;
import br.com.ticbackend.utils.exceptions.NotFoundException;
import java.util.List;

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

import br.com.ticbackend.dto.UsuarioDto;
import br.com.ticbackend.model.Usuario;
import br.com.ticbackend.repository.UsuarioRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioRepository injecao;

	@Autowired
	ModelMapper modelMapper;

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Usuario usuario) {
		Usuario usuarioModel = injecao.findByEmailUsuario(usuario.getEmailUsuario());
		if (usuarioModel == null || !(usuarioModel.getSenhaUsuario().equals(usuario.getSenhaUsuario()))) {
			return new ResponseEntity<>("Usuário ou senha inválidos", HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>("Login realizado com sucesso !", HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<String> post(@RequestBody Usuario usuario) {
		Usuario usuarioModel = injecao.findByEmailUsuario(usuario.getEmailUsuario());
		if (usuarioModel != null) {
			return new ResponseEntity<>("Usuário já cadastrado com esse email", HttpStatus.CONFLICT);
		}

		injecao.save(usuario);
		return new ResponseEntity<>("Usuário cadastrado com sucesso !", HttpStatus.OK);
	}

	@GetMapping()
	public List<UsuarioDto> getAll(@RequestParam(name = "nomeUsuario", required = false) String nomeUsuario,
			@RequestParam(name = "emailUsuario", required = false) String emailUsuario,
			@RequestParam(name = "nivelUsuario", required = false) Integer nivelUsuario) {

		List<Usuario> usuarios;

		usuarios = injecao.findAll(nomeUsuario, emailUsuario, nivelUsuario, 0);

		List<UsuarioDto> usuariosDto = new ArrayList<UsuarioDto>();

		usuarios.forEach(usuario -> usuariosDto.add(convertToDto(usuario)));

		return usuariosDto;
	}

	@GetMapping("/{id}")
	public UsuarioDto getOnly(@PathVariable long id) throws NotFoundException {
		Usuario usuario = injecao.findById(id);
		if (usuario == null) {
			throw new NotFoundException("Usuário não encontrado");
		}
		return convertToDto(usuario);
	}

	@PutMapping("/{id}")
	public ResponseEntity<UsuarioDto> put(@PathVariable long id, @RequestBody Usuario usuario) {
		injecao.save(usuario);
		return new ResponseEntity<>(convertToDto(usuario), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable long id){
		Usuario usuario = injecao.findById(id);
		usuario.setStatusUsuario(99);
		injecao.save(usuario);
		
		return new ResponseEntity<>("Usuário deletado com sucesso !", HttpStatus.OK);
	}

	private UsuarioDto convertToDto(Usuario usuario) {
		UsuarioDto usuarioDto = modelMapper.map(usuario, UsuarioDto.class);
		return usuarioDto;
	}

	// private Usuario convertToEntity(UsuarioDto usuarioDto) {
		// Usuario usuario = modelMapper.map(usuarioDto, Usuario.class);
		// return usuario;
	// }
}
