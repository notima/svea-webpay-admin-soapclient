
package org.notima.sveawebpayadmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicResponse", propOrder = {
    "errorMessage",
    "resultCode"
})
@XmlSeeAlso({
    CancelAccountCreditAmountResponse.class,
    CancelAccountCreditRowsResponse.class,
    AccountCreditRegressReportResponse.class,
    AccountingAgreementType25ReportResponse.class,
    GetClientsByIdentityAccountResponse.class,
    GetDebtInvoicesPaidToClientForReportResponse.class,
    GetInvoicesPaidToClientForReportResponse.class,
    GetKickbackReportResponse.class,
    GetPendingReasonsResponse.class,
    SearchAccountCreditsResponse.class,
    GetAccountCreditsResponse.class,
    GetClientIdResponse.class,
    AddOrderRowsResponse2 .class,
    ApproveInvoiceResponse2 .class,
    CancelOrderResponse2 .class,
    CancelOrderRowsResponse2 .class,
    CancelPaymentPlanAmountResponse2 .class,
    CancelPaymentPlanRowsResponse2 .class,
    DeliveryResponse.class,
    GetAccountingReportResponse2 .class,
    GetFinancialReportResponse2 .class,
    GetInvoiceJournalReportResponse2 .class,
    PdfLinkResponse.class,
    GetInvoiceReportResponse2 .class,
    GetInvoicesWithChangedDueDateResponse2 .class,
    GetOrderEventsResponse2 .class,
    GetPaymentPlanReportResponse2 .class,
    GetRegressionReportResponse2 .class,
    GetSpecificationReportResponse2 .class,
    ReleasePendingResponse.class,
    UpdateOrderResponse2 .class,
    UpdateOrderRowsResponse2 .class,
    GetOrdersResponse2 .class,
    SearchOrdersResponse2 .class,
    SearchInvoicesResponse2 .class,
    GetInvoicesResponse2 .class,
    SearchPaymentPlansResponse2 .class,
    SumOfAmountResponse.class,
    CreateOrderResponse2 .class,
    ChangeInvoiceDueDateResponse2 .class,
    CreateApprovedOrderResponse2 .class
})
public class BasicResponse {

    @XmlElement(name = "ErrorMessage", nillable = true)
    protected String errorMessage;
    @XmlElement(name = "ResultCode")
    protected int resultCode;

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

}
