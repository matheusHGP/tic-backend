package br.com.ticbackend.dto;

public class UsuarioDto {

	private long id;
	private String nomeUsuario;
	private String emailUsuario;
	private int nivelUsuario;
	private int statusUsuario;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public int getNivelUsuario() {
		return nivelUsuario;
	}

	public void setNivelUsuario(int nivelUsuario) {
		this.nivelUsuario = nivelUsuario;
	}

	public int getStatusUsuario() {
		return statusUsuario;
	}

	public void setStatusUsuario(int statusUsuario) {
		this.statusUsuario = statusUsuario;
	}
}
