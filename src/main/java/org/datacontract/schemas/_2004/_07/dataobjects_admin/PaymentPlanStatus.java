
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentPlanStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentPlanStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="WaitingToBeSent"/>
 *     &lt;enumeration value="WaitingForContract"/>
 *     &lt;enumeration value="Running"/>
 *     &lt;enumeration value="Finished"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentPlanStatus")
@XmlEnum
public enum PaymentPlanStatus {

    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("WaitingToBeSent")
    WAITING_TO_BE_SENT("WaitingToBeSent"),
    @XmlEnumValue("WaitingForContract")
    WAITING_FOR_CONTRACT("WaitingForContract"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Finished")
    FINISHED("Finished");
    private final String value;

    PaymentPlanStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentPlanStatus fromValue(String v) {
        for (PaymentPlanStatus c: PaymentPlanStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
