
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import org.datacontract.schemas._2004._07.dataobjects_webservice.InvoiceDistributionType;


/**
 * <p>Java class for PartialDeliveryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartialDeliveryRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest">
 *       &lt;sequence>
 *         &lt;element name="InvoiceDistributionType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice.DeliverOrder}InvoiceDistributionType"/>
 *         &lt;element name="OrderToDeliver" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}DeliverOrderInformation"/>
 *         &lt;element name="RowNumbers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartialDeliveryRequest", propOrder = {
    "invoiceDistributionType",
    "orderToDeliver",
    "rowNumbers"
})
public class PartialDeliveryRequest
    extends BasicRequest
{

    @XmlElement(name = "InvoiceDistributionType", required = true)
    protected InvoiceDistributionType invoiceDistributionType;
    @XmlElement(name = "OrderToDeliver", required = true, nillable = true)
    protected DeliverOrderInformation orderToDeliver;
    @XmlElement(name = "RowNumbers", required = true, nillable = true)
    protected ArrayOflong rowNumbers;

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
     * Gets the value of the orderToDeliver property.
     * 
     * @return
     *     possible object is
     *     {@link DeliverOrderInformation }
     *     
     */
    public DeliverOrderInformation getOrderToDeliver() {
        return orderToDeliver;
    }

    /**
     * Sets the value of the orderToDeliver property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliverOrderInformation }
     *     
     */
    public void setOrderToDeliver(DeliverOrderInformation value) {
        this.orderToDeliver = value;
    }

    /**
     * Gets the value of the rowNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getRowNumbers() {
        return rowNumbers;
    }

    /**
     * Sets the value of the rowNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setRowNumbers(ArrayOflong value) {
        this.rowNumbers = value;
    }

}
