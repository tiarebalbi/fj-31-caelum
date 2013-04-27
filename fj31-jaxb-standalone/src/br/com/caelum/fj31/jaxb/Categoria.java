package br.com.caelum.fj31.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Categoria {

	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
