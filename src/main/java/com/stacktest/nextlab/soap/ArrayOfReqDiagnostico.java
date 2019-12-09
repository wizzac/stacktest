
package com.stacktest.nextlab.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfReqDiagnostico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReqDiagnostico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReqDiagnostico" type="{http://tempuri.org/}ReqDiagnostico" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReqDiagnostico", propOrder = {
    "reqDiagnostico"
})
public class ArrayOfReqDiagnostico {

    @XmlElement(name = "ReqDiagnostico", nillable = true)
    protected List<ReqDiagnostico> reqDiagnostico;

    /**
     * Gets the value of the reqDiagnostico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqDiagnostico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqDiagnostico().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReqDiagnostico }
     * 
     * 
     */
    public List<ReqDiagnostico> getReqDiagnostico() {
        if (reqDiagnostico == null) {
            reqDiagnostico = new ArrayList<ReqDiagnostico>();
        }
        return this.reqDiagnostico;
    }

}
