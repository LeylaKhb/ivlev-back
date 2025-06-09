
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;


/**
 * <p>Java class for Скидка complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Скидка">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Наименование" type="{urn:1C.ru:commerceml_205}Наименование"/>
 *         <element name="Сумма" type="{urn:1C.ru:commerceml_205}Сумма"/>
 *         <element name="Процент" type="{urn:1C.ru:commerceml_205}Процент" minOccurs="0"/>
 *         <element name="УчтеноВСумме" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Комментарий" type="{urn:1C.ru:commerceml_205}Комментарий" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0421\u043a\u0438\u0434\u043a\u0430", propOrder = {
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u0441\u0443\u043c\u043c\u0430",
    "\u043f\u0440\u043e\u0446\u0435\u043d\u0442",
    "\u0443\u0447\u0442\u0435\u043d\u043e\u0412\u0421\u0443\u043c\u043c\u0435",
    "\u043a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439"
})
public class Скидка {

    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435", required = true)
    protected String наименование;
    @XmlElement(name = "\u0421\u0443\u043c\u043c\u0430", required = true)
    protected BigDecimal сумма;
    @XmlElement(name = "\u041f\u0440\u043e\u0446\u0435\u043d\u0442")
    protected BigDecimal процент;
    @XmlElement(name = "\u0423\u0447\u0442\u0435\u043d\u043e\u0412\u0421\u0443\u043c\u043c\u0435")
    protected Boolean учтеноВСумме;
    @XmlElement(name = "\u041a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439")
    protected String комментарий;

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
     * Gets the value of the сумма property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getСумма() {
        return сумма;
    }

    /**
     * Sets the value of the сумма property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setСумма(BigDecimal value) {
        this.сумма = value;
    }

    /**
     * Gets the value of the процент property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getПроцент() {
        return процент;
    }

    /**
     * Sets the value of the процент property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setПроцент(BigDecimal value) {
        this.процент = value;
    }

    /**
     * Gets the value of the учтеноВСумме property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isУчтеноВСумме() {
        return учтеноВСумме;
    }

    /**
     * Sets the value of the учтеноВСумме property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setУчтеноВСумме(Boolean value) {
        this.учтеноВСумме = value;
    }

    /**
     * Gets the value of the комментарий property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКомментарий() {
        return комментарий;
    }

    /**
     * Sets the value of the комментарий property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКомментарий(String value) {
        this.комментарий = value;
    }

}
