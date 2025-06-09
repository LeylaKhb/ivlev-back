
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Роль.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Роль">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Продавец"/>
 *     <enumeration value="Покупатель"/>
 *     <enumeration value="Плательщик"/>
 *     <enumeration value="Получатель"/>
 *     <enumeration value="Комитент"/>
 *     <enumeration value="Комиссионер"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "\u0420\u043e\u043b\u044c")
@XmlEnum
public enum Роль {

    @XmlEnumValue("\u041f\u0440\u043e\u0434\u0430\u0432\u0435\u0446")
    ПРОДАВЕЦ("\u041f\u0440\u043e\u0434\u0430\u0432\u0435\u0446"),
    @XmlEnumValue("\u041f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044c")
    ПОКУПАТЕЛЬ("\u041f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044c"),
    @XmlEnumValue("\u041f\u043b\u0430\u0442\u0435\u043b\u044c\u0449\u0438\u043a")
    ПЛАТЕЛЬЩИК("\u041f\u043b\u0430\u0442\u0435\u043b\u044c\u0449\u0438\u043a"),
    @XmlEnumValue("\u041f\u043e\u043b\u0443\u0447\u0430\u0442\u0435\u043b\u044c")
    ПОЛУЧАТЕЛЬ("\u041f\u043e\u043b\u0443\u0447\u0430\u0442\u0435\u043b\u044c"),
    @XmlEnumValue("\u041a\u043e\u043c\u0438\u0442\u0435\u043d\u0442")
    КОМИТЕНТ("\u041a\u043e\u043c\u0438\u0442\u0435\u043d\u0442"),
    @XmlEnumValue("\u041a\u043e\u043c\u0438\u0441\u0441\u0438\u043e\u043d\u0435\u0440")
    КОМИССИОНЕР("\u041a\u043e\u043c\u0438\u0441\u0441\u0438\u043e\u043d\u0435\u0440");
    private final String value;

    Роль(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Роль fromValue(String v) {
        for (Роль c: Роль.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
