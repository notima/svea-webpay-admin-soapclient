
package org.datacontract.schemas._2004._07.dataobjects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="PaymentPlan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderType")
@XmlEnum
public enum OrderType {

    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("PaymentPlan")
    PAYMENT_PLAN("PaymentPlan");
    private final String value;

    OrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderType fromValue(String v) {
        for (OrderType c: OrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
