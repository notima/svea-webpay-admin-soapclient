
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.dataobjects.OrderType;


/**
 * <p>Java class for UpdateOrderRowsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOrderRowsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest">
 *       &lt;sequence>
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OrderType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}OrderType" minOccurs="0"/>
 *         &lt;element name="SveaOrderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UpdatedOrderRows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfNumberedOrderRow"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOrderRowsRequest", propOrder = {
    "clientId",
    "orderType",
    "sveaOrderId",
    "updatedOrderRows"
})
public class UpdateOrderRowsRequest
    extends BasicRequest
{

    @XmlElement(name = "ClientId")
    protected long clientId;
    @XmlElement(name = "OrderType")
    protected OrderType orderType;
    @XmlElement(name = "SveaOrderId")
    protected long sveaOrderId;
    @XmlElement(name = "UpdatedOrderRows", required = true, nillable = true)
    protected ArrayOfNumberedOrderRow updatedOrderRows;

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

    /**
     * Gets the value of the updatedOrderRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNumberedOrderRow }
     *     
     */
    public ArrayOfNumberedOrderRow getUpdatedOrderRows() {
        return updatedOrderRows;
    }

    /**
     * Sets the value of the updatedOrderRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNumberedOrderRow }
     *     
     */
    public void setUpdatedOrderRows(ArrayOfNumberedOrderRow value) {
        this.updatedOrderRows = value;
    }

}
