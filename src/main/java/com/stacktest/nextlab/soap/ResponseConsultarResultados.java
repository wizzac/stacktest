
package com.stacktest.nextlab.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponseConsultarResultados complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponseConsultarResultados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Analisis" type="{http://tempuri.org/}ArrayOfResAnalisis" minOccurs="0"/>
 *         &lt;element name="Pdf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ResponseConsultarResultados", propOrder = {
    "sucursal",
    "numero",
    "analisis",
    "pdf",
    "respuesta"
})
public class ResponseConsultarResultados {

    @XmlElement(name = "Sucursal")
    protected String sucursal;
    @XmlElement(name = "Numero")
    protected String numero;
    @XmlElement(name = "Analisis")
    protected ArrayOfResAnalisis analisis;
    @XmlElement(name = "Pdf")
    protected String pdf;
    @XmlElement(name = "Respuesta")
    protected ResponseRespuesta respuesta;

    /**
     * Obtiene el valor de la propiedad sucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSucursal() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSucursal(String value) {
        this.sucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad analisis.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResAnalisis }
     *     
     */
    public ArrayOfResAnalisis getAnalisis() {
        return analisis;
    }

    /**
     * Define el valor de la propiedad analisis.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResAnalisis }
     *     
     */
    public void setAnalisis(ArrayOfResAnalisis value) {
        this.analisis = value;
    }

    /**
     * Obtiene el valor de la propiedad pdf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdf() {
        return pdf;
    }

    /**
     * Define el valor de la propiedad pdf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdf(String value) {
        this.pdf = value;
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
