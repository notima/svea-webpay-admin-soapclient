
package se.sveaekonomi.partnerweb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextMatchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TextMatchType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AllFields"/&gt;
 *     &lt;enumeration value="SveaOrderId"/&gt;
 *     &lt;enumeration value="ClientOrderNumber"/&gt;
 *     &lt;enumeration value="NationalIdNumber"/&gt;
 *     &lt;enumeration value="ContractNumber"/&gt;
 *     &lt;enumeration value="AccountCreditId"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TextMatchType", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Search.AccountCredit")
@XmlEnum
public enum TextMatchType3 {

    @XmlEnumValue("AllFields")
    ALL_FIELDS("AllFields"),
    @XmlEnumValue("SveaOrderId")
    SVEA_ORDER_ID("SveaOrderId"),
    @XmlEnumValue("ClientOrderNumber")
    CLIENT_ORDER_NUMBER("ClientOrderNumber"),
    @XmlEnumValue("NationalIdNumber")
    NATIONAL_ID_NUMBER("NationalIdNumber"),
    @XmlEnumValue("ContractNumber")
    CONTRACT_NUMBER("ContractNumber"),
    @XmlEnumValue("AccountCreditId")
    ACCOUNT_CREDIT_ID("AccountCreditId");
    private final String value;

    TextMatchType3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextMatchType3 fromValue(String v) {
        for (TextMatchType3 c: TextMatchType3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
