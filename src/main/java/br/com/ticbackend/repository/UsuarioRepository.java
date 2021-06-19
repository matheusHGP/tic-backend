package br.com.ticbackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.ticbackend.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{	
	public Usuario findByEmailUsuario(String email);

	public Usuario findById(long id);

	@Query("select c from Usuario c where (:nomeUsuario is null or c.nomeUsuario = :nomeUsuario) "
			+ "and (:emailUsuario is null or c.emailUsuario = :emailUsuario)"
			+ "and (:nivelUsuario is null or c.nivelUsuario = :nivelUsuario)")
	public List<Usuario> findAll(String nomeUsuario, String emailUsuario, Integer nivelUsuario);

}
