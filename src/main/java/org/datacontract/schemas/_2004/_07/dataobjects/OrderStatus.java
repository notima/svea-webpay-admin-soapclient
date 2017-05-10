
package org.datacontract.schemas._2004._07.dataobjects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Denied"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Pending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus")
@XmlEnum
public enum OrderStatus {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Denied")
    DENIED("Denied"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Pending")
    PENDING("Pending");
    private final String value;

    OrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderStatus fromValue(String v) {
        for (OrderStatus c: OrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
