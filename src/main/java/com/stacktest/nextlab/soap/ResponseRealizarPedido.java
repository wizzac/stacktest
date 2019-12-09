
package com.stacktest.nextlab.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponseRealizarPedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponseRealizarPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroOrden" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Etiquetas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ResponseRealizarPedido", propOrder = {
    "numeroOrden",
    "etiquetas",
    "respuesta"
})
public class ResponseRealizarPedido {

    @XmlElement(name = "NumeroOrden")
    protected int numeroOrden;
    @XmlElement(name = "Etiquetas")
    protected String etiquetas;
    @XmlElement(name = "Respuesta")
    protected ResponseRespuesta respuesta;

    /**
     * Obtiene el valor de la propiedad numeroOrden.
     * 
     */
    public int getNumeroOrden() {
        return numeroOrden;
    }

    /**
     * Define el valor de la propiedad numeroOrden.
     * 
     */
    public void setNumeroOrden(int value) {
        this.numeroOrden = value;
    }

    /**
     * Obtiene el valor de la propiedad etiquetas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtiquetas() {
        return etiquetas;
    }

    /**
     * Define el valor de la propiedad etiquetas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtiquetas(String value) {
        this.etiquetas = value;
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
