
package org.notima.sveawebpayadmin;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetAccountCreditsResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses}GetAccountCreditsResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAccountCreditsResult"
})
@XmlRootElement(name = "GetAccountCreditsResponse", namespace = "http://tempuri.org/")
public class GetAccountCreditsResponse2 {

    @XmlElement(name = "GetAccountCreditsResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetAccountCreditsResponse getAccountCreditsResult;

    /**
     * Gets the value of the getAccountCreditsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountCreditsResponse }
     *     
     */
    public GetAccountCreditsResponse getGetAccountCreditsResult() {
        return getAccountCreditsResult;
    }

    /**
     * Sets the value of the getAccountCreditsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountCreditsResponse }
     *     
     */
    public void setGetAccountCreditsResult(GetAccountCreditsResponse value) {
        this.getAccountCreditsResult = value;
    }

}
