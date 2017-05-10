
package org.datacontract.schemas._2004._07.dataobjects_webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDistributionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceDistributionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Post"/>
 *     &lt;enumeration value="Email"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvoiceDistributionType", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice.DeliverOrder")
@XmlEnum
public enum InvoiceDistributionType {

    @XmlEnumValue("Post")
    POST("Post"),
    @XmlEnumValue("Email")
    EMAIL("Email");
    private final String value;

    InvoiceDistributionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoiceDistributionType fromValue(String v) {
        for (InvoiceDistributionType c: InvoiceDistributionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
