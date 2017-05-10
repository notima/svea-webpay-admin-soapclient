
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchOrderSorting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchOrderSorting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SortDirection" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SortDirection" minOccurs="0"/>
 *         &lt;element name="SortOrderProperty" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SortOrderProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOrderSorting", propOrder = {
    "sortDirection",
    "sortOrderProperty"
})
public class SearchOrderSorting {

    @XmlElement(name = "SortDirection")
    protected SortDirection sortDirection;
    @XmlElement(name = "SortOrderProperty")
    protected SortOrderProperty sortOrderProperty;

    /**
     * Gets the value of the sortDirection property.
     * 
     * @return
     *     possible object is
     *     {@link SortDirection }
     *     
     */
    public SortDirection getSortDirection() {
        return sortDirection;
    }

    /**
     * Sets the value of the sortDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortDirection }
     *     
     */
    public void setSortDirection(SortDirection value) {
        this.sortDirection = value;
    }

    /**
     * Gets the value of the sortOrderProperty property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderProperty }
     *     
     */
    public SortOrderProperty getSortOrderProperty() {
        return sortOrderProperty;
    }

    /**
     * Sets the value of the sortOrderProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderProperty }
     *     
     */
    public void setSortOrderProperty(SortOrderProperty value) {
        this.sortOrderProperty = value;
    }

}
