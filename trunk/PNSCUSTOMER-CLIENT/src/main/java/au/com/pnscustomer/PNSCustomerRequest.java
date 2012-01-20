
package au.com.pnscustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PNSCustomerRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNSCustomerRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestTag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="screeningTag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="screeningStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="screeningData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNSCustomerRequest", propOrder = {
    "timestamp",
    "sender",
    "requestTag",
    "screeningTag",
    "screeningStatus",
    "customerData",
    "screeningData"
})
public class PNSCustomerRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(required = true)
    protected String sender;
    @XmlElement(required = true)
    protected String requestTag;
    @XmlElement(required = true)
    protected String screeningTag;
    @XmlElement(required = true)
    protected String screeningStatus;
    @XmlElement(required = true)
    protected String customerData;
    @XmlElement(required = true)
    protected String screeningData;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the requestTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTag() {
        return requestTag;
    }

    /**
     * Sets the value of the requestTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTag(String value) {
        this.requestTag = value;
    }

    /**
     * Gets the value of the screeningTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreeningTag() {
        return screeningTag;
    }

    /**
     * Sets the value of the screeningTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreeningTag(String value) {
        this.screeningTag = value;
    }

    /**
     * Gets the value of the screeningStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreeningStatus() {
        return screeningStatus;
    }

    /**
     * Sets the value of the screeningStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreeningStatus(String value) {
        this.screeningStatus = value;
    }

    /**
     * Gets the value of the customerData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerData() {
        return customerData;
    }

    /**
     * Sets the value of the customerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerData(String value) {
        this.customerData = value;
    }

    /**
     * Gets the value of the screeningData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreeningData() {
        return screeningData;
    }

    /**
     * Sets the value of the screeningData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreeningData(String value) {
        this.screeningData = value;
    }

}
