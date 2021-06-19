package br.com.ticbackend.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_clientes")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 7895430504860617216L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "nome_cliente")
	private String nomeCliente;
	@Column(name = "cpf_cliente")
	private String cpfCliente;
	@Column(name = "telefone_cliente")
	private String telefoneCliente;
	@Column(name = "email_cliente")
	private String emailCliente;
	@Column(name = "data_cadastro_cliente")
	private Date dataCadastroCliente;
	@Column(name = "data_atualizacao_cliente")
	private Date dataAtualizacaoCliente;
	@Column(name = "cep_endereco_cliente")
	private String cepEnderecoCliente;
	@Column(name = "logradouro_endereco_cliente")
	private String logradouroEnderecoCliente;
	@Column(name = "bairro_endereco_cliente")
	private String bairroEnderecoCliente;
	@Column(name = "numero_endereco_cliente")
	private String numeroEnderecoCliente;
	@Column(name = "status_cliente")
	private int statusCliente;

	public Cliente(String nomeCliente, String cpfCliente, String telefoneCliente, String emailCliente,
			Date dataCadastroCliente, Date dataAtualizacaoCliente, String cepEnderecoCliente,
			String logradouroEnderecoCliente, String bairroEnderecoCliente, String numeroEnderecoCliente,
			int statusCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.telefoneCliente = telefoneCliente;
		this.emailCliente = emailCliente;
		this.dataCadastroCliente = dataCadastroCliente;
		this.dataAtualizacaoCliente = dataAtualizacaoCliente;
		this.cepEnderecoCliente = cepEnderecoCliente;
		this.logradouroEnderecoCliente = logradouroEnderecoCliente;
		this.bairroEnderecoCliente = bairroEnderecoCliente;
		this.numeroEnderecoCliente = numeroEnderecoCliente;
		this.statusCliente = statusCliente;
	}

	public Cliente() {

	}

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
