
package com.stacktest.nextlab.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfResponseResultados complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResponseResultados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseResultados" type="{http://tempuri.org/}ResponseResultados" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResponseResultados", propOrder = {
    "responseResultados"
})
public class ArrayOfResponseResultados {

    @XmlElement(name = "ResponseResultados", nillable = true)
    protected List<ResponseResultados> responseResultados;

    /**
     * Gets the value of the responseResultados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseResultados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseResultados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseResultados }
     * 
     * 
     */
    public List<ResponseResultados> getResponseResultados() {
        if (responseResultados == null) {
            responseResultados = new ArrayList<ResponseResultados>();
        }
        return this.responseResultados;
    }

}
