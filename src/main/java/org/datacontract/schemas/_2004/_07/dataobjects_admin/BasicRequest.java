
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Authentication" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}Authentication"/>
 *         &lt;element name="Settings" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfSetting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicRequest", propOrder = {
    "authentication",
    "settings"
})
@XmlSeeAlso({
    CreditInvoiceRequest.class,
    CreateOrderRequest.class,
    GetInvoicePdfLinkRequest.class,
    GetInvoicesRequest.class,
    ChangeInvoiceDueDateRequest.class,
    SearchInvoicesRequest.class,
    CancelOrderRequest.class,
    SumOfInvoiceAmountRequest.class,
    GetInvoicesWithChangedDueDateRequest.class,
    ApproveInvoiceRequest.class,
    AddOrderRowsRequest.class,
    DeliveryRequest.class,
    SumOfPaymentPlanAmountRequest.class,
    SearchOrdersRequest.class,
    PartialDeliveryRequest.class,
    UpdateOrderRowsRequest.class,
    GetPaymentPlanReportRequest.class,
    GetOrderPdfLinkRequest.class,
    GetFinancialReportRequest.class,
    GetInvoiceReportRequest.class,
    UpdateOrderRequest.class,
    ReleasePendingRequest.class,
    SearchPaymentPlansRequest.class,
    GetRegressionReportRequest.class,
    SumOfOrderAmountRequest.class,
    CancelOrderRowsRequest.class,
    GetAccountingReportRequest.class,
    GetOrdersRequest.class,
    GetInvoiceJournalReportRequest.class
})
public class BasicRequest {

    @XmlElement(name = "Authentication", required = true, nillable = true)
    protected Authentication authentication;
    @XmlElement(name = "Settings", nillable = true)
    protected ArrayOfSetting settings;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication }
     *     
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication }
     *     
     */
    public void setAuthentication(Authentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSetting }
     *     
     */
    public ArrayOfSetting getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSetting }
     *     
     */
    public void setSettings(ArrayOfSetting value) {
        this.settings = value;
    }

}
