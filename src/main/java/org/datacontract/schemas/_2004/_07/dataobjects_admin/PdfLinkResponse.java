
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PdfLinkResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PdfLinkResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse">
 *       &lt;sequence>
 *         &lt;element name="PdfLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PdfLinkResponse", propOrder = {
    "pdfLink"
})
public class PdfLinkResponse
    extends BasicResponse
{

    @XmlElement(name = "PdfLink", nillable = true)
    protected String pdfLink;

    /**
     * Gets the value of the pdfLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfLink() {
        return pdfLink;
    }

    /**
     * Sets the value of the pdfLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfLink(String value) {
        this.pdfLink = value;
    }

}
