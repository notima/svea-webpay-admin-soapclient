
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchPaymentPlansResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPaymentPlansResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse">
 *       &lt;sequence>
 *         &lt;element name="PaymentPlanListItems" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfPaymentPlanListItem"/>
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPaymentPlansResponse", propOrder = {
    "paymentPlanListItems",
    "resultCount"
})
public class SearchPaymentPlansResponse
    extends BasicResponse
{

    @XmlElement(name = "PaymentPlanListItems", required = true, nillable = true)
    protected ArrayOfPaymentPlanListItem paymentPlanListItems;
    @XmlElement(name = "ResultCount")
    protected int resultCount;

    /**
     * Gets the value of the paymentPlanListItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentPlanListItem }
     *     
     */
    public ArrayOfPaymentPlanListItem getPaymentPlanListItems() {
        return paymentPlanListItems;
    }

    /**
     * Sets the value of the paymentPlanListItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentPlanListItem }
     *     
     */
    public void setPaymentPlanListItems(ArrayOfPaymentPlanListItem value) {
        this.paymentPlanListItems = value;
    }

    /**
     * Gets the value of the resultCount property.
     * 
     */
    public int getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     */
    public void setResultCount(int value) {
        this.resultCount = value;
    }

}
