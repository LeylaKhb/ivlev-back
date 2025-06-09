
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ХарактеристикаТовара complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ХарактеристикаТовара">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ид" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
 *         <element name="ИдСайта" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
 *         <element name="Наименование" type="{urn:1C.ru:commerceml_205}Наименование"/>
 *         <element name="Значение" type="{urn:1C.ru:commerceml_205}ЗначениеСвойства" minOccurs="0"/>
 *         <element name="ЗначенияСвойств" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ЗначенияСвойства" type="{urn:1C.ru:commerceml_205}ЗначенияСвойства" maxOccurs="unbounded"/>
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
@XmlType(name = "\u0425\u0430\u0440\u0430\u043a\u0442\u0435\u0440\u0438\u0441\u0442\u0438\u043a\u0430\u0422\u043e\u0432\u0430\u0440\u0430", propOrder = {
    "\u0438\u0434",
    "\u0438\u0434\u0421\u0430\u0439\u0442\u0430",
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435",
    "\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f\u0421\u0432\u043e\u0439\u0441\u0442\u0432"
})
public class ХарактеристикаТовара {

    @XmlElement(name = "\u0418\u0434")
    protected String ид;
    @XmlElement(name = "\u0418\u0434\u0421\u0430\u0439\u0442\u0430")
    protected String идСайта;
    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435", required = true)
    protected String наименование;
    @XmlElement(name = "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435")
    protected String значение;
    @XmlElement(name = "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u044f\u0421\u0432\u043e\u0439\u0441\u0442\u0432")
    protected ЗначенияСвойств значенияСвойств;

    /**
     * Gets the value of the ид property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИд() {
        return ид;
    }

    /**
     * Sets the value of the ид property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИд(String value) {
        this.ид = value;
    }

    /**
     * Gets the value of the идСайта property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИдСайта() {
        return идСайта;
    }

    /**
     * Sets the value of the идСайта property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИдСайта(String value) {
        this.идСайта = value;
    }

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
     * Gets the value of the значение property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getЗначение() {
        return значение;
    }

    /**
     * Sets the value of the значение property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setЗначение(String value) {
        this.значение = value;
    }

    /**
     * Gets the value of the значенияСвойств property.
     * 
     * @return
     *     possible object is
     *     {@link ЗначенияСвойств }
     *     
     */
    public ЗначенияСвойств getЗначенияСвойств() {
        return значенияСвойств;
    }

    /**
     * Sets the value of the значенияСвойств property.
     * 
     * @param value
     *     allowed object is
     *     {@link ЗначенияСвойств }
     *     
     */
    public void setЗначенияСвойств(ЗначенияСвойств value) {
        this.значенияСвойств = value;
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
     *         <element name="ЗначенияСвойства" type="{urn:1C.ru:commerceml_205}ЗначенияСвойства" maxOccurs="unbounded"/>
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
        "\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f\u0421\u0432\u043e\u0439\u0441\u0442\u0432\u0430"
    })
    public static class ЗначенияСвойств {

        @XmlElement(name = "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u044f\u0421\u0432\u043e\u0439\u0441\u0442\u0432\u0430", required = true)
        protected List<ЗначенияСвойства> значенияСвойства;

        /**
         * Gets the value of the значенияСвойства property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the значенияСвойства property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getЗначенияСвойства().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ЗначенияСвойства }
         * 
         * 
         * @return
         *     The value of the значенияСвойства property.
         */
        public List<ЗначенияСвойства> getЗначенияСвойства() {
            if (значенияСвойства == null) {
                значенияСвойства = new ArrayList<>();
            }
            return this.значенияСвойства;
        }

    }

}
