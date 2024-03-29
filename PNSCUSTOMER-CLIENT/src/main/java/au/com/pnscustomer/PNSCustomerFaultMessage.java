
package au.com.pnscustomer;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "PNSCustomerFaultMessage", targetNamespace = "http://www.specsavers.nl/pns/pns-customer-service/")
public class PNSCustomerFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private PNSCustomerFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public PNSCustomerFaultMessage(String message, PNSCustomerFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param message
     * @param cause
     */
    public PNSCustomerFaultMessage(String message, PNSCustomerFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: au.com.pnscustomer.PNSCustomerFault
     */
    public PNSCustomerFault getFaultInfo() {
        return faultInfo;
    }

}
