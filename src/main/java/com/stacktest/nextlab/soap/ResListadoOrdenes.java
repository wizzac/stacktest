
package com.stacktest.nextlab.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ResListadoOrdenes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResListadoOrdenes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaOrden" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaEntrega" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaEntregaParcial" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Paciente" type="{http://tempuri.org/}ResPaciente" minOccurs="0"/>
 *         &lt;element name="Cama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Piso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sala" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreMedico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescripcionServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescripcionOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenciaExterna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescripcionUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescripcionSeguro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescripcionPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Carnet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Urgente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoEnviarEmailPac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResListadoOrdenes", propOrder = {
    "sucursal",
    "numero",
    "fechaOrden",
    "fechaEntrega",
    "fechaEntregaParcial",
    "paciente",
    "cama",
    "piso",
    "sala",
    "nombreMedico",
    "descripcionServicio",
    "descripcionOrigen",
    "referenciaExterna",
    "descripcionUnidad",
    "descripcionSeguro",
    "descripcionPlan",
    "carnet",
    "urgente",
    "usuario",
    "estado",
    "noEnviarEmailPac"
})
public class ResListadoOrdenes {

    @XmlElement(name = "Sucursal")
    protected String sucursal;
    @XmlElement(name = "Numero")
    protected String numero;
    @XmlElement(name = "FechaOrden", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaOrden;
    @XmlElement(name = "FechaEntrega", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEntrega;
    @XmlElement(name = "FechaEntregaParcial", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEntregaParcial;
    @XmlElement(name = "Paciente")
    protected ResPaciente paciente;
    @XmlElement(name = "Cama")
    protected String cama;
    @XmlElement(name = "Piso")
    protected String piso;
    @XmlElement(name = "Sala")
    protected String sala;
    @XmlElement(name = "NombreMedico")
    protected String nombreMedico;
    @XmlElement(name = "DescripcionServicio")
    protected String descripcionServicio;
    @XmlElement(name = "DescripcionOrigen")
    protected String descripcionOrigen;
    @XmlElement(name = "ReferenciaExterna")
    protected String referenciaExterna;
    @XmlElement(name = "DescripcionUnidad")
    protected String descripcionUnidad;
    @XmlElement(name = "DescripcionSeguro")
    protected String descripcionSeguro;
    @XmlElement(name = "DescripcionPlan")
    protected String descripcionPlan;
    @XmlElement(name = "Carnet")
    protected String carnet;
    @XmlElement(name = "Urgente")
    protected String urgente;
    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "NoEnviarEmailPac")
    protected String noEnviarEmailPac;

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
     * Obtiene el valor de la propiedad fechaOrden.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaOrden() {
        return fechaOrden;
    }

    /**
     * Define el valor de la propiedad fechaOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaOrden(XMLGregorianCalendar value) {
        this.fechaOrden = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEntrega.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Define el valor de la propiedad fechaEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEntrega(XMLGregorianCalendar value) {
        this.fechaEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEntregaParcial.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEntregaParcial() {
        return fechaEntregaParcial;
    }

    /**
     * Define el valor de la propiedad fechaEntregaParcial.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEntregaParcial(XMLGregorianCalendar value) {
        this.fechaEntregaParcial = value;
    }

    /**
     * Obtiene el valor de la propiedad paciente.
     * 
     * @return
     *     possible object is
     *     {@link ResPaciente }
     *     
     */
    public ResPaciente getPaciente() {
        return paciente;
    }

    /**
     * Define el valor de la propiedad paciente.
     * 
     * @param value
     *     allowed object is
     *     {@link ResPaciente }
     *     
     */
    public void setPaciente(ResPaciente value) {
        this.paciente = value;
    }

    /**
     * Obtiene el valor de la propiedad cama.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCama() {
        return cama;
    }

    /**
     * Define el valor de la propiedad cama.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCama(String value) {
        this.cama = value;
    }

    /**
     * Obtiene el valor de la propiedad piso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiso() {
        return piso;
    }

    /**
     * Define el valor de la propiedad piso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiso(String value) {
        this.piso = value;
    }

    /**
     * Obtiene el valor de la propiedad sala.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSala() {
        return sala;
    }

    /**
     * Define el valor de la propiedad sala.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSala(String value) {
        this.sala = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreMedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMedico() {
        return nombreMedico;
    }

    /**
     * Define el valor de la propiedad nombreMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMedico(String value) {
        this.nombreMedico = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    /**
     * Define el valor de la propiedad descripcionServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionServicio(String value) {
        this.descripcionServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionOrigen() {
        return descripcionOrigen;
    }

    /**
     * Define el valor de la propiedad descripcionOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionOrigen(String value) {
        this.descripcionOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaExterna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaExterna() {
        return referenciaExterna;
    }

    /**
     * Define el valor de la propiedad referenciaExterna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaExterna(String value) {
        this.referenciaExterna = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionUnidad() {
        return descripcionUnidad;
    }

    /**
     * Define el valor de la propiedad descripcionUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionUnidad(String value) {
        this.descripcionUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionSeguro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionSeguro() {
        return descripcionSeguro;
    }

    /**
     * Define el valor de la propiedad descripcionSeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionSeguro(String value) {
        this.descripcionSeguro = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionPlan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionPlan() {
        return descripcionPlan;
    }

    /**
     * Define el valor de la propiedad descripcionPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionPlan(String value) {
        this.descripcionPlan = value;
    }

    /**
     * Obtiene el valor de la propiedad carnet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * Define el valor de la propiedad carnet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarnet(String value) {
        this.carnet = value;
    }

    /**
     * Obtiene el valor de la propiedad urgente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrgente() {
        return urgente;
    }

    /**
     * Define el valor de la propiedad urgente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrgente(String value) {
        this.urgente = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad noEnviarEmailPac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoEnviarEmailPac() {
        return noEnviarEmailPac;
    }

    /**
     * Define el valor de la propiedad noEnviarEmailPac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoEnviarEmailPac(String value) {
        this.noEnviarEmailPac = value;
    }

}
