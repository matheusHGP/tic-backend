package br.com.ticbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ticbackend.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	
}
