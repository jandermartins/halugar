package br.ufc.crateus.halugar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "casa")
public class Casa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String endereco;
	@Column(nullable = false)
	private int numero;
	@Column(nullable = false)
	private String cep;
	@Column(nullable = true)
	private String bairro;
	@Column(nullable = true)
	private String informacoes;
	@Column(nullable = false)
	private String preco;
	@Column(nullable = false)
	private int vagas;

	public Casa(int id, String endereco, int numero, String cep, String bairro, String informacoes, String preco,
			int vagas) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.informacoes = informacoes;
		this.preco = preco;
		this.vagas = vagas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	@Override
	public String toString() {
		return "Casa [id=" + id + ", endereco=" + endereco + ", numero=" + numero + ", cep=" + cep + ", bairro="
				+ bairro + ", informacoes=" + informacoes + ", preco=" + preco + ", vagas=" + vagas + "]";
	}
}
