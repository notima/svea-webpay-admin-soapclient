
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDeliveryStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderDeliveryStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="PartiallyDelivered"/>
 *     &lt;enumeration value="Delivered"/>
 *     &lt;enumeration value="Cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderDeliveryStatus")
@XmlEnum
public enum OrderDeliveryStatus {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("PartiallyDelivered")
    PARTIALLY_DELIVERED("PartiallyDelivered"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    OrderDeliveryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderDeliveryStatus fromValue(String v) {
        for (OrderDeliveryStatus c: OrderDeliveryStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
