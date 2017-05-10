
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import org.datacontract.schemas._2004._07.dataobjects.ArrayOfOrderRow;
import org.datacontract.schemas._2004._07.dataobjects_webservice.InvoiceDistributionType;


/**
 * <p>Java class for CreditInvoiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditInvoiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest">
 *       &lt;sequence>
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InvoiceDistributionType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice.DeliverOrder}InvoiceDistributionType" minOccurs="0"/>
 *         &lt;element name="InvoiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NewCreditInvoiceRows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}ArrayOfOrderRow" minOccurs="0"/>
 *         &lt;element name="RowNumbers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditInvoiceRequest", propOrder = {
    "clientId",
    "invoiceDistributionType",
    "invoiceId",
    "newCreditInvoiceRows",
    "rowNumbers"
})
public class CreditInvoiceRequest
    extends BasicRequest
{

    @XmlElement(name = "ClientId")
    protected Long clientId;
    @XmlElement(name = "InvoiceDistributionType")
    protected InvoiceDistributionType invoiceDistributionType;
    @XmlElement(name = "InvoiceId")
    protected Long invoiceId;
    @XmlElement(name = "NewCreditInvoiceRows", nillable = true)
    protected ArrayOfOrderRow newCreditInvoiceRows;
    @XmlElement(name = "RowNumbers", nillable = true)
    protected ArrayOflong rowNumbers;

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientId(Long value) {
        this.clientId = value;
    }

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
     * Gets the value of the invoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvoiceId(Long value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the newCreditInvoiceRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderRow }
     *     
     */
    public ArrayOfOrderRow getNewCreditInvoiceRows() {
        return newCreditInvoiceRows;
    }

    /**
     * Sets the value of the newCreditInvoiceRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderRow }
     *     
     */
    public void setNewCreditInvoiceRows(ArrayOfOrderRow value) {
        this.newCreditInvoiceRows = value;
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
