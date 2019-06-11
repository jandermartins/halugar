package br.ufc.crateus.halugar.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import javax.persistence.Table;



@Entity
@Table(name = "anuncio")
public class Anuncio {

	@Id
	@GeneratedValue
	private int id;
	@OneToOne(fetch = FetchType.LAZY)
	private Usuario usuario;
	@OneToOne(fetch = FetchType.LAZY)
	private Casa casa;

	public Anuncio(int id, Usuario usuario, Casa casa) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.casa = casa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Casa getCasa() {
		return casa;
	}

	public void setCasa(Casa casa) {
		this.casa = casa;
	}

	@Override
	public String toString() {
		return "Anuncio [id=" + id + ", usuario=" + usuario + ", casa=" + casa + "]";
	}
}
