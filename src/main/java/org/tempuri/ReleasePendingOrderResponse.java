
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.dataobjects_admin.ReleasePendingResponse;


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
 *         &lt;element name="ReleasePendingOrderResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ReleasePendingResponse" minOccurs="0"/>
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
    "releasePendingOrderResult"
})
@XmlRootElement(name = "ReleasePendingOrderResponse")
public class ReleasePendingOrderResponse {

    @XmlElement(name = "ReleasePendingOrderResult", nillable = true)
    protected ReleasePendingResponse releasePendingOrderResult;

    /**
     * Gets the value of the releasePendingOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReleasePendingResponse }
     *     
     */
    public ReleasePendingResponse getReleasePendingOrderResult() {
        return releasePendingOrderResult;
    }

    /**
     * Sets the value of the releasePendingOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleasePendingResponse }
     *     
     */
    public void setReleasePendingOrderResult(ReleasePendingResponse value) {
        this.releasePendingOrderResult = value;
    }

}
