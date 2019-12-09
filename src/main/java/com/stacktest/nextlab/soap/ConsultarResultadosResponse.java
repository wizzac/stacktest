
package com.stacktest.nextlab.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultarResultadosResult" type="{http://tempuri.org/}ResponseConsultarResultados" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultarResultadosResult"
})
@XmlRootElement(name = "ConsultarResultadosResponse")
public class ConsultarResultadosResponse {

    @XmlElement(name = "ConsultarResultadosResult")
    protected ResponseConsultarResultados consultarResultadosResult;

    /**
     * Obtiene el valor de la propiedad consultarResultadosResult.
     * 
     * @return
     *     possible object is
     *     {@link ResponseConsultarResultados }
     *     
     */
    public ResponseConsultarResultados getConsultarResultadosResult() {
        return consultarResultadosResult;
    }

    /**
     * Define el valor de la propiedad consultarResultadosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseConsultarResultados }
     *     
     */
    public void setConsultarResultadosResult(ResponseConsultarResultados value) {
        this.consultarResultadosResult = value;
    }

}
