
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ТипЗначенийСвойства.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ТипЗначенийСвойства">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Строка"/>
 *     <enumeration value="Число"/>
 *     <enumeration value="Время"/>
 *     <enumeration value="Справочник"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "\u0422\u0438\u043f\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0439\u0421\u0432\u043e\u0439\u0441\u0442\u0432\u0430")
@XmlEnum
public enum ТипЗначенийСвойства {

    @XmlEnumValue("\u0421\u0442\u0440\u043e\u043a\u0430")
    СТРОКА("\u0421\u0442\u0440\u043e\u043a\u0430"),
    @XmlEnumValue("\u0427\u0438\u0441\u043b\u043e")
    ЧИСЛО("\u0427\u0438\u0441\u043b\u043e"),
    @XmlEnumValue("\u0412\u0440\u0435\u043c\u044f")
    ВРЕМЯ("\u0412\u0440\u0435\u043c\u044f"),
    @XmlEnumValue("\u0421\u043f\u0440\u0430\u0432\u043e\u0447\u043d\u0438\u043a")
    СПРАВОЧНИК("\u0421\u043f\u0440\u0430\u0432\u043e\u0447\u043d\u0438\u043a");
    private final String value;

    ТипЗначенийСвойства(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ТипЗначенийСвойства fromValue(String v) {
        for (ТипЗначенийСвойства c: ТипЗначенийСвойства.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
