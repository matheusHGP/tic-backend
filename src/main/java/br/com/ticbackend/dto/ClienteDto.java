package br.com.ticbackend.dto;

import java.util.Date;

public class ClienteDto {

	private long id;
	private String nomeCliente;
	private String cpfCliente;
	private String telefoneCliente;
	private String emailCliente;
	private Date dataCadastroCliente;
	private Date dataAtualizacaoCliente;
	private String cepEnderecoCliente;
	private String logradouroEnderecoCliente;
	private String bairroEnderecoCliente;
	private String numeroEnderecoCliente;
	private int statusCliente;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public Date getDataCadastroCliente() {
		return dataCadastroCliente;
	}

	public void setDataCadastroCliente(Date dataCadastroCliente) {
		this.dataCadastroCliente = dataCadastroCliente;
	}

	public Date getDataAtualizacaoCliente() {
		return dataAtualizacaoCliente;
	}

	public void setDataAtualizacaoCliente(Date dataAtualizacaoCliente) {
		this.dataAtualizacaoCliente = dataAtualizacaoCliente;
	}

	public String getCepEnderecoCliente() {
		return cepEnderecoCliente;
	}

	public void setCepEnderecoCliente(String cepEnderecoCliente) {
		this.cepEnderecoCliente = cepEnderecoCliente;
	}

	public String getLogradouroEnderecoCliente() {
		return logradouroEnderecoCliente;
	}

	public void setLogradouroEnderecoCliente(String logradouroEnderecoCliente) {
		this.logradouroEnderecoCliente = logradouroEnderecoCliente;
	}

	public String getBairroEnderecoCliente() {
		return bairroEnderecoCliente;
	}

	public void setBairroEnderecoCliente(String bairroEnderecoCliente) {
		this.bairroEnderecoCliente = bairroEnderecoCliente;
	}

	public String getNumeroEnderecoCliente() {
		return numeroEnderecoCliente;
	}

	public void setNumeroEnderecoCliente(String numeroEnderecoCliente) {
		this.numeroEnderecoCliente = numeroEnderecoCliente;
	}

	public int getStatusCliente() {
		return statusCliente;
	}

	public void setStatusCliente(int statusCliente) {
		this.statusCliente = statusCliente;
	}

}
