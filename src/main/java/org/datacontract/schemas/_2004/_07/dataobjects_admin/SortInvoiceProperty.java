
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortInvoiceProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortInvoiceProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InvoiceDate"/>
 *     &lt;enumeration value="Amount"/>
 *     &lt;enumeration value="InvoiceId"/>
 *     &lt;enumeration value="DueDate"/>
 *     &lt;enumeration value="SveaOrderId"/>
 *     &lt;enumeration value="CustomerName"/>
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="NationalIdNumber"/>
 *     &lt;enumeration value="Type"/>
 *     &lt;enumeration value="SveaHasBought"/>
 *     &lt;enumeration value="PaidToClientDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortInvoiceProperty")
@XmlEnum
public enum SortInvoiceProperty {

    @XmlEnumValue("InvoiceDate")
    INVOICE_DATE("InvoiceDate"),
    @XmlEnumValue("Amount")
    AMOUNT("Amount"),
    @XmlEnumValue("InvoiceId")
    INVOICE_ID("InvoiceId"),
    @XmlEnumValue("DueDate")
    DUE_DATE("DueDate"),
    @XmlEnumValue("SveaOrderId")
    SVEA_ORDER_ID("SveaOrderId"),
    @XmlEnumValue("CustomerName")
    CUSTOMER_NAME("CustomerName"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("NationalIdNumber")
    NATIONAL_ID_NUMBER("NationalIdNumber"),
    @XmlEnumValue("Type")
    TYPE("Type"),
    @XmlEnumValue("SveaHasBought")
    SVEA_HAS_BOUGHT("SveaHasBought"),
    @XmlEnumValue("PaidToClientDate")
    PAID_TO_CLIENT_DATE("PaidToClientDate");
    private final String value;

    SortInvoiceProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortInvoiceProperty fromValue(String v) {
        for (SortInvoiceProperty c: SortInvoiceProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
