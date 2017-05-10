
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.dataobjects_webservice.InvoiceDistributionType;


/**
 * <p>Java class for DeliveryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest">
 *       &lt;sequence>
 *         &lt;element name="InvoiceDistributionType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice.DeliverOrder}InvoiceDistributionType"/>
 *         &lt;element name="OrdersToDeliver" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfDeliverOrderInformation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryRequest", propOrder = {
    "invoiceDistributionType",
    "ordersToDeliver"
})
public class DeliveryRequest
    extends BasicRequest
{

    @XmlElement(name = "InvoiceDistributionType", required = true)
    protected InvoiceDistributionType invoiceDistributionType;
    @XmlElement(name = "OrdersToDeliver", required = true, nillable = true)
    protected ArrayOfDeliverOrderInformation ordersToDeliver;

    /**
     * Gets the value of the invoiceDistributionType property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDistributionType }
     *     
     */
    public InvoiceDistributionType getInvoiceDistributionType() {
        return invoiceDistributionType;
    }

    /**
     * Sets the value of the invoiceDistributionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDistributionType }
     *     
     */
    public void setInvoiceDistributionType(InvoiceDistributionType value) {
        this.invoiceDistributionType = value;
    }

    /**
     * Gets the value of the ordersToDeliver property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeliverOrderInformation }
     *     
     */
    public ArrayOfDeliverOrderInformation getOrdersToDeliver() {
        return ordersToDeliver;
    }

    /**
     * Sets the value of the ordersToDeliver property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeliverOrderInformation }
     *     
     */
    public void setOrdersToDeliver(ArrayOfDeliverOrderInformation value) {
        this.ordersToDeliver = value;
    }

}
