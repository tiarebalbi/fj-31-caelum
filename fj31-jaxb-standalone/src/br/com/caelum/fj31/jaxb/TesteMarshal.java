package br.com.caelum.fj31.jaxb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import br.com.caelum.fj31.generated.Categoria;
import br.com.caelum.fj31.generated.Produto;

public class TesteMarshal {
	public static void main(String[] args) throws JAXBException, FileNotFoundException, SAXException {
		Produto produto = new Produto();
		produto.setNome("FJ-31");
		produto.setDescricao("Curso Caelum");
		produto.setPreco(2450.25d);
		
		Categoria cat = new Categoria();
		cat.setNome("Java");
		
		produto.setCategoria(cat);
		
		JAXBContext ctx = JAXBContext.newInstance(Produto.class);
		Marshaller info = ctx.createMarshaller();
		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema sc = sf.newSchema(new File("novo-teste.xsd"));
		
		info.setSchema(sc);
		info.marshal(produto, new FileOutputStream("cursos.xml"));
	}
}
