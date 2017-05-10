
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse">
 *       &lt;sequence>
 *         &lt;element name="OrdersDelivered" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfDeliverOrderResult"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryResponse", propOrder = {
    "ordersDelivered"
})
public class DeliveryResponse
    extends BasicResponse
{

    @XmlElement(name = "OrdersDelivered", required = true, nillable = true)
    protected ArrayOfDeliverOrderResult ordersDelivered;

    /**
     * Gets the value of the ordersDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeliverOrderResult }
     *     
     */
    public ArrayOfDeliverOrderResult getOrdersDelivered() {
        return ordersDelivered;
    }

    /**
     * Sets the value of the ordersDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeliverOrderResult }
     *     
     */
    public void setOrdersDelivered(ArrayOfDeliverOrderResult value) {
        this.ordersDelivered = value;
    }

}
