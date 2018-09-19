//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.09.18 a las 09:55:08 PM COT 
//


package co.com.foundation.javeriana.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PublishNotificationDomainEvent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PublishNotificationDomainEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://aes-pica-javeriana/enterprise-model/framework/common-artifacts/1.0.0}MessageHeaders"/>
 *         &lt;element name="notification" type="{http://aes-pica-javeriana/enterprise-model/framework/entities/1.0.0}SMSNotification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishNotificationDomainEvent", namespace = "http://aes-pica-javeriana/enterprise-model/framework/domain-events/1.0.0", propOrder = {
    "header",
    "notification"
})
public class PublishNotificationDomainEvent {

    @XmlElement(required = true)
    protected MessageHeaders header;
    protected List<SMSNotification> notification;

    /**
     * Obtiene el valor de la propiedad header.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaders }
     *     
     */
    public MessageHeaders getHeader() {
        return header;
    }

    /**
     * Define el valor de la propiedad header.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaders }
     *     
     */
    public void setHeader(MessageHeaders value) {
        this.header = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SMSNotification }
     * 
     * 
     */
    public List<SMSNotification> getNotification() {
        if (notification == null) {
            notification = new ArrayList<SMSNotification>();
        }
        return this.notification;
    }

}
