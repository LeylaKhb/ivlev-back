
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Классификатор complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Классификатор">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ид" type="{urn:1C.ru:commerceml_205}Идентификатор"/>
 *         <element name="Наименование" type="{urn:1C.ru:commerceml_205}Наименование"/>
 *         <element name="Владелец" type="{urn:1C.ru:commerceml_205}Контрагент"/>
 *         <element name="Описание" type="{urn:1C.ru:commerceml_205}Комментарий" minOccurs="0"/>
 *         <element name="Группы" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Группа" type="{urn:1C.ru:commerceml_205}Группа" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Свойства" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Свойство" type="{urn:1C.ru:commerceml_205}Свойство" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ТипыЦен" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ТипЦены" type="{urn:1C.ru:commerceml_205}ТипЦены" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Категории" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Категория" type="{urn:1C.ru:commerceml_205}Категория" maxOccurs="unbounded"/>
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
@XmlType(name = "\u041a\u043b\u0430\u0441\u0441\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440", propOrder = {
    "\u0438\u0434",
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u0432\u043b\u0430\u0434\u0435\u043b\u0435\u0446",
    "\u043e\u043f\u0438\u0441\u0430\u043d\u0438\u0435",
    "\u0433\u0440\u0443\u043f\u043f\u044b",
    "\u0441\u0432\u043e\u0439\u0441\u0442\u0432\u0430",
    "\u0442\u0438\u043f\u044b\u0426\u0435\u043d",
    "\u043a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u0438"
})
public class Классификатор {

    @XmlElement(name = "\u0418\u0434", required = true)
    protected String ид;
    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435", required = true)
    protected String наименование;
    @XmlElement(name = "\u0412\u043b\u0430\u0434\u0435\u043b\u0435\u0446", required = true)
    protected Контрагент владелец;
    @XmlElement(name = "\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435")
    protected String описание;
    @XmlElement(name = "\u0413\u0440\u0443\u043f\u043f\u044b")
    protected Группы группы;
    @XmlElement(name = "\u0421\u0432\u043e\u0439\u0441\u0442\u0432\u0430")
    protected Свойства свойства;
    @XmlElement(name = "\u0422\u0438\u043f\u044b\u0426\u0435\u043d")
    protected ТипыЦен типыЦен;
    @XmlElement(name = "\u041a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u0438")
    protected Категории категории;

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
     * Gets the value of the владелец property.
     * 
     * @return
     *     possible object is
     *     {@link Контрагент }
     *     
     */
    public Контрагент getВладелец() {
        return владелец;
    }

    /**
     * Sets the value of the владелец property.
     * 
     * @param value
     *     allowed object is
     *     {@link Контрагент }
     *     
     */
    public void setВладелец(Контрагент value) {
        this.владелец = value;
    }

    /**
     * Gets the value of the описание property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОписание() {
        return описание;
    }

    /**
     * Sets the value of the описание property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОписание(String value) {
        this.описание = value;
    }

    /**
     * Gets the value of the группы property.
     * 
     * @return
     *     possible object is
     *     {@link Группы }
     *     
     */
    public Группы getГруппы() {
        return группы;
    }

    /**
     * Sets the value of the группы property.
     * 
     * @param value
     *     allowed object is
     *     {@link Группы }
     *     
     */
    public void setГруппы(Группы value) {
        this.группы = value;
    }

    /**
     * Gets the value of the свойства property.
     * 
     * @return
     *     possible object is
     *     {@link Свойства }
     *     
     */
    public Свойства getСвойства() {
        return свойства;
    }

    /**
     * Sets the value of the свойства property.
     * 
     * @param value
     *     allowed object is
     *     {@link Свойства }
     *     
     */
    public void setСвойства(Свойства value) {
        this.свойства = value;
    }

    /**
     * Gets the value of the типыЦен property.
     * 
     * @return
     *     possible object is
     *     {@link ТипыЦен }
     *     
     */
    public ТипыЦен getТипыЦен() {
        return типыЦен;
    }

    /**
     * Sets the value of the типыЦен property.
     * 
     * @param value
     *     allowed object is
     *     {@link ТипыЦен }
     *     
     */
    public void setТипыЦен(ТипыЦен value) {
        this.типыЦен = value;
    }

    /**
     * Gets the value of the категории property.
     * 
     * @return
     *     possible object is
     *     {@link Категории }
     *     
     */
    public Категории getКатегории() {
        return категории;
    }

    /**
     * Sets the value of the категории property.
     * 
     * @param value
     *     allowed object is
     *     {@link Категории }
     *     
     */
    public void setКатегории(Категории value) {
        this.категории = value;
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
     *         <element name="Группа" type="{urn:1C.ru:commerceml_205}Группа" maxOccurs="unbounded"/>
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
        "\u0433\u0440\u0443\u043f\u043f\u0430"
    })
    public static class Группы {

        @XmlElement(name = "\u0413\u0440\u0443\u043f\u043f\u0430", required = true)
        protected List<Группа> группа;

        /**
         * Gets the value of the группа property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the группа property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getГруппа().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Группа }
         * 
         * 
         * @return
         *     The value of the группа property.
         */
        public List<Группа> getГруппа() {
            if (группа == null) {
                группа = new ArrayList<>();
            }
            return this.группа;
        }

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
     *         <element name="Категория" type="{urn:1C.ru:commerceml_205}Категория" maxOccurs="unbounded"/>
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
        "\u043a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u044f"
    })
    public static class Категории {

        @XmlElement(name = "\u041a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u044f", required = true)
        protected List<Категория> категория;

        /**
         * Gets the value of the категория property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the категория property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getКатегория().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Категория }
         * 
         * 
         * @return
         *     The value of the категория property.
         */
        public List<Категория> getКатегория() {
            if (категория == null) {
                категория = new ArrayList<>();
            }
            return this.категория;
        }

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
     *         <element name="Свойство" type="{urn:1C.ru:commerceml_205}Свойство" maxOccurs="unbounded"/>
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
        "\u0441\u0432\u043e\u0439\u0441\u0442\u0432\u043e"
    })
    public static class Свойства {

        @XmlElement(name = "\u0421\u0432\u043e\u0439\u0441\u0442\u0432\u043e", required = true)
        protected List<Свойство> свойство;

        /**
         * Gets the value of the свойство property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the свойство property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getСвойство().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Свойство }
         * 
         * 
         * @return
         *     The value of the свойство property.
         */
        public List<Свойство> getСвойство() {
            if (свойство == null) {
                свойство = new ArrayList<>();
            }
            return this.свойство;
        }

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
     *         <element name="ТипЦены" type="{urn:1C.ru:commerceml_205}ТипЦены" maxOccurs="unbounded"/>
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
        "\u0442\u0438\u043f\u0426\u0435\u043d\u044b"
    })
    public static class ТипыЦен {

        @XmlElement(name = "\u0422\u0438\u043f\u0426\u0435\u043d\u044b", required = true)
        protected List<ТипЦены> типЦены;

        /**
         * Gets the value of the типЦены property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the типЦены property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getТипЦены().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ТипЦены }
         * 
         * 
         * @return
         *     The value of the типЦены property.
         */
        public List<ТипЦены> getТипЦены() {
            if (типЦены == null) {
                типЦены = new ArrayList<>();
            }
            return this.типЦены;
        }

    }

}
