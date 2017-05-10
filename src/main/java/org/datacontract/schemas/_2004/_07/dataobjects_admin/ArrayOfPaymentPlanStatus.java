
package org.datacontract.schemas._2004._07.dataobjects_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPaymentPlanStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPaymentPlanStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentPlanStatus" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}PaymentPlanStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPaymentPlanStatus", propOrder = {
    "paymentPlanStatus"
})
public class ArrayOfPaymentPlanStatus {

    @XmlElement(name = "PaymentPlanStatus")
    protected List<PaymentPlanStatus> paymentPlanStatus;

    /**
     * Gets the value of the paymentPlanStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentPlanStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentPlanStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentPlanStatus }
     * 
     * 
     */
    public List<PaymentPlanStatus> getPaymentPlanStatus() {
        if (paymentPlanStatus == null) {
            paymentPlanStatus = new ArrayList<PaymentPlanStatus>();
        }
        return this.paymentPlanStatus;
    }

}
