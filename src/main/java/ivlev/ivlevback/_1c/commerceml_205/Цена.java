
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Цена complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Цена">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Представление" type="{urn:1C.ru:commerceml_205}Наименование" minOccurs="0"/>
 *         <element name="ИдТипаЦены" type="{urn:1C.ru:commerceml_205}Идентификатор"/>
 *         <element name="ЦенаЗаЕдиницу" type="{urn:1C.ru:commerceml_205}Сумма"/>
 *         <element name="Валюта" type="{urn:1C.ru:commerceml_205}КодВалюты" minOccurs="0"/>
 *         <element name="Единица" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Коэффициент" type="{urn:1C.ru:commerceml_205}Коэффициент" minOccurs="0"/>
 *         <element name="ДополнительныеДанные" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ЗначениеРеквизита" type="{urn:1C.ru:commerceml_205}ЗначениеРеквизита" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="МинКоличество" type="{urn:1C.ru:commerceml_205}Количество" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0426\u0435\u043d\u0430", propOrder = {
    "\u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u0438\u0435",
    "\u0438\u0434\u0422\u0438\u043f\u0430\u0426\u0435\u043d\u044b",
    "\u0446\u0435\u043d\u0430\u0417\u0430\u0415\u0434\u0438\u043d\u0438\u0446\u0443",
    "\u0432\u0430\u043b\u044e\u0442\u0430",
    "\u0435\u0434\u0438\u043d\u0438\u0446\u0430",
    "\u043a\u043e\u044d\u0444\u0444\u0438\u0446\u0438\u0435\u043d\u0442",
    "\u0434\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0435\u0414\u0430\u043d\u043d\u044b\u0435",
    "\u043c\u0438\u043d\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e"
})
public class Цена {

    @XmlElement(name = "\u041f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u0438\u0435")
    protected String представление;
    @XmlElement(name = "\u0418\u0434\u0422\u0438\u043f\u0430\u0426\u0435\u043d\u044b", required = true)
    protected String идТипаЦены;
    @XmlElement(name = "\u0426\u0435\u043d\u0430\u0417\u0430\u0415\u0434\u0438\u043d\u0438\u0446\u0443", required = true)
    protected BigDecimal ценаЗаЕдиницу;
    @XmlElement(name = "\u0412\u0430\u043b\u044e\u0442\u0430")
    protected String валюта;
    @XmlElement(name = "\u0415\u0434\u0438\u043d\u0438\u0446\u0430")
    protected String единица;
    @XmlElement(name = "\u041a\u043e\u044d\u0444\u0444\u0438\u0446\u0438\u0435\u043d\u0442")
    protected String коэффициент;
    @XmlElement(name = "\u0414\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0435\u0414\u0430\u043d\u043d\u044b\u0435")
    protected ДополнительныеДанные дополнительныеДанные;
    @XmlElement(name = "\u041c\u0438\u043d\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e")
    protected BigDecimal минКоличество;

    /**
     * Gets the value of the представление property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПредставление() {
        return представление;
    }

    /**
     * Sets the value of the представление property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПредставление(String value) {
        this.представление = value;
    }

    /**
     * Gets the value of the идТипаЦены property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИдТипаЦены() {
        return идТипаЦены;
    }

    /**
     * Sets the value of the идТипаЦены property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИдТипаЦены(String value) {
        this.идТипаЦены = value;
    }

    /**
     * Gets the value of the ценаЗаЕдиницу property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getЦенаЗаЕдиницу() {
        return ценаЗаЕдиницу;
    }

    /**
     * Sets the value of the ценаЗаЕдиницу property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setЦенаЗаЕдиницу(BigDecimal value) {
        this.ценаЗаЕдиницу = value;
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

    /**
     * Gets the value of the единица property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getЕдиница() {
        return единица;
    }

    /**
     * Sets the value of the единица property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setЕдиница(String value) {
        this.единица = value;
    }

    /**
     * Gets the value of the коэффициент property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКоэффициент() {
        return коэффициент;
    }

    /**
     * Sets the value of the коэффициент property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКоэффициент(String value) {
        this.коэффициент = value;
    }

    /**
     * Gets the value of the дополнительныеДанные property.
     * 
     * @return
     *     possible object is
     *     {@link ДополнительныеДанные }
     *     
     */
    public ДополнительныеДанные getДополнительныеДанные() {
        return дополнительныеДанные;
    }

    /**
     * Sets the value of the дополнительныеДанные property.
     * 
     * @param value
     *     allowed object is
     *     {@link ДополнительныеДанные }
     *     
     */
    public void setДополнительныеДанные(ДополнительныеДанные value) {
        this.дополнительныеДанные = value;
    }

    /**
     * Gets the value of the минКоличество property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getМинКоличество() {
        return минКоличество;
    }

    /**
     * Sets the value of the минКоличество property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setМинКоличество(BigDecimal value) {
        this.минКоличество = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="ЗначениеРеквизита" type="{urn:1C.ru:commerceml_205}ЗначениеРеквизита" maxOccurs="unbounded"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u0430"
    })
    public static class ДополнительныеДанные {

        @XmlElement(name = "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u0430", required = true)
        protected List<ЗначениеРеквизита> значениеРеквизита;

        /**
         * Gets the value of the значениеРеквизита property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the значениеРеквизита property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getЗначениеРеквизита().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ЗначениеРеквизита }
         * 
         * 
         * @return
         *     The value of the значениеРеквизита property.
         */
        public List<ЗначениеРеквизита> getЗначениеРеквизита() {
            if (значениеРеквизита == null) {
                значениеРеквизита = new ArrayList<>();
            }
            return this.значениеРеквизита;
        }

    }

}
