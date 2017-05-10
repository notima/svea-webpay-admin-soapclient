
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.dataobjects.OrderType;


/**
 * <p>Java class for UpdateOrderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOrderRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest">
 *       &lt;sequence>
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ClientOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}OrderType" minOccurs="0"/>
 *         &lt;element name="SveaOrderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOrderRequest", propOrder = {
    "clientId",
    "clientOrderNumber",
    "notes",
    "orderType",
    "sveaOrderId"
})
public class UpdateOrderRequest
    extends BasicRequest
{

    @XmlElement(name = "ClientId")
    protected long clientId;
    @XmlElement(name = "ClientOrderNumber", nillable = true)
    protected String clientOrderNumber;
    @XmlElement(name = "Notes", nillable = true)
    protected String notes;
    @XmlElement(name = "OrderType")
    protected OrderType orderType;
    @XmlElement(name = "SveaOrderId")
    protected long sveaOrderId;

    /**
     * Gets the value of the clientId property.
     * 
     */
    public long getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     */
    public void setClientId(long value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the clientOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientOrderNumber() {
        return clientOrderNumber;
    }

    /**
     * Sets the value of the clientOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientOrderNumber(String value) {
        this.clientOrderNumber = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrderType(OrderType value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the sveaOrderId property.
     * 
     */
    public long getSveaOrderId() {
        return sveaOrderId;
    }

    /**
     * Sets the value of the sveaOrderId property.
     * 
     */
    public void setSveaOrderId(long value) {
        this.sveaOrderId = value;
    }

}
