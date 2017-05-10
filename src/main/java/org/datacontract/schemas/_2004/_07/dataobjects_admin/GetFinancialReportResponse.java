
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFinancialReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFinancialReportResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse">
 *       &lt;sequence>
 *         &lt;element name="ReportHeader" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}FinancialReportHeader" minOccurs="0"/>
 *         &lt;element name="ReportRows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfFinancialReportRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFinancialReportResponse", propOrder = {
    "reportHeader",
    "reportRows"
})
public class GetFinancialReportResponse
    extends BasicResponse
{

    @XmlElement(name = "ReportHeader", nillable = true)
    protected FinancialReportHeader reportHeader;
    @XmlElement(name = "ReportRows", nillable = true)
    protected ArrayOfFinancialReportRow reportRows;

    /**
     * Gets the value of the reportHeader property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialReportHeader }
     *     
     */
    public FinancialReportHeader getReportHeader() {
        return reportHeader;
    }

    /**
     * Sets the value of the reportHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialReportHeader }
     *     
     */
    public void setReportHeader(FinancialReportHeader value) {
        this.reportHeader = value;
    }

    /**
     * Gets the value of the reportRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFinancialReportRow }
     *     
     */
    public ArrayOfFinancialReportRow getReportRows() {
        return reportRows;
    }

    /**
     * Sets the value of the reportRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFinancialReportRow }
     *     
     */
    public void setReportRows(ArrayOfFinancialReportRow value) {
        this.reportRows = value;
    }

}
