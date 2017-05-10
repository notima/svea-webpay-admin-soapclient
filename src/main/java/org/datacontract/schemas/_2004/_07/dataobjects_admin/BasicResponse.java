
package org.datacontract.schemas._2004._07.dataobjects_admin;

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
 * &lt;complexType name="BasicResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    DeliveryResponse.class,
    CancelOrderRowsResponse.class,
    GetInvoicesWithChangedDueDateResponse.class,
    SumOfAmountResponse.class,
    ReleasePendingResponse.class,
    GetRegressionReportResponse.class,
    GetPaymentPlanReportResponse.class,
    ChangeInvoiceDueDateResponse.class,
    GetInvoicesResponse.class,
    SearchOrdersResponse.class,
    UpdateOrderRowsResponse.class,
    SearchPaymentPlansResponse.class,
    UpdateOrderResponse.class,
    ApproveInvoiceResponse.class,
    SearchInvoicesResponse.class,
    CancelOrderResponse.class,
    PdfLinkResponse.class,
    GetFinancialReportResponse.class,
    GetAccountingReportResponse.class,
    GetInvoiceReportResponse.class,
    CreateOrderResponse.class,
    GetOrdersResponse.class,
    GetInvoiceJournalReportResponse.class,
    AddOrderRowsResponse.class
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
