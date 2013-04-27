
package br.com.caelum.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for livro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="livro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autores" type="{http://session.loja.caelum.com.br/}autor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataAlterada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preco" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "livro", propOrder = {
    "autores",
    "dataAlterada",
    "id",
    "nome",
    "preco"
})
public class Livro {

    @XmlElement(nillable = true)
    protected List<Autor> autores;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAlterada;
    protected Long id;
    protected String nome;
    protected double preco;

    /**
     * Gets the value of the autores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Autor }
     * 
     * 
     */
    public List<Autor> getAutores() {
        if (autores == null) {
            autores = new ArrayList<Autor>();
        }
        return this.autores;
    }

    /**
     * Gets the value of the dataAlterada property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAlterada() {
        return dataAlterada;
    }

    /**
     * Sets the value of the dataAlterada property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAlterada(XMLGregorianCalendar value) {
        this.dataAlterada = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the preco property.
     * 
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Sets the value of the preco property.
     * 
     */
    public void setPreco(double value) {
        this.preco = value;
    }

}
