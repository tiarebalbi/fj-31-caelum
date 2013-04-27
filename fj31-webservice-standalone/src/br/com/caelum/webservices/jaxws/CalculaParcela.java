
package br.com.caelum.webservices.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "calculaParcela", namespace = "http://webservices.caelum.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculaParcela", namespace = "http://webservices.caelum.com.br/", propOrder = {
    "valorTotal",
    "quantidade"
})
public class CalculaParcela {

    @XmlElement(name = "valorTotal", namespace = "")
    private double valorTotal;
    @XmlElement(name = "quantidade", namespace = "")
    private int quantidade;

    /**
     * 
     * @return
     *     returns double
     */
    public double getValorTotal() {
        return this.valorTotal;
    }

    /**
     * 
     * @param valorTotal
     *     the value for the valorTotal property
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getQuantidade() {
        return this.quantidade;
    }

    /**
     * 
     * @param quantidade
     *     the value for the quantidade property
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
