
package com.empresa.proyecto.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="digitosRut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="verificadorRut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rut", propOrder = {
    "digitosRut",
    "verificadorRut"
})
public class Rut {

    protected int digitosRut;
    protected int verificadorRut;

    /**
     * Obtiene el valor de la propiedad digitosRut.
     * 
     */
    public int getDigitosRut() {
        return digitosRut;
    }

    /**
     * Define el valor de la propiedad digitosRut.
     * 
     */
    public void setDigitosRut(int value) {
        this.digitosRut = value;
    }

    /**
     * Obtiene el valor de la propiedad verificadorRut.
     * 
     */
    public int getVerificadorRut() {
        return verificadorRut;
    }

    /**
     * Define el valor de la propiedad verificadorRut.
     * 
     */
    public void setVerificadorRut(int value) {
        this.verificadorRut = value;
    }

}
