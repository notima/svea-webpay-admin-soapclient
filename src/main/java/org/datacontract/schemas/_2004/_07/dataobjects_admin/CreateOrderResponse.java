
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.dataobjects_webservice.CreateOrderResult;


/**
 * <p>Java class for CreateOrderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOrderResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse">
 *       &lt;sequence>
 *         &lt;element name="OrderResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder}CreateOrderResult" minOccurs="0"/>
 *         &lt;element name="OrderRows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfNumberedOrderRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOrderResponse", propOrder = {
    "orderResult",
    "orderRows"
})
public class CreateOrderResponse
    extends BasicResponse
{

    @XmlElement(name = "OrderResult", nillable = true)
    protected CreateOrderResult orderResult;
    @XmlElement(name = "OrderRows", nillable = true)
    protected ArrayOfNumberedOrderRow orderRows;

    /**
     * Gets the value of the orderResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOrderResult }
     *     
     */
    public CreateOrderResult getOrderResult() {
        return orderResult;
    }

    /**
     * Sets the value of the orderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOrderResult }
     *     
     */
    public void setOrderResult(CreateOrderResult value) {
        this.orderResult = value;
    }

    /**
     * Gets the value of the orderRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNumberedOrderRow }
     *     
     */
    public ArrayOfNumberedOrderRow getOrderRows() {
        return orderRows;
    }

    /**
     * Sets the value of the orderRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNumberedOrderRow }
     *     
     */
    public void setOrderRows(ArrayOfNumberedOrderRow value) {
        this.orderRows = value;
    }

}
