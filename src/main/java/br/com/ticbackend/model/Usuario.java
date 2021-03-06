package br.com.ticbackend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuarios")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 7890130505860617216L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="nome_usuario")
	private String nomeUsuario;
	@Column(name="email_usuario")
	private String emailUsuario;
	@Column(name="senha_usuario")
	private String senhaUsuario;
	@Column(name="antiga_senha_usuario")
	private String antigaSenhaUsuario;
	@Column(name="nivel_usuario")
	private Integer nivelUsuario;
	@Column(name="status_usuario")
	private int statusUsuario;
	
	
	public Usuario(String nomeUsuario, String emailUsuario, String senhaUsuario, String antigaSenhaUsuario,
			Integer nivelUsuario, int statusUsuario) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
		this.antigaSenhaUsuario = antigaSenhaUsuario;
		this.nivelUsuario = nivelUsuario;
		this.statusUsuario = statusUsuario;
	}
	
	public Usuario() {
		
	}
	
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
	
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
	public String getAntigaSenhaUsuario() {
		return antigaSenhaUsuario;
	}
	public void setAntigaSenhaUsuario(String antigaSenhaUsuario) {
		this.antigaSenhaUsuario = antigaSenhaUsuario;
	}
	
	public Integer getNivelUsuario() {
		return nivelUsuario;
	}
	public void setNivelUsuario(Integer nivelUsuario) {
		this.nivelUsuario = nivelUsuario;
	}
	
	public int getStatusUsuario() {
		return statusUsuario;
	}
	public void setStatusUsuario(int statusUsuario) {
		this.statusUsuario = statusUsuario;
	}
}
