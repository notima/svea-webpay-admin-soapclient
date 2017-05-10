
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeInvoiceDueDateResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ChangeInvoiceDueDateResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "changeInvoiceDueDateResult"
})
@XmlRootElement(name = "ChangeInvoiceDueDateResponse")
public class ChangeInvoiceDueDateResponse {

    @XmlElement(name = "ChangeInvoiceDueDateResult", nillable = true)
    protected org.datacontract.schemas._2004._07.dataobjects_admin.ChangeInvoiceDueDateResponse changeInvoiceDueDateResult;

    /**
     * Gets the value of the changeInvoiceDueDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.ChangeInvoiceDueDateResponse }
     *     
     */
    public org.datacontract.schemas._2004._07.dataobjects_admin.ChangeInvoiceDueDateResponse getChangeInvoiceDueDateResult() {
        return changeInvoiceDueDateResult;
    }

    /**
     * Sets the value of the changeInvoiceDueDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.ChangeInvoiceDueDateResponse }
     *     
     */
    public void setChangeInvoiceDueDateResult(org.datacontract.schemas._2004._07.dataobjects_admin.ChangeInvoiceDueDateResponse value) {
        this.changeInvoiceDueDateResult = value;
    }

}
