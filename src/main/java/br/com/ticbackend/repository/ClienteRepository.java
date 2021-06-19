package br.com.ticbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ticbackend.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
