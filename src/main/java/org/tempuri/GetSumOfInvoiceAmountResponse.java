
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.dataobjects_admin.SumOfAmountResponse;


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
 *         &lt;element name="GetSumOfInvoiceAmountResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SumOfAmountResponse" minOccurs="0"/>
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
    "getSumOfInvoiceAmountResult"
})
@XmlRootElement(name = "GetSumOfInvoiceAmountResponse")
public class GetSumOfInvoiceAmountResponse {

    @XmlElement(name = "GetSumOfInvoiceAmountResult", nillable = true)
    protected SumOfAmountResponse getSumOfInvoiceAmountResult;

    /**
     * Gets the value of the getSumOfInvoiceAmountResult property.
     * 
     * @return
     *     possible object is
     *     {@link SumOfAmountResponse }
     *     
     */
    public SumOfAmountResponse getGetSumOfInvoiceAmountResult() {
        return getSumOfInvoiceAmountResult;
    }

    /**
     * Sets the value of the getSumOfInvoiceAmountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumOfAmountResponse }
     *     
     */
    public void setGetSumOfInvoiceAmountResult(SumOfAmountResponse value) {
        this.getSumOfInvoiceAmountResult = value;
    }

}
