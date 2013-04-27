
package br.com.caelum.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.caelum.cliente package. 
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

    private final static QName _CalculaParcelaResponse_QNAME = new QName("http://webservices.caelum.com.br/", "calculaParcelaResponse");
    private final static QName _CalculaParcela_QNAME = new QName("http://webservices.caelum.com.br/", "calculaParcela");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.caelum.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculaParcela }
     * 
     */
    public CalculaParcela createCalculaParcela() {
        return new CalculaParcela();
    }

    /**
     * Create an instance of {@link CalculaParcelaResponse }
     * 
     */
    public CalculaParcelaResponse createCalculaParcelaResponse() {
        return new CalculaParcelaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaParcelaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.caelum.com.br/", name = "calculaParcelaResponse")
    public JAXBElement<CalculaParcelaResponse> createCalculaParcelaResponse(CalculaParcelaResponse value) {
        return new JAXBElement<CalculaParcelaResponse>(_CalculaParcelaResponse_QNAME, CalculaParcelaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaParcela }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.caelum.com.br/", name = "calculaParcela")
    public JAXBElement<CalculaParcela> createCalculaParcela(CalculaParcela value) {
        return new JAXBElement<CalculaParcela>(_CalculaParcela_QNAME, CalculaParcela.class, null, value);
    }

}
