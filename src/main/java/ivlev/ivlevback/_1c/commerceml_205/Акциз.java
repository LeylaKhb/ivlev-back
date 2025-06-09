
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;


/**
 * <p>Java class for Акциз complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Акциз">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Наименование" type="{urn:1C.ru:commerceml_205}Наименование"/>
 *         <element name="СуммаЗаЕдиницу" type="{urn:1C.ru:commerceml_205}Сумма"/>
 *         <element name="Валюта" type="{urn:1C.ru:commerceml_205}КодВалюты"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0410\u043a\u0446\u0438\u0437", propOrder = {
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u0441\u0443\u043c\u043c\u0430\u0417\u0430\u0415\u0434\u0438\u043d\u0438\u0446\u0443",
    "\u0432\u0430\u043b\u044e\u0442\u0430"
})
public class Акциз {

    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435", required = true)
    protected String наименование;
    @XmlElement(name = "\u0421\u0443\u043c\u043c\u0430\u0417\u0430\u0415\u0434\u0438\u043d\u0438\u0446\u0443", required = true)
    protected BigDecimal суммаЗаЕдиницу;
    @XmlElement(name = "\u0412\u0430\u043b\u044e\u0442\u0430", required = true)
    protected String валюта;

    /**
     * Gets the value of the наименование property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаименование() {
        return наименование;
    }

    /**
     * Sets the value of the наименование property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаименование(String value) {
        this.наименование = value;
    }

    /**
     * Gets the value of the суммаЗаЕдиницу property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getСуммаЗаЕдиницу() {
        return суммаЗаЕдиницу;
    }

    /**
     * Sets the value of the суммаЗаЕдиницу property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setСуммаЗаЕдиницу(BigDecimal value) {
        this.суммаЗаЕдиницу = value;
    }

    /**
     * Gets the value of the валюта property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВалюта() {
        return валюта;
    }

    /**
     * Sets the value of the валюта property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВалюта(String value) {
        this.валюта = value;
    }

}
