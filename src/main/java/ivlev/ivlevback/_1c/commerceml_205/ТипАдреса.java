
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ТипАдреса.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ТипАдреса">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Почтовый индекс"/>
 *     <enumeration value="Страна"/>
 *     <enumeration value="Регион"/>
 *     <enumeration value="Район"/>
 *     <enumeration value="Населенный пункт"/>
 *     <enumeration value="Город"/>
 *     <enumeration value="Улица"/>
 *     <enumeration value="Дом"/>
 *     <enumeration value="Корпус"/>
 *     <enumeration value="Квартира"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "\u0422\u0438\u043f\u0410\u0434\u0440\u0435\u0441\u0430")
@XmlEnum
public enum ТипАдреса {

    @XmlEnumValue("\u041f\u043e\u0447\u0442\u043e\u0432\u044b\u0439 \u0438\u043d\u0434\u0435\u043a\u0441")
    ПОЧТОВЫЙ_ИНДЕКС("\u041f\u043e\u0447\u0442\u043e\u0432\u044b\u0439 \u0438\u043d\u0434\u0435\u043a\u0441"),
    @XmlEnumValue("\u0421\u0442\u0440\u0430\u043d\u0430")
    СТРАНА("\u0421\u0442\u0440\u0430\u043d\u0430"),
    @XmlEnumValue("\u0420\u0435\u0433\u0438\u043e\u043d")
    РЕГИОН("\u0420\u0435\u0433\u0438\u043e\u043d"),
    @XmlEnumValue("\u0420\u0430\u0439\u043e\u043d")
    РАЙОН("\u0420\u0430\u0439\u043e\u043d"),
    @XmlEnumValue("\u041d\u0430\u0441\u0435\u043b\u0435\u043d\u043d\u044b\u0439 \u043f\u0443\u043d\u043a\u0442")
    НАСЕЛЕННЫЙ_ПУНКТ("\u041d\u0430\u0441\u0435\u043b\u0435\u043d\u043d\u044b\u0439 \u043f\u0443\u043d\u043a\u0442"),
    @XmlEnumValue("\u0413\u043e\u0440\u043e\u0434")
    ГОРОД("\u0413\u043e\u0440\u043e\u0434"),
    @XmlEnumValue("\u0423\u043b\u0438\u0446\u0430")
    УЛИЦА("\u0423\u043b\u0438\u0446\u0430"),
    @XmlEnumValue("\u0414\u043e\u043c")
    ДОМ("\u0414\u043e\u043c"),
    @XmlEnumValue("\u041a\u043e\u0440\u043f\u0443\u0441")
    КОРПУС("\u041a\u043e\u0440\u043f\u0443\u0441"),
    @XmlEnumValue("\u041a\u0432\u0430\u0440\u0442\u0438\u0440\u0430")
    КВАРТИРА("\u041a\u0432\u0430\u0440\u0442\u0438\u0440\u0430");
    private final String value;

    ТипАдреса(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ТипАдреса fromValue(String v) {
        for (ТипАдреса c: ТипАдреса.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
