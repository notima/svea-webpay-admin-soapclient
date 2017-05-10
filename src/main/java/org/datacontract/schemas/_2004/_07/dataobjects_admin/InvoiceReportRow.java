
package org.datacontract.schemas._2004._07.dataobjects_admin;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InvoiceReportRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceReportRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdministrationFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CreditFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="InvoiceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReportDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceReportRow", propOrder = {
    "administrationFee",
    "amount",
    "clientId",
    "creditFee",
    "customerId",
    "invoiceId",
    "name",
    "reportDate"
})
public class InvoiceReportRow {

    @XmlElement(name = "AdministrationFee", required = true)
    protected BigDecimal administrationFee;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "ClientId")
    protected long clientId;
    @XmlElement(name = "CreditFee", required = true)
    protected BigDecimal creditFee;
    @XmlElement(name = "CustomerId")
    protected long customerId;
    @XmlElement(name = "InvoiceId")
    protected long invoiceId;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "ReportDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportDate;

    /**
     * Gets the value of the administrationFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdministrationFee() {
        return administrationFee;
    }

    /**
     * Sets the value of the administrationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdministrationFee(BigDecimal value) {
        this.administrationFee = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

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
     * Gets the value of the creditFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditFee() {
        return creditFee;
    }

    /**
     * Sets the value of the creditFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditFee(BigDecimal value) {
        this.creditFee = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     */
    public long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the invoiceId property.
     * 
     */
    public long getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     */
    public void setInvoiceId(long value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the reportDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportDate() {
        return reportDate;
    }

    /**
     * Sets the value of the reportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportDate(XMLGregorianCalendar value) {
        this.reportDate = value;
    }

}
