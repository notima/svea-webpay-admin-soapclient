
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
 *         &lt;element name="AddOrderRowsResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}AddOrderRowsResponse" minOccurs="0"/>
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
    "addOrderRowsResult"
})
@XmlRootElement(name = "AddOrderRowsResponse")
public class AddOrderRowsResponse {

    @XmlElement(name = "AddOrderRowsResult", nillable = true)
    protected org.datacontract.schemas._2004._07.dataobjects_admin.AddOrderRowsResponse addOrderRowsResult;

    /**
     * Gets the value of the addOrderRowsResult property.
     * 
     * @return
     *     possible object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.AddOrderRowsResponse }
     *     
     */
    public org.datacontract.schemas._2004._07.dataobjects_admin.AddOrderRowsResponse getAddOrderRowsResult() {
        return addOrderRowsResult;
    }

    /**
     * Sets the value of the addOrderRowsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.AddOrderRowsResponse }
     *     
     */
    public void setAddOrderRowsResult(org.datacontract.schemas._2004._07.dataobjects_admin.AddOrderRowsResponse value) {
        this.addOrderRowsResult = value;
    }

}
