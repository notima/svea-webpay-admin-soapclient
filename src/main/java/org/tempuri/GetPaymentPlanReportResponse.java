
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
 *         &lt;element name="GetPaymentPlanReportResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}GetPaymentPlanReportResponse" minOccurs="0"/>
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
    "getPaymentPlanReportResult"
})
@XmlRootElement(name = "GetPaymentPlanReportResponse")
public class GetPaymentPlanReportResponse {

    @XmlElement(name = "GetPaymentPlanReportResult", nillable = true)
    protected org.datacontract.schemas._2004._07.dataobjects_admin.GetPaymentPlanReportResponse getPaymentPlanReportResult;

    /**
     * Gets the value of the getPaymentPlanReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.GetPaymentPlanReportResponse }
     *     
     */
    public org.datacontract.schemas._2004._07.dataobjects_admin.GetPaymentPlanReportResponse getGetPaymentPlanReportResult() {
        return getPaymentPlanReportResult;
    }

    /**
     * Sets the value of the getPaymentPlanReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.GetPaymentPlanReportResponse }
     *     
     */
    public void setGetPaymentPlanReportResult(org.datacontract.schemas._2004._07.dataobjects_admin.GetPaymentPlanReportResponse value) {
        this.getPaymentPlanReportResult = value;
    }

}
