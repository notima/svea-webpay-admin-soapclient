
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchOrdersRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchOrdersRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest">
 *       &lt;sequence>
 *         &lt;element name="EndIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SearchOrderFilter" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchOrderFilter"/>
 *         &lt;element name="SearchOrderSorting" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchOrderSorting"/>
 *         &lt;element name="StartIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOrdersRequest", propOrder = {
    "endIndex",
    "searchOrderFilter",
    "searchOrderSorting",
    "startIndex"
})
public class SearchOrdersRequest
    extends BasicRequest
{

    @XmlElement(name = "EndIndex")
    protected int endIndex;
    @XmlElement(name = "SearchOrderFilter", required = true, nillable = true)
    protected SearchOrderFilter searchOrderFilter;
    @XmlElement(name = "SearchOrderSorting", required = true, nillable = true)
    protected SearchOrderSorting searchOrderSorting;
    @XmlElement(name = "StartIndex")
    protected int startIndex;

    /**
     * Gets the value of the endIndex property.
     * 
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * Sets the value of the endIndex property.
     * 
     */
    public void setEndIndex(int value) {
        this.endIndex = value;
    }

    /**
     * Gets the value of the searchOrderFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOrderFilter }
     *     
     */
    public SearchOrderFilter getSearchOrderFilter() {
        return searchOrderFilter;
    }

    /**
     * Sets the value of the searchOrderFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOrderFilter }
     *     
     */
    public void setSearchOrderFilter(SearchOrderFilter value) {
        this.searchOrderFilter = value;
    }

    /**
     * Gets the value of the searchOrderSorting property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOrderSorting }
     *     
     */
    public SearchOrderSorting getSearchOrderSorting() {
        return searchOrderSorting;
    }

    /**
     * Sets the value of the searchOrderSorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOrderSorting }
     *     
     */
    public void setSearchOrderSorting(SearchOrderSorting value) {
        this.searchOrderSorting = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     */
    public void setStartIndex(int value) {
        this.startIndex = value;
    }

}
