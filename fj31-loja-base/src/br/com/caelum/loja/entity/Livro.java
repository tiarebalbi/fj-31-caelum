package br.com.caelum.loja.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class Livro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private double preco;
	private Date dataAlterada;
	
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Autor> autores = new ArrayList<Autor>();

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[Livro: " + this.getNome() + " - " + "Preço: " + this.getPreco() + "]");
		return buffer.toString();
	}
	
	@PrePersist
	@PreUpdate
	public void preAltera() {
		System.out.println("CALLBACK preAlterar(): atualização de data");
		this.dataAlterada = Calendar.getInstance(). getTime();
	}
	
	public Date getDataAlterada() {
		return dataAlterada;
	}


	public void setDataAlterada(Date dataAlterada) {
		this.dataAlterada = dataAlterada;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	/**
	 * @return the autores
	 */
	public List<Autor> getAutores() {
		return autores;
	}

	/**
	 * @param autores the autores to set
	 */
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
}
