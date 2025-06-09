
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ОбязательностьСвойства.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ОбязательностьСвойства">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Для каталога"/>
 *     <enumeration value="Для документа"/>
 *     <enumeration value="Для предложений"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "\u041e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c\u0421\u0432\u043e\u0439\u0441\u0442\u0432\u0430")
@XmlEnum
public enum ОбязательностьСвойства {

    @XmlEnumValue("\u0414\u043b\u044f \u043a\u0430\u0442\u0430\u043b\u043e\u0433\u0430")
    ДЛЯ_КАТАЛОГА("\u0414\u043b\u044f \u043a\u0430\u0442\u0430\u043b\u043e\u0433\u0430"),
    @XmlEnumValue("\u0414\u043b\u044f \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0430")
    ДЛЯ_ДОКУМЕНТА("\u0414\u043b\u044f \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0430"),
    @XmlEnumValue("\u0414\u043b\u044f \u043f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u0439")
    ДЛЯ_ПРЕДЛОЖЕНИЙ("\u0414\u043b\u044f \u043f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u0439");
    private final String value;

    ОбязательностьСвойства(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ОбязательностьСвойства fromValue(String v) {
        for (ОбязательностьСвойства c: ОбязательностьСвойства.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
