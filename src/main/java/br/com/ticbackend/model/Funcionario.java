package br.com.ticbackend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_funcionario")
public class Funcionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7290131090290170939L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="nome_funcionario")
	private String nomeFuncionario;
	@Column(name="cargo_funcionario")
	private String cargoFuncionario;
	@Column(name="status_funcionario")
	private int statusFuncionario;
	
	public Funcionario() {

	}


	public Funcionario(long id, String nomeFuncionario, String cargoFunconario, int statusFuncionario) {
		super();
		this.id = id;
		this.nomeFuncionario = nomeFuncionario;
		this.cargoFuncionario = cargoFunconario;
		this.statusFuncionario = statusFuncionario;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	
	public String getCargoFuncionario() {
		return cargoFuncionario;
	}


	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}


	public int getStatusFuncionario() {
		return statusFuncionario;
	}

	public void setStatusFuncionario(int statusFuncionario) {
		this.statusFuncionario = statusFuncionario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
