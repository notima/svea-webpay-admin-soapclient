
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetInvoicesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInvoicesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest">
 *       &lt;sequence>
 *         &lt;element name="InvoicesToRetrieve" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfGetInvoiceInformation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInvoicesRequest", propOrder = {
    "invoicesToRetrieve"
})
public class GetInvoicesRequest
    extends BasicRequest
{

    @XmlElement(name = "InvoicesToRetrieve", required = true, nillable = true)
    protected ArrayOfGetInvoiceInformation invoicesToRetrieve;

    /**
     * Gets the value of the invoicesToRetrieve property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGetInvoiceInformation }
     *     
     */
    public ArrayOfGetInvoiceInformation getInvoicesToRetrieve() {
        return invoicesToRetrieve;
    }

    /**
     * Sets the value of the invoicesToRetrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGetInvoiceInformation }
     *     
     */
    public void setInvoicesToRetrieve(ArrayOfGetInvoiceInformation value) {
        this.invoicesToRetrieve = value;
    }

}
