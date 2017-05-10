
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
 *         &lt;element name="ApproveInvoiceResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ApproveInvoiceResponse" minOccurs="0"/>
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
    "approveInvoiceResult"
})
@XmlRootElement(name = "ApproveInvoiceResponse")
public class ApproveInvoiceResponse {

    @XmlElement(name = "ApproveInvoiceResult", nillable = true)
    protected org.datacontract.schemas._2004._07.dataobjects_admin.ApproveInvoiceResponse approveInvoiceResult;

    /**
     * Gets the value of the approveInvoiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.ApproveInvoiceResponse }
     *     
     */
    public org.datacontract.schemas._2004._07.dataobjects_admin.ApproveInvoiceResponse getApproveInvoiceResult() {
        return approveInvoiceResult;
    }

    /**
     * Sets the value of the approveInvoiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.ApproveInvoiceResponse }
     *     
     */
    public void setApproveInvoiceResult(org.datacontract.schemas._2004._07.dataobjects_admin.ApproveInvoiceResponse value) {
        this.approveInvoiceResult = value;
    }

}
