
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Пол.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Пол">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="М"/>
 *     <enumeration value="Ж"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "\u041f\u043e\u043b")
@XmlEnum
public enum Пол {

    М,
    Ж;

    public String value() {
        return name();
    }

    public static Пол fromValue(String v) {
        return valueOf(v);
    }

}
