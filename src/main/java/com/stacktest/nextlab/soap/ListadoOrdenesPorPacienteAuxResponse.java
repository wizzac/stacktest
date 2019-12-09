
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
 *         &lt;element name="ListadoOrdenesPorPacienteAuxResult" type="{http://tempuri.org/}ResponseListadoOrdenes" minOccurs="0"/>
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
    "listadoOrdenesPorPacienteAuxResult"
})
@XmlRootElement(name = "ListadoOrdenesPorPacienteAuxResponse")
public class ListadoOrdenesPorPacienteAuxResponse {

    @XmlElement(name = "ListadoOrdenesPorPacienteAuxResult")
    protected ResponseListadoOrdenes listadoOrdenesPorPacienteAuxResult;

    /**
     * Obtiene el valor de la propiedad listadoOrdenesPorPacienteAuxResult.
     * 
     * @return
     *     possible object is
     *     {@link ResponseListadoOrdenes }
     *     
     */
    public ResponseListadoOrdenes getListadoOrdenesPorPacienteAuxResult() {
        return listadoOrdenesPorPacienteAuxResult;
    }

    /**
     * Define el valor de la propiedad listadoOrdenesPorPacienteAuxResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseListadoOrdenes }
     *     
     */
    public void setListadoOrdenesPorPacienteAuxResult(ResponseListadoOrdenes value) {
        this.listadoOrdenesPorPacienteAuxResult = value;
    }

}
