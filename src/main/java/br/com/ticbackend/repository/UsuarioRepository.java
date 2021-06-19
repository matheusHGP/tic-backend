package br.com.ticbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ticbackend.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{	
	public Usuario findByEmailUsuario(String email);
}
