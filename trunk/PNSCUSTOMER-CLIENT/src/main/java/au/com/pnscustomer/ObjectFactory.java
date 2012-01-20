
package au.com.pnscustomer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.pnscustomer package. 
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

    private final static QName _PNSCustomerRequestMessage_QNAME = new QName("http://www.specsavers.nl/pns/pns-customer-service/", "PNSCustomerRequestMessage");
    private final static QName _PNSCustomerResponseMessage_QNAME = new QName("http://www.specsavers.nl/pns/pns-customer-service/", "PNSCustomerResponseMessage");
    private final static QName _PNSCustomerFaultMessage_QNAME = new QName("http://www.specsavers.nl/pns/pns-customer-service/", "PNSCustomerFaultMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.pnscustomer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PNSCustomerRequest }
     * 
     */
    public PNSCustomerRequest createPNSCustomerRequest() {
        return new PNSCustomerRequest();
    }

    /**
     * Create an instance of {@link PNSCustomerFault }
     * 
     */
    public PNSCustomerFault createPNSCustomerFault() {
        return new PNSCustomerFault();
    }

    /**
     * Create an instance of {@link PNSCustomerResponse }
     * 
     */
    public PNSCustomerResponse createPNSCustomerResponse() {
        return new PNSCustomerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PNSCustomerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.specsavers.nl/pns/pns-customer-service/", name = "PNSCustomerRequestMessage")
    public JAXBElement<PNSCustomerRequest> createPNSCustomerRequestMessage(PNSCustomerRequest value) {
        return new JAXBElement<PNSCustomerRequest>(_PNSCustomerRequestMessage_QNAME, PNSCustomerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PNSCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.specsavers.nl/pns/pns-customer-service/", name = "PNSCustomerResponseMessage")
    public JAXBElement<PNSCustomerResponse> createPNSCustomerResponseMessage(PNSCustomerResponse value) {
        return new JAXBElement<PNSCustomerResponse>(_PNSCustomerResponseMessage_QNAME, PNSCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PNSCustomerFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.specsavers.nl/pns/pns-customer-service/", name = "PNSCustomerFaultMessage")
    public JAXBElement<PNSCustomerFault> createPNSCustomerFaultMessage(PNSCustomerFault value) {
        return new JAXBElement<PNSCustomerFault>(_PNSCustomerFaultMessage_QNAME, PNSCustomerFault.class, null, value);
    }

}
