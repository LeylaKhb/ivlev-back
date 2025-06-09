
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ВариантыЗначенийСвойства complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ВариантыЗначенийСвойства">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Значение" type="{urn:1C.ru:commerceml_205}ЗначениеСвойства" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Справочник" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ИдЗначения" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
 *                   <element name="Значение" type="{urn:1C.ru:commerceml_205}ЗначениеСвойства"/>
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
@XmlType(name = "\u0412\u0430\u0440\u0438\u0430\u043d\u0442\u044b\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0439\u0421\u0432\u043e\u0439\u0441\u0442\u0432\u0430", propOrder = {
    "\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435",
    "\u0441\u043f\u0440\u0430\u0432\u043e\u0447\u043d\u0438\u043a"
})
public class ВариантыЗначенийСвойства {

    @XmlElement(name = "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435")
    protected List<String> значение;
    @XmlElement(name = "\u0421\u043f\u0440\u0430\u0432\u043e\u0447\u043d\u0438\u043a")
    protected List<Справочник> справочник;

    /**
     * Gets the value of the значение property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the значение property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getЗначение().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the значение property.
     */
    public List<String> getЗначение() {
        if (значение == null) {
            значение = new ArrayList<>();
        }
        return this.значение;
    }

    /**
     * Gets the value of the справочник property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the справочник property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСправочник().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Справочник }
     * 
     * 
     * @return
     *     The value of the справочник property.
     */
    public List<Справочник> getСправочник() {
        if (справочник == null) {
            справочник = new ArrayList<>();
        }
        return this.справочник;
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
     *         <element name="ИдЗначения" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
     *         <element name="Значение" type="{urn:1C.ru:commerceml_205}ЗначениеСвойства"/>
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
        "\u0438\u0434\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u044f",
        "\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435"
    })
    public static class Справочник {

        @XmlElement(name = "\u0418\u0434\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u044f")
        protected String идЗначения;
        @XmlElement(name = "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435", required = true)
        protected String значение;

        /**
         * Gets the value of the идЗначения property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getИдЗначения() {
            return идЗначения;
        }

        /**
         * Sets the value of the идЗначения property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setИдЗначения(String value) {
            this.идЗначения = value;
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

    }

}
