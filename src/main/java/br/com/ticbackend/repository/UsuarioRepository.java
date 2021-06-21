package br.com.ticbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.ticbackend.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findByEmailUsuario(String email);

	public Usuario findById(long id);

	@Query("select u from Usuario u where (:nomeUsuario is null or u.nomeUsuario = :nomeUsuario) "
			+ "and (:emailUsuario is null or u.emailUsuario = :emailUsuario)"
			+ "and (:nivelUsuario is null or u.nivelUsuario = :nivelUsuario)"
			+ "and (:statusUsuario is null or u.statusUsuario = :statusUsuario)")
	public List<Usuario> findAll(String nomeUsuario, String emailUsuario, Integer nivelUsuario, Integer statusUsuario);

}
