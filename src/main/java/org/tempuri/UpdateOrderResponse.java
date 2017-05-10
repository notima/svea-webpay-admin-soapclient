
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
 *         &lt;element name="UpdateOrderResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}UpdateOrderResponse" minOccurs="0"/>
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
    "updateOrderResult"
})
@XmlRootElement(name = "UpdateOrderResponse")
public class UpdateOrderResponse {

    @XmlElement(name = "UpdateOrderResult", nillable = true)
    protected org.datacontract.schemas._2004._07.dataobjects_admin.UpdateOrderResponse updateOrderResult;

    /**
     * Gets the value of the updateOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.UpdateOrderResponse }
     *     
     */
    public org.datacontract.schemas._2004._07.dataobjects_admin.UpdateOrderResponse getUpdateOrderResult() {
        return updateOrderResult;
    }

    /**
     * Sets the value of the updateOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.UpdateOrderResponse }
     *     
     */
    public void setUpdateOrderResult(org.datacontract.schemas._2004._07.dataobjects_admin.UpdateOrderResponse value) {
        this.updateOrderResult = value;
    }

}
