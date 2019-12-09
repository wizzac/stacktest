
package com.stacktest.nextlab.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponseListadoOrdenes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponseListadoOrdenes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ordenes" type="{http://tempuri.org/}ArrayOfResListadoOrdenes" minOccurs="0"/>
 *         &lt;element name="Respuesta" type="{http://tempuri.org/}ResponseRespuesta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseListadoOrdenes", propOrder = {
    "ordenes",
    "respuesta"
})
public class ResponseListadoOrdenes {

    @XmlElement(name = "Ordenes")
    protected ArrayOfResListadoOrdenes ordenes;
    @XmlElement(name = "Respuesta")
    protected ResponseRespuesta respuesta;

    /**
     * Obtiene el valor de la propiedad ordenes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResListadoOrdenes }
     *     
     */
    public ArrayOfResListadoOrdenes getOrdenes() {
        return ordenes;
    }

    /**
     * Define el valor de la propiedad ordenes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResListadoOrdenes }
     *     
     */
    public void setOrdenes(ArrayOfResListadoOrdenes value) {
        this.ordenes = value;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link ResponseRespuesta }
     *     
     */
    public ResponseRespuesta getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseRespuesta }
     *     
     */
    public void setRespuesta(ResponseRespuesta value) {
        this.respuesta = value;
    }

}
