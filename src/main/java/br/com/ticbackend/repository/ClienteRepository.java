package br.com.ticbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.ticbackend.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	@Query("select c from Cliente c where (:nomeCliente is null or c.nomeCliente = :nomeCliente)"
			+ "and (:cpfCliente is null or c.cpfCliente = :cpfCliente)")
	public List<Cliente> findAll(String nomeCliente, String cpfCliente);

}
