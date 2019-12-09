
package com.stacktest.nextlab.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ReqPedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReqPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaPedido" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaEntrega" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Origen" type="{http://tempuri.org/}ReqOrigen" minOccurs="0"/>
 *         &lt;element name="Urgente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Paciente" type="{http://tempuri.org/}ReqPaciente" minOccurs="0"/>
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Provincia" type="{http://tempuri.org/}ReqProvincia" minOccurs="0"/>
 *         &lt;element name="Ciudad" type="{http://tempuri.org/}ReqCiudad" minOccurs="0"/>
 *         &lt;element name="Distrito" type="{http://tempuri.org/}ReqDistrito" minOccurs="0"/>
 *         &lt;element name="Barrio" type="{http://tempuri.org/}ReqBarrio" minOccurs="0"/>
 *         &lt;element name="Medico" type="{http://tempuri.org/}ReqMedico" minOccurs="0"/>
 *         &lt;element name="Servicio" type="{http://tempuri.org/}ReqServicio" minOccurs="0"/>
 *         &lt;element name="Unidad" type="{http://tempuri.org/}ReqUnidad" minOccurs="0"/>
 *         &lt;element name="Sala" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Piso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seguro" type="{http://tempuri.org/}ReqSeguro" minOccurs="0"/>
 *         &lt;element name="FechaReceta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NumeroCarnet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Diagnosticos" type="{http://tempuri.org/}ArrayOfReqDiagnostico" minOccurs="0"/>
 *         &lt;element name="Peticiones" type="{http://tempuri.org/}ArrayOfReqPeticion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReqPedido", propOrder = {
    "sucursal",
    "numero",
    "fechaPedido",
    "fechaEntrega",
    "origen",
    "urgente",
    "observacion",
    "paciente",
    "direccion",
    "codigoPostal",
    "provincia",
    "ciudad",
    "distrito",
    "barrio",
    "medico",
    "servicio",
    "unidad",
    "sala",
    "piso",
    "cama",
    "seguro",
    "fechaReceta",
    "numeroCarnet",
    "diagnosticos",
    "peticiones"
})
public class ReqPedido {

    @XmlElement(name = "Sucursal")
    protected String sucursal;
    @XmlElement(name = "Numero")
    protected String numero;
    @XmlElement(name = "FechaPedido", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPedido;
    @XmlElement(name = "FechaEntrega", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEntrega;
    @XmlElement(name = "Origen")
    protected ReqOrigen origen;
    @XmlElement(name = "Urgente")
    protected String urgente;
    @XmlElement(name = "Observacion")
    protected String observacion;
    @XmlElement(name = "Paciente")
    protected ReqPaciente paciente;
    @XmlElement(name = "Direccion")
    protected String direccion;
    @XmlElement(name = "CodigoPostal")
    protected String codigoPostal;
    @XmlElement(name = "Provincia")
    protected ReqProvincia provincia;
    @XmlElement(name = "Ciudad")
    protected ReqCiudad ciudad;
    @XmlElement(name = "Distrito")
    protected ReqDistrito distrito;
    @XmlElement(name = "Barrio")
    protected ReqBarrio barrio;
    @XmlElement(name = "Medico")
    protected ReqMedico medico;
    @XmlElement(name = "Servicio")
    protected ReqServicio servicio;
    @XmlElement(name = "Unidad")
    protected ReqUnidad unidad;
    @XmlElement(name = "Sala")
    protected String sala;
    @XmlElement(name = "Piso")
    protected String piso;
    @XmlElement(name = "Cama")
    protected String cama;
    @XmlElement(name = "Seguro")
    protected ReqSeguro seguro;
    @XmlElement(name = "FechaReceta", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaReceta;
    @XmlElement(name = "NumeroCarnet")
    protected String numeroCarnet;
    @XmlElement(name = "Diagnosticos")
    protected ArrayOfReqDiagnostico diagnosticos;
    @XmlElement(name = "Peticiones")
    protected ArrayOfReqPeticion peticiones;

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
     * Obtiene el valor de la propiedad fechaPedido.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaPedido() {
        return fechaPedido;
    }

    /**
     * Define el valor de la propiedad fechaPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaPedido(XMLGregorianCalendar value) {
        this.fechaPedido = value;
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
     * Obtiene el valor de la propiedad origen.
     * 
     * @return
     *     possible object is
     *     {@link ReqOrigen }
     *     
     */
    public ReqOrigen getOrigen() {
        return origen;
    }

    /**
     * Define el valor de la propiedad origen.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqOrigen }
     *     
     */
    public void setOrigen(ReqOrigen value) {
        this.origen = value;
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
     * Obtiene el valor de la propiedad observacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Define el valor de la propiedad observacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Obtiene el valor de la propiedad paciente.
     * 
     * @return
     *     possible object is
     *     {@link ReqPaciente }
     *     
     */
    public ReqPaciente getPaciente() {
        return paciente;
    }

    /**
     * Define el valor de la propiedad paciente.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqPaciente }
     *     
     */
    public void setPaciente(ReqPaciente value) {
        this.paciente = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostal(String value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link ReqProvincia }
     *     
     */
    public ReqProvincia getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqProvincia }
     *     
     */
    public void setProvincia(ReqProvincia value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link ReqCiudad }
     *     
     */
    public ReqCiudad getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqCiudad }
     *     
     */
    public void setCiudad(ReqCiudad value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad distrito.
     * 
     * @return
     *     possible object is
     *     {@link ReqDistrito }
     *     
     */
    public ReqDistrito getDistrito() {
        return distrito;
    }

    /**
     * Define el valor de la propiedad distrito.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqDistrito }
     *     
     */
    public void setDistrito(ReqDistrito value) {
        this.distrito = value;
    }

    /**
     * Obtiene el valor de la propiedad barrio.
     * 
     * @return
     *     possible object is
     *     {@link ReqBarrio }
     *     
     */
    public ReqBarrio getBarrio() {
        return barrio;
    }

    /**
     * Define el valor de la propiedad barrio.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqBarrio }
     *     
     */
    public void setBarrio(ReqBarrio value) {
        this.barrio = value;
    }

    /**
     * Obtiene el valor de la propiedad medico.
     * 
     * @return
     *     possible object is
     *     {@link ReqMedico }
     *     
     */
    public ReqMedico getMedico() {
        return medico;
    }

    /**
     * Define el valor de la propiedad medico.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqMedico }
     *     
     */
    public void setMedico(ReqMedico value) {
        this.medico = value;
    }

    /**
     * Obtiene el valor de la propiedad servicio.
     * 
     * @return
     *     possible object is
     *     {@link ReqServicio }
     *     
     */
    public ReqServicio getServicio() {
        return servicio;
    }

    /**
     * Define el valor de la propiedad servicio.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqServicio }
     *     
     */
    public void setServicio(ReqServicio value) {
        this.servicio = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad.
     * 
     * @return
     *     possible object is
     *     {@link ReqUnidad }
     *     
     */
    public ReqUnidad getUnidad() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqUnidad }
     *     
     */
    public void setUnidad(ReqUnidad value) {
        this.unidad = value;
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
     * Obtiene el valor de la propiedad seguro.
     * 
     * @return
     *     possible object is
     *     {@link ReqSeguro }
     *     
     */
    public ReqSeguro getSeguro() {
        return seguro;
    }

    /**
     * Define el valor de la propiedad seguro.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqSeguro }
     *     
     */
    public void setSeguro(ReqSeguro value) {
        this.seguro = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaReceta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaReceta() {
        return fechaReceta;
    }

    /**
     * Define el valor de la propiedad fechaReceta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaReceta(XMLGregorianCalendar value) {
        this.fechaReceta = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCarnet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCarnet() {
        return numeroCarnet;
    }

    /**
     * Define el valor de la propiedad numeroCarnet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCarnet(String value) {
        this.numeroCarnet = value;
    }

    /**
     * Obtiene el valor de la propiedad diagnosticos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReqDiagnostico }
     *     
     */
    public ArrayOfReqDiagnostico getDiagnosticos() {
        return diagnosticos;
    }

    /**
     * Define el valor de la propiedad diagnosticos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReqDiagnostico }
     *     
     */
    public void setDiagnosticos(ArrayOfReqDiagnostico value) {
        this.diagnosticos = value;
    }

    /**
     * Obtiene el valor de la propiedad peticiones.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReqPeticion }
     *     
     */
    public ArrayOfReqPeticion getPeticiones() {
        return peticiones;
    }

    /**
     * Define el valor de la propiedad peticiones.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReqPeticion }
     *     
     */
    public void setPeticiones(ArrayOfReqPeticion value) {
        this.peticiones = value;
    }

}
