
package br.com.caelum.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculaParcela complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculaParcela">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valorTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="quantidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculaParcela", propOrder = {
    "valorTotal",
    "quantidade"
})
public class CalculaParcela {

    protected double valorTotal;
    protected int quantidade;

    /**
     * Gets the value of the valorTotal property.
     * 
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * Sets the value of the valorTotal property.
     * 
     */
    public void setValorTotal(double value) {
        this.valorTotal = value;
    }

    /**
     * Gets the value of the quantidade property.
     * 
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Sets the value of the quantidade property.
     * 
     */
    public void setQuantidade(int value) {
        this.quantidade = value;
    }

}
