
package org.datacontract.schemas._2004._07.dataobjects_admin;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.dataobjects.OrderType;


/**
 * <p>Java class for DeliverOrderResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliverOrderResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeliveredAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DeliveryReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OrderType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}OrderType"/>
 *         &lt;element name="SveaOrderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliverOrderResult", propOrder = {
    "clientId",
    "deliveredAmount",
    "deliveryReferenceNumber",
    "orderType",
    "sveaOrderId"
})
public class DeliverOrderResult {

    @XmlElement(name = "ClientId")
    protected long clientId;
    @XmlElement(name = "DeliveredAmount", required = true)
    protected BigDecimal deliveredAmount;
    @XmlElement(name = "DeliveryReferenceNumber")
    protected long deliveryReferenceNumber;
    @XmlElement(name = "OrderType", required = true)
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
     * Gets the value of the deliveredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeliveredAmount() {
        return deliveredAmount;
    }

    /**
     * Sets the value of the deliveredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeliveredAmount(BigDecimal value) {
        this.deliveredAmount = value;
    }

    /**
     * Gets the value of the deliveryReferenceNumber property.
     * 
     */
    public long getDeliveryReferenceNumber() {
        return deliveryReferenceNumber;
    }

    /**
     * Sets the value of the deliveryReferenceNumber property.
     * 
     */
    public void setDeliveryReferenceNumber(long value) {
        this.deliveryReferenceNumber = value;
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
