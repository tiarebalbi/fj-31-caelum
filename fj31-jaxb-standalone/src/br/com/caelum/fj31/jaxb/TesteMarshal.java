package br.com.caelum.fj31.jaxb;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class TesteMarshal {
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		Produto produto = new Produto();
		produto.setNome("oindqwion");
		produto.setDescricao("dawio");
		produto.setPreco(222d);
		
		Categoria cat = new Categoria();
		cat.setNome("Infoo");
		
		produto.setCategoria(cat);
		
		JAXBContext ctx = JAXBContext.newInstance(Produto.class);
		Marshaller info = ctx.createMarshaller();
		info.marshal(produto, new FileOutputStream("bola.xml"));
	}
}
