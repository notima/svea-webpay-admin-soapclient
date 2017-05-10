
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoicePaymentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoicePaymentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PendingApproval"/>
 *     &lt;enumeration value="Sent"/>
 *     &lt;enumeration value="Paid"/>
 *     &lt;enumeration value="Overdue"/>
 *     &lt;enumeration value="Reminded"/>
 *     &lt;enumeration value="DebtCollection"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="PartlyPaid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvoicePaymentStatus")
@XmlEnum
public enum InvoicePaymentStatus {

    @XmlEnumValue("PendingApproval")
    PENDING_APPROVAL("PendingApproval"),
    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("Paid")
    PAID("Paid"),
    @XmlEnumValue("Overdue")
    OVERDUE("Overdue"),
    @XmlEnumValue("Reminded")
    REMINDED("Reminded"),
    @XmlEnumValue("DebtCollection")
    DEBT_COLLECTION("DebtCollection"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("PartlyPaid")
    PARTLY_PAID("PartlyPaid");
    private final String value;

    InvoicePaymentStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoicePaymentStatus fromValue(String v) {
        for (InvoicePaymentStatus c: InvoicePaymentStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
