
package org.datacontract.schemas._2004._07.dataobjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyIdentity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyIdentity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyVatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyIdentity", propOrder = {
    "companyIdentification",
    "companyVatNumber"
})
public class CompanyIdentity {

    @XmlElement(name = "CompanyIdentification", nillable = true)
    protected String companyIdentification;
    @XmlElement(name = "CompanyVatNumber", nillable = true)
    protected String companyVatNumber;

    /**
     * Gets the value of the companyIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyIdentification() {
        return companyIdentification;
    }

    /**
     * Sets the value of the companyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyIdentification(String value) {
        this.companyIdentification = value;
    }

    /**
     * Gets the value of the companyVatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyVatNumber() {
        return companyVatNumber;
    }

    /**
     * Sets the value of the companyVatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyVatNumber(String value) {
        this.companyVatNumber = value;
    }

}
