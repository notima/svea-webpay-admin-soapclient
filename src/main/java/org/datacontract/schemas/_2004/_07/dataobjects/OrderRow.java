
package org.datacontract.schemas._2004._07.dataobjects;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.dataobjects_admin.NumberedOrderRow;


/**
 * <p>Java class for OrderRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArticleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PricePerUnit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VatPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderRow", propOrder = {
    "articleNumber",
    "description",
    "discountPercent",
    "numberOfUnits",
    "pricePerUnit",
    "unit",
    "vatPercent"
})
@XmlSeeAlso({
    NumberedOrderRow.class
})
public class OrderRow {

    @XmlElement(name = "ArticleNumber", nillable = true)
    protected String articleNumber;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "DiscountPercent", required = true)
    protected BigDecimal discountPercent;
    @XmlElement(name = "NumberOfUnits", required = true)
    protected BigDecimal numberOfUnits;
    @XmlElement(name = "PricePerUnit", required = true)
    protected BigDecimal pricePerUnit;
    @XmlElement(name = "Unit", nillable = true)
    protected String unit;
    @XmlElement(name = "VatPercent", required = true)
    protected BigDecimal vatPercent;

    /**
     * Gets the value of the articleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleNumber() {
        return articleNumber;
    }

    /**
     * Sets the value of the articleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleNumber(String value) {
        this.articleNumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfUnits(BigDecimal value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the pricePerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    /**
     * Sets the value of the pricePerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricePerUnit(BigDecimal value) {
        this.pricePerUnit = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the vatPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatPercent() {
        return vatPercent;
    }

    /**
     * Sets the value of the vatPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatPercent(BigDecimal value) {
        this.vatPercent = value;
    }

}
