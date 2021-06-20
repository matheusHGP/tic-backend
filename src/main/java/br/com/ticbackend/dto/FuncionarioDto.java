package br.com.ticbackend.dto;

public class FuncionarioDto {

	private long id;
	private String nomeFuncionario;
	private String cargoFunconario;
	private int statusFuncionario;
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
	public String getCargoFunconario() {
		return cargoFunconario;
	}
	public void setCargoFunconario(String cargoFunconario) {
		this.cargoFunconario = cargoFunconario;
	}
	public int getStatusFuncionario() {
		return statusFuncionario;
	}
	public void setStatusFuncionario(int statusFuncionario) {
		this.statusFuncionario = statusFuncionario;
	}
	
	
}
