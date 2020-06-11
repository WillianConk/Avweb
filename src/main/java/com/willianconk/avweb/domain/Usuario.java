package com.willianconk.avweb.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private boolean chefe;
	private String nome;
	private String cpf;
	
	@ManyToMany(mappedBy = "usuarios")
	private List<Cardapio> cardapios = new ArrayList<>();
	
	public Usuario() {
	}
	
	public Usuario(Integer id, boolean chefe, String nome, String cpf) {
		super();
		this.id = id;
		this.chefe = chefe;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isChefe() {
		return chefe;
	}

	public void setChefe(boolean chefe) {
		this.chefe = chefe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Cardapio> getCardapio() {
		return cardapios;
	}

	public void setCardapio(List<Cardapio> pedido) {
		this.cardapios = pedido;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
