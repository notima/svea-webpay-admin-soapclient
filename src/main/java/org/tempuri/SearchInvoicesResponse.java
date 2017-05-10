
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
 *         &lt;element name="SearchInvoicesResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchInvoicesResponse" minOccurs="0"/>
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
    "searchInvoicesResult"
})
@XmlRootElement(name = "SearchInvoicesResponse")
public class SearchInvoicesResponse {

    @XmlElement(name = "SearchInvoicesResult", nillable = true)
    protected org.datacontract.schemas._2004._07.dataobjects_admin.SearchInvoicesResponse searchInvoicesResult;

    /**
     * Gets the value of the searchInvoicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.SearchInvoicesResponse }
     *     
     */
    public org.datacontract.schemas._2004._07.dataobjects_admin.SearchInvoicesResponse getSearchInvoicesResult() {
        return searchInvoicesResult;
    }

    /**
     * Sets the value of the searchInvoicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.datacontract.schemas._2004._07.dataobjects_admin.SearchInvoicesResponse }
     *     
     */
    public void setSearchInvoicesResult(org.datacontract.schemas._2004._07.dataobjects_admin.SearchInvoicesResponse value) {
        this.searchInvoicesResult = value;
    }

}
