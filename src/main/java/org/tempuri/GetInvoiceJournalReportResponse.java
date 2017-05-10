
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
 *         &lt;element name="GetInvoiceJournalReportResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}GetInvoiceJournalReportResponse" minOccurs="0"/>
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
    "getInvoiceJournalReportResult"
})
@XmlRootElement(name = "GetInvoiceJournalReportResponse")
public class GetInvoiceJournalReportResponse {

    @XmlElement(name = "GetInvoiceJournalReportResult", nillable = true)
    protected org.datacontract.schemas._2004._07.dataobjects_admin.GetInvoiceJournalReportResponse getInvoiceJournalReportResult;

    /**
     * Gets the value of the getInvoiceJournalReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.GetInvoiceJournalReportResponse }
     *     
     */
    public org.datacontract.schemas._2004._07.dataobjects_admin.GetInvoiceJournalReportResponse getGetInvoiceJournalReportResult() {
        return getInvoiceJournalReportResult;
    }

    /**
     * Sets the value of the getInvoiceJournalReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.GetInvoiceJournalReportResponse }
     *     
     */
    public void setGetInvoiceJournalReportResult(org.datacontract.schemas._2004._07.dataobjects_admin.GetInvoiceJournalReportResponse value) {
        this.getInvoiceJournalReportResult = value;
    }

}
