
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Пересчет complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Пересчет">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
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
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041f\u0435\u0440\u0435\u0441\u0447\u0435\u0442", propOrder = {
    "\u0435\u0434\u0438\u043d\u0438\u0446\u0430",
    "\u043a\u043e\u044d\u0444\u0444\u0438\u0446\u0438\u0435\u043d\u0442",
    "\u0434\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0435\u0414\u0430\u043d\u043d\u044b\u0435"
})
public class Пересчет {

    @XmlElement(name = "\u0415\u0434\u0438\u043d\u0438\u0446\u0430")
    protected String единица;
    @XmlElement(name = "\u041a\u043e\u044d\u0444\u0444\u0438\u0446\u0438\u0435\u043d\u0442")
    protected String коэффициент;
    @XmlElement(name = "\u0414\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0435\u0414\u0430\u043d\u043d\u044b\u0435")
    protected ДополнительныеДанные дополнительныеДанные;

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
