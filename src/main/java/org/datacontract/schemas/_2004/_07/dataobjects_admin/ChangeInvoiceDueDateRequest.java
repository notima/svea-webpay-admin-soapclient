
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChangeInvoiceDueDateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeInvoiceDueDateRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest">
 *       &lt;sequence>
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="InvoiceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NewDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeInvoiceDueDateRequest", propOrder = {
    "clientId",
    "invoiceId",
    "newDueDate"
})
public class ChangeInvoiceDueDateRequest
    extends BasicRequest
{

    @XmlElement(name = "ClientId")
    protected long clientId;
    @XmlElement(name = "InvoiceId")
    protected long invoiceId;
    @XmlElement(name = "NewDueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar newDueDate;

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
     * Gets the value of the newDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewDueDate() {
        return newDueDate;
    }

    /**
     * Sets the value of the newDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewDueDate(XMLGregorianCalendar value) {
        this.newDueDate = value;
    }

}
