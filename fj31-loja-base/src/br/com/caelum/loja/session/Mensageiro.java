package br.com.caelum.loja.session;

import java.util.List;

import javax.jms.JMSException;
import javax.xml.bind.JAXBException;

import br.com.caelum.loja.entity.Livro;

public interface Mensageiro {
	
	void enviaMensagem(List<Livro> livros);

}
