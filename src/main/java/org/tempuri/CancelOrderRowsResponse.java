
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
 *         &lt;element name="CancelOrderRowsResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}CancelOrderRowsResponse" minOccurs="0"/>
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
    "cancelOrderRowsResult"
})
@XmlRootElement(name = "CancelOrderRowsResponse")
public class CancelOrderRowsResponse {

    @XmlElement(name = "CancelOrderRowsResult", nillable = true)
    protected org.datacontract.schemas._2004._07.dataobjects_admin.CancelOrderRowsResponse cancelOrderRowsResult;

    /**
     * Gets the value of the cancelOrderRowsResult property.
     * 
     * @return
     *     possible object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.CancelOrderRowsResponse }
     *     
     */
    public org.datacontract.schemas._2004._07.dataobjects_admin.CancelOrderRowsResponse getCancelOrderRowsResult() {
        return cancelOrderRowsResult;
    }

    /**
     * Sets the value of the cancelOrderRowsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.CancelOrderRowsResponse }
     *     
     */
    public void setCancelOrderRowsResult(org.datacontract.schemas._2004._07.dataobjects_admin.CancelOrderRowsResponse value) {
        this.cancelOrderRowsResult = value;
    }

}
