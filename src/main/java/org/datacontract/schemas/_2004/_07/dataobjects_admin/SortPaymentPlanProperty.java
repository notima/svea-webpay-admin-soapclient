
package org.datacontract.schemas._2004._07.dataobjects_admin;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortPaymentPlanProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortPaymentPlanProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ApprovedDate"/>
 *     &lt;enumeration value="Amount"/>
 *     &lt;enumeration value="ContractNumber"/>
 *     &lt;enumeration value="PaidDate"/>
 *     &lt;enumeration value="SveaOrderId"/>
 *     &lt;enumeration value="CustomerName"/>
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="NationalIdNumber"/>
 *     &lt;enumeration value="ClientOrderId"/>
 *     &lt;enumeration value="ContractLengthMonths"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortPaymentPlanProperty")
@XmlEnum
public enum SortPaymentPlanProperty {

    @XmlEnumValue("ApprovedDate")
    APPROVED_DATE("ApprovedDate"),
    @XmlEnumValue("Amount")
    AMOUNT("Amount"),
    @XmlEnumValue("ContractNumber")
    CONTRACT_NUMBER("ContractNumber"),
    @XmlEnumValue("PaidDate")
    PAID_DATE("PaidDate"),
    @XmlEnumValue("SveaOrderId")
    SVEA_ORDER_ID("SveaOrderId"),
    @XmlEnumValue("CustomerName")
    CUSTOMER_NAME("CustomerName"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("NationalIdNumber")
    NATIONAL_ID_NUMBER("NationalIdNumber"),
    @XmlEnumValue("ClientOrderId")
    CLIENT_ORDER_ID("ClientOrderId"),
    @XmlEnumValue("ContractLengthMonths")
    CONTRACT_LENGTH_MONTHS("ContractLengthMonths");
    private final String value;

    SortPaymentPlanProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortPaymentPlanProperty fromValue(String v) {
        for (SortPaymentPlanProperty c: SortPaymentPlanProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
