
package br.com.caelum.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.caelum.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscaLivroResponse_QNAME = new QName("http://session.loja.caelum.com.br/", "buscaLivroResponse");
    private final static QName _BuscaLivro_QNAME = new QName("http://session.loja.caelum.com.br/", "buscaLivro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.caelum.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscaLivroResponse }
     * 
     */
    public BuscaLivroResponse createBuscaLivroResponse() {
        return new BuscaLivroResponse();
    }

    /**
     * Create an instance of {@link BuscaLivro }
     * 
     */
    public BuscaLivro createBuscaLivro() {
        return new BuscaLivro();
    }

    /**
     * Create an instance of {@link Autor }
     * 
     */
    public Autor createAutor() {
        return new Autor();
    }

    /**
     * Create an instance of {@link Livro }
     * 
     */
    public Livro createLivro() {
        return new Livro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaLivroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.loja.caelum.com.br/", name = "buscaLivroResponse")
    public JAXBElement<BuscaLivroResponse> createBuscaLivroResponse(BuscaLivroResponse value) {
        return new JAXBElement<BuscaLivroResponse>(_BuscaLivroResponse_QNAME, BuscaLivroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaLivro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.loja.caelum.com.br/", name = "buscaLivro")
    public JAXBElement<BuscaLivro> createBuscaLivro(BuscaLivro value) {
        return new JAXBElement<BuscaLivro>(_BuscaLivro_QNAME, BuscaLivro.class, null, value);
    }

}
