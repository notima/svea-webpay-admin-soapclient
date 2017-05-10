
package org.datacontract.schemas._2004._07.dataobjects_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInvoicePaymentStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInvoicePaymentStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoicePaymentStatus" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}InvoicePaymentStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInvoicePaymentStatus", propOrder = {
    "invoicePaymentStatus"
})
public class ArrayOfInvoicePaymentStatus {

    @XmlElement(name = "InvoicePaymentStatus")
    protected List<InvoicePaymentStatus> invoicePaymentStatus;

    /**
     * Gets the value of the invoicePaymentStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoicePaymentStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoicePaymentStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoicePaymentStatus }
     * 
     * 
     */
    public List<InvoicePaymentStatus> getInvoicePaymentStatus() {
        if (invoicePaymentStatus == null) {
            invoicePaymentStatus = new ArrayList<InvoicePaymentStatus>();
        }
        return this.invoicePaymentStatus;
    }

}
