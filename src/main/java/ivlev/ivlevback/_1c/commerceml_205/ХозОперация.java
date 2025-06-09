
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ХозОперация.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ХозОперация">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Заказ товара"/>
 *     <enumeration value="Счет на оплату"/>
 *     <enumeration value="Отпуск товара"/>
 *     <enumeration value="Счет-фактура"/>
 *     <enumeration value="Возврат товара"/>
 *     <enumeration value="Передача товара на комиссию"/>
 *     <enumeration value="Возврат комиссионного товара"/>
 *     <enumeration value="Отчет о продажах комиссионного товара"/>
 *     <enumeration value="Выплата наличных денег"/>
 *     <enumeration value="Возврат наличных денег"/>
 *     <enumeration value="Выплата безналичных денег"/>
 *     <enumeration value="Возврат безналичных денег"/>
 *     <enumeration value="Переоценка товаров"/>
 *     <enumeration value="Прочие"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "\u0425\u043e\u0437\u041e\u043f\u0435\u0440\u0430\u0446\u0438\u044f")
@XmlEnum
public enum ХозОперация {

    @XmlEnumValue("\u0417\u0430\u043a\u0430\u0437 \u0442\u043e\u0432\u0430\u0440\u0430")
    ЗАКАЗ_ТОВАРА("\u0417\u0430\u043a\u0430\u0437 \u0442\u043e\u0432\u0430\u0440\u0430"),
    @XmlEnumValue("\u0421\u0447\u0435\u0442 \u043d\u0430 \u043e\u043f\u043b\u0430\u0442\u0443")
    СЧЕТ_НА_ОПЛАТУ("\u0421\u0447\u0435\u0442 \u043d\u0430 \u043e\u043f\u043b\u0430\u0442\u0443"),
    @XmlEnumValue("\u041e\u0442\u043f\u0443\u0441\u043a \u0442\u043e\u0432\u0430\u0440\u0430")
    ОТПУСК_ТОВАРА("\u041e\u0442\u043f\u0443\u0441\u043a \u0442\u043e\u0432\u0430\u0440\u0430"),
    @XmlEnumValue("\u0421\u0447\u0435\u0442-\u0444\u0430\u043a\u0442\u0443\u0440\u0430")
    СЧЕТ_ФАКТУРА("\u0421\u0447\u0435\u0442-\u0444\u0430\u043a\u0442\u0443\u0440\u0430"),
    @XmlEnumValue("\u0412\u043e\u0437\u0432\u0440\u0430\u0442 \u0442\u043e\u0432\u0430\u0440\u0430")
    ВОЗВРАТ_ТОВАРА("\u0412\u043e\u0437\u0432\u0440\u0430\u0442 \u0442\u043e\u0432\u0430\u0440\u0430"),
    @XmlEnumValue("\u041f\u0435\u0440\u0435\u0434\u0430\u0447\u0430 \u0442\u043e\u0432\u0430\u0440\u0430 \u043d\u0430 \u043a\u043e\u043c\u0438\u0441\u0441\u0438\u044e")
    ПЕРЕДАЧА_ТОВАРА_НА_КОМИССИЮ("\u041f\u0435\u0440\u0435\u0434\u0430\u0447\u0430 \u0442\u043e\u0432\u0430\u0440\u0430 \u043d\u0430 \u043a\u043e\u043c\u0438\u0441\u0441\u0438\u044e"),
    @XmlEnumValue("\u0412\u043e\u0437\u0432\u0440\u0430\u0442 \u043a\u043e\u043c\u0438\u0441\u0441\u0438\u043e\u043d\u043d\u043e\u0433\u043e \u0442\u043e\u0432\u0430\u0440\u0430")
    ВОЗВРАТ_КОМИССИОННОГО_ТОВАРА("\u0412\u043e\u0437\u0432\u0440\u0430\u0442 \u043a\u043e\u043c\u0438\u0441\u0441\u0438\u043e\u043d\u043d\u043e\u0433\u043e \u0442\u043e\u0432\u0430\u0440\u0430"),
    @XmlEnumValue("\u041e\u0442\u0447\u0435\u0442 \u043e \u043f\u0440\u043e\u0434\u0430\u0436\u0430\u0445 \u043a\u043e\u043c\u0438\u0441\u0441\u0438\u043e\u043d\u043d\u043e\u0433\u043e \u0442\u043e\u0432\u0430\u0440\u0430")
    ОТЧЕТ_О_ПРОДАЖАХ_КОМИССИОННОГО_ТОВАРА("\u041e\u0442\u0447\u0435\u0442 \u043e \u043f\u0440\u043e\u0434\u0430\u0436\u0430\u0445 \u043a\u043e\u043c\u0438\u0441\u0441\u0438\u043e\u043d\u043d\u043e\u0433\u043e \u0442\u043e\u0432\u0430\u0440\u0430"),
    @XmlEnumValue("\u0412\u044b\u043f\u043b\u0430\u0442\u0430 \u043d\u0430\u043b\u0438\u0447\u043d\u044b\u0445 \u0434\u0435\u043d\u0435\u0433")
    ВЫПЛАТА_НАЛИЧНЫХ_ДЕНЕГ("\u0412\u044b\u043f\u043b\u0430\u0442\u0430 \u043d\u0430\u043b\u0438\u0447\u043d\u044b\u0445 \u0434\u0435\u043d\u0435\u0433"),
    @XmlEnumValue("\u0412\u043e\u0437\u0432\u0440\u0430\u0442 \u043d\u0430\u043b\u0438\u0447\u043d\u044b\u0445 \u0434\u0435\u043d\u0435\u0433")
    ВОЗВРАТ_НАЛИЧНЫХ_ДЕНЕГ("\u0412\u043e\u0437\u0432\u0440\u0430\u0442 \u043d\u0430\u043b\u0438\u0447\u043d\u044b\u0445 \u0434\u0435\u043d\u0435\u0433"),
    @XmlEnumValue("\u0412\u044b\u043f\u043b\u0430\u0442\u0430 \u0431\u0435\u0437\u043d\u0430\u043b\u0438\u0447\u043d\u044b\u0445 \u0434\u0435\u043d\u0435\u0433")
    ВЫПЛАТА_БЕЗНАЛИЧНЫХ_ДЕНЕГ("\u0412\u044b\u043f\u043b\u0430\u0442\u0430 \u0431\u0435\u0437\u043d\u0430\u043b\u0438\u0447\u043d\u044b\u0445 \u0434\u0435\u043d\u0435\u0433"),
    @XmlEnumValue("\u0412\u043e\u0437\u0432\u0440\u0430\u0442 \u0431\u0435\u0437\u043d\u0430\u043b\u0438\u0447\u043d\u044b\u0445 \u0434\u0435\u043d\u0435\u0433")
    ВОЗВРАТ_БЕЗНАЛИЧНЫХ_ДЕНЕГ("\u0412\u043e\u0437\u0432\u0440\u0430\u0442 \u0431\u0435\u0437\u043d\u0430\u043b\u0438\u0447\u043d\u044b\u0445 \u0434\u0435\u043d\u0435\u0433"),
    @XmlEnumValue("\u041f\u0435\u0440\u0435\u043e\u0446\u0435\u043d\u043a\u0430 \u0442\u043e\u0432\u0430\u0440\u043e\u0432")
    ПЕРЕОЦЕНКА_ТОВАРОВ("\u041f\u0435\u0440\u0435\u043e\u0446\u0435\u043d\u043a\u0430 \u0442\u043e\u0432\u0430\u0440\u043e\u0432"),
    @XmlEnumValue("\u041f\u0440\u043e\u0447\u0438\u0435")
    ПРОЧИЕ("\u041f\u0440\u043e\u0447\u0438\u0435");
    private final String value;

    ХозОперация(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ХозОперация fromValue(String v) {
        for (ХозОперация c: ХозОперация.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
