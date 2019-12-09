
package com.stacktest.nextlab.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfResAnalisis complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResAnalisis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResAnalisis" type="{http://tempuri.org/}ResAnalisis" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResAnalisis", propOrder = {
    "resAnalisis"
})
public class ArrayOfResAnalisis {

    @XmlElement(name = "ResAnalisis", nillable = true)
    protected List<ResAnalisis> resAnalisis;

    /**
     * Gets the value of the resAnalisis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resAnalisis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResAnalisis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResAnalisis }
     * 
     * 
     */
    public List<ResAnalisis> getResAnalisis() {
        if (resAnalisis == null) {
            resAnalisis = new ArrayList<ResAnalisis>();
        }
        return this.resAnalisis;
    }

}
