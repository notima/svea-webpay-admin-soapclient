
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOrdersRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOrdersRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest">
 *       &lt;sequence>
 *         &lt;element name="OrdersToRetrieve" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfGetOrderInformation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrdersRequest", propOrder = {
    "ordersToRetrieve"
})
public class GetOrdersRequest
    extends BasicRequest
{

    @XmlElement(name = "OrdersToRetrieve", required = true, nillable = true)
    protected ArrayOfGetOrderInformation ordersToRetrieve;

    /**
     * Gets the value of the ordersToRetrieve property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGetOrderInformation }
     *     
     */
    public ArrayOfGetOrderInformation getOrdersToRetrieve() {
        return ordersToRetrieve;
    }

    /**
     * Sets the value of the ordersToRetrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGetOrderInformation }
     *     
     */
    public void setOrdersToRetrieve(ArrayOfGetOrderInformation value) {
        this.ordersToRetrieve = value;
    }

}
