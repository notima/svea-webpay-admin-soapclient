
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortTransactionProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortTransactionProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TransactionId"/>
 *     &lt;enumeration value="CustomerRefNo"/>
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="Amount"/>
 *     &lt;enumeration value="CapturedAmount"/>
 *     &lt;enumeration value="CreatedDate"/>
 *     &lt;enumeration value="CapturedDate"/>
 *     &lt;enumeration value="CreditedAmount"/>
 *     &lt;enumeration value="PaymentMethodAlias"/>
 *     &lt;enumeration value="PaymentMethod"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortTransactionProperty")
@XmlEnum
public enum SortTransactionProperty {

    @XmlEnumValue("TransactionId")
    TRANSACTION_ID("TransactionId"),
    @XmlEnumValue("CustomerRefNo")
    CUSTOMER_REF_NO("CustomerRefNo"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("Amount")
    AMOUNT("Amount"),
    @XmlEnumValue("CapturedAmount")
    CAPTURED_AMOUNT("CapturedAmount"),
    @XmlEnumValue("CreatedDate")
    CREATED_DATE("CreatedDate"),
    @XmlEnumValue("CapturedDate")
    CAPTURED_DATE("CapturedDate"),
    @XmlEnumValue("CreditedAmount")
    CREDITED_AMOUNT("CreditedAmount"),
    @XmlEnumValue("PaymentMethodAlias")
    PAYMENT_METHOD_ALIAS("PaymentMethodAlias"),
    @XmlEnumValue("PaymentMethod")
    PAYMENT_METHOD("PaymentMethod");
    private final String value;

    SortTransactionProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortTransactionProperty fromValue(String v) {
        for (SortTransactionProperty c: SortTransactionProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
