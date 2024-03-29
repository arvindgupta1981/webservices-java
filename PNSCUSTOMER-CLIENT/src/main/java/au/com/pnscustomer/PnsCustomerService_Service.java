
package au.com.pnscustomer;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "pns-customer-service", targetNamespace = "http://www.specsavers.nl/pns/pns-customer-service/", wsdlLocation = "file:/home/ram.singh/ProjectRoot/PNSCUSTOMER-CLIENT/src/main/resources/pns-customer.wsdl")
public class PnsCustomerService_Service
    extends Service
{

    private final static URL PNSCUSTOMERSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(au.com.pnscustomer.PnsCustomerService_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = au.com.pnscustomer.PnsCustomerService_Service.class.getResource(".");
            url = new URL(baseUrl, "file:/home/ram.singh/ProjectRoot/PNSCUSTOMER-CLIENT/src/main/resources/pns-customer.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/home/ram.singh/ProjectRoot/PNSCUSTOMER-CLIENT/src/main/resources/pns-customer.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PNSCUSTOMERSERVICE_WSDL_LOCATION = url;
    }

    public PnsCustomerService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PnsCustomerService_Service() {
        super(PNSCUSTOMERSERVICE_WSDL_LOCATION, new QName("http://www.specsavers.nl/pns/pns-customer-service/", "pns-customer-service"));
    }

    /**
     * 
     * @return
     *     returns PnsCustomerService
     */
    @WebEndpoint(name = "pns-customer-serviceSOAP")
    public PnsCustomerService getPnsCustomerServiceSOAP() {
        return super.getPort(new QName("http://www.specsavers.nl/pns/pns-customer-service/", "pns-customer-serviceSOAP"), PnsCustomerService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PnsCustomerService
     */
    @WebEndpoint(name = "pns-customer-serviceSOAP")
    public PnsCustomerService getPnsCustomerServiceSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.specsavers.nl/pns/pns-customer-service/", "pns-customer-serviceSOAP"), PnsCustomerService.class, features);
    }

}
