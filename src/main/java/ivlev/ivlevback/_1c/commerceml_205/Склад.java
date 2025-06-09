
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Склад complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Склад">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ид" type="{urn:1C.ru:commerceml_205}Идентификатор"/>
 *         <element name="Наименование" type="{urn:1C.ru:commerceml_205}Наименование" minOccurs="0"/>
 *         <element name="Комментарий" type="{urn:1C.ru:commerceml_205}Комментарий" minOccurs="0"/>
 *         <element name="Адрес" type="{urn:1C.ru:commerceml_205}Адрес" minOccurs="0"/>
 *         <element name="Контакты" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Контакт" type="{urn:1C.ru:commerceml_205}Контакт" maxOccurs="unbounded"/>
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
@XmlType(name = "\u0421\u043a\u043b\u0430\u0434", propOrder = {
    "\u0438\u0434",
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u043a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439",
    "\u0430\u0434\u0440\u0435\u0441",
    "\u043a\u043e\u043d\u0442\u0430\u043a\u0442\u044b"
})
public class Склад {

    @XmlElement(name = "\u0418\u0434", required = true)
    protected String ид;
    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435")
    protected String наименование;
    @XmlElement(name = "\u041a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439")
    protected String комментарий;
    @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441")
    protected Адрес адрес;
    @XmlElement(name = "\u041a\u043e\u043d\u0442\u0430\u043a\u0442\u044b")
    protected Контакты контакты;

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

    /**
     * Gets the value of the адрес property.
     * 
     * @return
     *     possible object is
     *     {@link Адрес }
     *     
     */
    public Адрес getАдрес() {
        return адрес;
    }

    /**
     * Sets the value of the адрес property.
     * 
     * @param value
     *     allowed object is
     *     {@link Адрес }
     *     
     */
    public void setАдрес(Адрес value) {
        this.адрес = value;
    }

    /**
     * Gets the value of the контакты property.
     * 
     * @return
     *     possible object is
     *     {@link Контакты }
     *     
     */
    public Контакты getКонтакты() {
        return контакты;
    }

    /**
     * Sets the value of the контакты property.
     * 
     * @param value
     *     allowed object is
     *     {@link Контакты }
     *     
     */
    public void setКонтакты(Контакты value) {
        this.контакты = value;
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
     *         <element name="Контакт" type="{urn:1C.ru:commerceml_205}Контакт" maxOccurs="unbounded"/>
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
        "\u043a\u043e\u043d\u0442\u0430\u043a\u0442"
    })
    public static class Контакты {

        @XmlElement(name = "\u041a\u043e\u043d\u0442\u0430\u043a\u0442", required = true)
        protected List<Контакт> контакт;

        /**
         * Gets the value of the контакт property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the контакт property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getКонтакт().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Контакт }
         * 
         * 
         * @return
         *     The value of the контакт property.
         */
        public List<Контакт> getКонтакт() {
            if (контакт == null) {
                контакт = new ArrayList<>();
            }
            return this.контакт;
        }

    }

}
