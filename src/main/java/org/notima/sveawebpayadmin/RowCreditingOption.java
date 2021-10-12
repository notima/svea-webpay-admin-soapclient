
package org.notima.sveawebpayadmin;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowCreditingOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowCreditingOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuantityToCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RowNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowCreditingOption", propOrder = {
    "quantityToCredit",
    "rowNumber"
})
public class RowCreditingOption {

    @XmlElement(name = "QuantityToCredit")
    protected BigDecimal quantityToCredit;
    @XmlElement(name = "RowNumber")
    protected Long rowNumber;

    /**
     * Gets the value of the quantityToCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityToCredit() {
        return quantityToCredit;
    }

    /**
     * Sets the value of the quantityToCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityToCredit(BigDecimal value) {
        this.quantityToCredit = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRowNumber(Long value) {
        this.rowNumber = value;
    }

}
