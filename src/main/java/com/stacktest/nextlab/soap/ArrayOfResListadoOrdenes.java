
package com.stacktest.nextlab.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfResListadoOrdenes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResListadoOrdenes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResListadoOrdenes" type="{http://tempuri.org/}ResListadoOrdenes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResListadoOrdenes", propOrder = {
    "resListadoOrdenes"
})
public class ArrayOfResListadoOrdenes {

    @XmlElement(name = "ResListadoOrdenes", nillable = true)
    protected List<ResListadoOrdenes> resListadoOrdenes;

    /**
     * Gets the value of the resListadoOrdenes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resListadoOrdenes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResListadoOrdenes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResListadoOrdenes }
     * 
     * 
     */
    public List<ResListadoOrdenes> getResListadoOrdenes() {
        if (resListadoOrdenes == null) {
            resListadoOrdenes = new ArrayList<ResListadoOrdenes>();
        }
        return this.resListadoOrdenes;
    }

}
