//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.09.18 a las 09:55:08 PM COT 
//


package co.com.foundation.javeriana.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.foundation.javeriana.domain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PublishNotificationDomainEvent_QNAME = new QName("http://aes-pica-javeriana/enterprise-model/framework/domain-events/1.0.0", "PublishNotificationDomainEvent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.foundation.javeriana.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PublishNotificationDomainEvent }
     * 
     */
    public PublishNotificationDomainEvent createPublishNotificationDomainEvent() {
        return new PublishNotificationDomainEvent();
    }

    /**
     * Create an instance of {@link MessageHeaders }
     * 
     */
    public MessageHeaders createMessageHeaders() {
        return new MessageHeaders();
    }

    /**
     * Create an instance of {@link SMSNotification }
     * 
     */
    public SMSNotification createSMSNotification() {
        return new SMSNotification();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishNotificationDomainEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aes-pica-javeriana/enterprise-model/framework/domain-events/1.0.0", name = "PublishNotificationDomainEvent")
    public JAXBElement<PublishNotificationDomainEvent> createPublishNotificationDomainEvent(PublishNotificationDomainEvent value) {
        return new JAXBElement<PublishNotificationDomainEvent>(_PublishNotificationDomainEvent_QNAME, PublishNotificationDomainEvent.class, null, value);
    }

}
