
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for СтатусТовара.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="СтатусТовара">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Новый"/>
 *     <enumeration value="Изменен"/>
 *     <enumeration value="Удален"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "\u0421\u0442\u0430\u0442\u0443\u0441\u0422\u043e\u0432\u0430\u0440\u0430")
@XmlEnum
public enum СтатусТовара {

    @XmlEnumValue("\u041d\u043e\u0432\u044b\u0439")
    НОВЫЙ("\u041d\u043e\u0432\u044b\u0439"),
    @XmlEnumValue("\u0418\u0437\u043c\u0435\u043d\u0435\u043d")
    ИЗМЕНЕН("\u0418\u0437\u043c\u0435\u043d\u0435\u043d"),
    @XmlEnumValue("\u0423\u0434\u0430\u043b\u0435\u043d")
    УДАЛЕН("\u0423\u0434\u0430\u043b\u0435\u043d");
    private final String value;

    СтатусТовара(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static СтатусТовара fromValue(String v) {
        for (СтатусТовара c: СтатусТовара.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
