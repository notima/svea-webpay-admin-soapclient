
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetInvoiceJournalReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInvoiceJournalReportResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse">
 *       &lt;sequence>
 *         &lt;element name="ReportRows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfInvoiceJournalReportRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInvoiceJournalReportResponse", propOrder = {
    "reportRows"
})
public class GetInvoiceJournalReportResponse
    extends BasicResponse
{

    @XmlElement(name = "ReportRows", nillable = true)
    protected ArrayOfInvoiceJournalReportRow reportRows;

    /**
     * Gets the value of the reportRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvoiceJournalReportRow }
     *     
     */
    public ArrayOfInvoiceJournalReportRow getReportRows() {
        return reportRows;
    }

    /**
     * Sets the value of the reportRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvoiceJournalReportRow }
     *     
     */
    public void setReportRows(ArrayOfInvoiceJournalReportRow value) {
        this.reportRows = value;
    }

}
