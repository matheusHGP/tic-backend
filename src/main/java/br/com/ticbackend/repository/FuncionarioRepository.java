package br.com.ticbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.ticbackend.model.Funcionario;
import br.com.ticbackend.model.Usuario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

	public Funcionario findById(long id);

	@Query("select f from Funcionario f where (:nomeFuncionario is null or f.nomeFuncionario = :nomeFuncionario) "
			+ "and (:cargoFuncionario is null or f.cargoFuncionario = :cargoFuncionario)"
			+ "and (:statusFuncionario is null or f.statusFuncionario = :statusFuncionario)")
	public List<Funcionario> findAll(String nomeFuncionario, String cargoFuncionario, Integer statusFuncionario);
}
