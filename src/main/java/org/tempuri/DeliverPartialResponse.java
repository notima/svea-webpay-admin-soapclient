
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.dataobjects_admin.DeliveryResponse;


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
 *         &lt;element name="DeliverPartialResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}DeliveryResponse" minOccurs="0"/>
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
    "deliverPartialResult"
})
@XmlRootElement(name = "DeliverPartialResponse")
public class DeliverPartialResponse {

    @XmlElement(name = "DeliverPartialResult", nillable = true)
    protected DeliveryResponse deliverPartialResult;

    /**
     * Gets the value of the deliverPartialResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryResponse }
     *     
     */
    public DeliveryResponse getDeliverPartialResult() {
        return deliverPartialResult;
    }

    /**
     * Sets the value of the deliverPartialResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryResponse }
     *     
     */
    public void setDeliverPartialResult(DeliveryResponse value) {
        this.deliverPartialResult = value;
    }

}
