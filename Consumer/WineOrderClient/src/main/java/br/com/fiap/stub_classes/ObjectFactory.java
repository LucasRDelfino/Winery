
package br.com.fiap.stub_classes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.fiap.stub_classes package. 
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

    private final static QName _SendWarn_QNAME = new QName("http://winery.fiap.com.br/", "sendWarn");
    private final static QName _SendWarnResponse_QNAME = new QName("http://winery.fiap.com.br/", "sendWarnResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.fiap.stub_classes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendWarn }
     * 
     */
    public SendWarn createSendWarn() {
        return new SendWarn();
    }

    /**
     * Create an instance of {@link SendWarnResponse }
     * 
     */
    public SendWarnResponse createSendWarnResponse() {
        return new SendWarnResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendWarn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendWarn }{@code >}
     */
    @XmlElementDecl(namespace = "http://winery.fiap.com.br/", name = "sendWarn")
    public JAXBElement<SendWarn> createSendWarn(SendWarn value) {
        return new JAXBElement<SendWarn>(_SendWarn_QNAME, SendWarn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendWarnResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendWarnResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://winery.fiap.com.br/", name = "sendWarnResponse")
    public JAXBElement<SendWarnResponse> createSendWarnResponse(SendWarnResponse value) {
        return new JAXBElement<SendWarnResponse>(_SendWarnResponse_QNAME, SendWarnResponse.class, null, value);
    }

}
