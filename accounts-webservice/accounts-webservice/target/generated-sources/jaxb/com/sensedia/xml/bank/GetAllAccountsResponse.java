//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.2 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.11.29 às 09:44:42 AM BRT 
//


package com.sensedia.xml.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="list" type="{http://www.sensedia.com/xml/bank}LIST_TYPE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "list"
})
@XmlRootElement(name = "getAllAccountsResponse")
public class GetAllAccountsResponse {

    @XmlElement(required = true)
    protected LISTTYPE list;

    /**
     * Obtém o valor da propriedade list.
     * 
     * @return
     *     possible object is
     *     {@link LISTTYPE }
     *     
     */
    public LISTTYPE getList() {
        return list;
    }

    /**
     * Define o valor da propriedade list.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTTYPE }
     *     
     */
    public void setList(LISTTYPE value) {
        this.list = value;
    }

}
