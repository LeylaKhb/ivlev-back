
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ТипКонтакта.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ТипКонтакта">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <minLength value="1"/>
 *     <maxLength value="100"/>
 *     <enumeration value="Телефон внутренний"/>
 *     <enumeration value="Телефон рабочий"/>
 *     <enumeration value="Телефон мобильный"/>
 *     <enumeration value="Телефон домашний"/>
 *     <enumeration value="Пейджер"/>
 *     <enumeration value="Факс"/>
 *     <enumeration value="Почта"/>
 *     <enumeration value="ICQ"/>
 *     <enumeration value="ВебСайт"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "\u0422\u0438\u043f\u041a\u043e\u043d\u0442\u0430\u043a\u0442\u0430")
@XmlEnum
public enum ТипКонтакта {

    @XmlEnumValue("\u0422\u0435\u043b\u0435\u0444\u043e\u043d \u0432\u043d\u0443\u0442\u0440\u0435\u043d\u043d\u0438\u0439")
    ТЕЛЕФОН_ВНУТРЕННИЙ("\u0422\u0435\u043b\u0435\u0444\u043e\u043d \u0432\u043d\u0443\u0442\u0440\u0435\u043d\u043d\u0438\u0439"),
    @XmlEnumValue("\u0422\u0435\u043b\u0435\u0444\u043e\u043d \u0440\u0430\u0431\u043e\u0447\u0438\u0439")
    ТЕЛЕФОН_РАБОЧИЙ("\u0422\u0435\u043b\u0435\u0444\u043e\u043d \u0440\u0430\u0431\u043e\u0447\u0438\u0439"),
    @XmlEnumValue("\u0422\u0435\u043b\u0435\u0444\u043e\u043d \u043c\u043e\u0431\u0438\u043b\u044c\u043d\u044b\u0439")
    ТЕЛЕФОН_МОБИЛЬНЫЙ("\u0422\u0435\u043b\u0435\u0444\u043e\u043d \u043c\u043e\u0431\u0438\u043b\u044c\u043d\u044b\u0439"),
    @XmlEnumValue("\u0422\u0435\u043b\u0435\u0444\u043e\u043d \u0434\u043e\u043c\u0430\u0448\u043d\u0438\u0439")
    ТЕЛЕФОН_ДОМАШНИЙ("\u0422\u0435\u043b\u0435\u0444\u043e\u043d \u0434\u043e\u043c\u0430\u0448\u043d\u0438\u0439"),
    @XmlEnumValue("\u041f\u0435\u0439\u0434\u0436\u0435\u0440")
    ПЕЙДЖЕР("\u041f\u0435\u0439\u0434\u0436\u0435\u0440"),
    @XmlEnumValue("\u0424\u0430\u043a\u0441")
    ФАКС("\u0424\u0430\u043a\u0441"),
    @XmlEnumValue("\u041f\u043e\u0447\u0442\u0430")
    ПОЧТА("\u041f\u043e\u0447\u0442\u0430"),
    ICQ("ICQ"),
    @XmlEnumValue("\u0412\u0435\u0431\u0421\u0430\u0439\u0442")
    ВЕБ_САЙТ("\u0412\u0435\u0431\u0421\u0430\u0439\u0442");
    private final String value;

    ТипКонтакта(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ТипКонтакта fromValue(String v) {
        for (ТипКонтакта c: ТипКонтакта.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
