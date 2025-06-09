
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ПакетПредложений complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ПакетПредложений">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ид" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
 *         <element name="Наименование" type="{urn:1C.ru:commerceml_205}Наименование"/>
 *         <element name="ИдКаталога" type="{urn:1C.ru:commerceml_205}Идентификатор"/>
 *         <element name="ИдКлассификатора" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
 *         <element name="ДействительноС" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ДействительноДо" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="Описание" type="{urn:1C.ru:commerceml_205}Комментарий" minOccurs="0"/>
 *         <element name="Владелец" type="{urn:1C.ru:commerceml_205}Контрагент" minOccurs="0"/>
 *         <element name="ТипыЦен" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ИдКлассификатора" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
 *                   <element name="ТипЦены" type="{urn:1C.ru:commerceml_205}ТипЦены" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Склады" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Склад" type="{urn:1C.ru:commerceml_205}Склад" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
 *         <element name="Предложения">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Предложение" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{urn:1C.ru:commerceml_205}Товар">
 *                           <sequence>
 *                             <element name="Цены">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="Цена" type="{urn:1C.ru:commerceml_205}Цена" maxOccurs="unbounded"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="Количество" type="{urn:1C.ru:commerceml_205}Количество" minOccurs="0"/>
 *                             <element name="Склад" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="ИдСклада" use="required" type="{urn:1C.ru:commerceml_205}Идентификатор" />
 *                                     <attribute name="КоличествоНаСкладе" type="{urn:1C.ru:commerceml_205}Количество" />
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="СодержитТолькоИзменения" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041f\u0430\u043a\u0435\u0442\u041f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u0439", propOrder = {
    "\u0438\u0434",
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u0438\u0434\u041a\u0430\u0442\u0430\u043b\u043e\u0433\u0430",
    "\u0438\u0434\u041a\u043b\u0430\u0441\u0441\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0430",
    "\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0421",
    "\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0414\u043e",
    "\u043e\u043f\u0438\u0441\u0430\u043d\u0438\u0435",
    "\u0432\u043b\u0430\u0434\u0435\u043b\u0435\u0446",
    "\u0442\u0438\u043f\u044b\u0426\u0435\u043d",
    "\u0441\u043a\u043b\u0430\u0434\u044b",
    "\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f\u0421\u0432\u043e\u0439\u0441\u0442\u0432",
    "\u043f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u044f"
})
public class ПакетПредложений {

    @XmlElement(name = "\u0418\u0434")
    protected String ид;
    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435", required = true)
    protected String наименование;
    @XmlElement(name = "\u0418\u0434\u041a\u0430\u0442\u0430\u043b\u043e\u0433\u0430", required = true)
    protected String идКаталога;
    @XmlElement(name = "\u0418\u0434\u041a\u043b\u0430\u0441\u0441\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0430")
    protected String идКлассификатора;
    @XmlElement(name = "\u0414\u0435\u0439\u0441\u0442\u0432\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0421")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar действительноС;
    @XmlElement(name = "\u0414\u0435\u0439\u0441\u0442\u0432\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0414\u043e")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar действительноДо;
    @XmlElement(name = "\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435")
    protected String описание;
    @XmlElement(name = "\u0412\u043b\u0430\u0434\u0435\u043b\u0435\u0446")
    protected Контрагент владелец;
    @XmlElement(name = "\u0422\u0438\u043f\u044b\u0426\u0435\u043d")
    protected ТипыЦен типыЦен;
    @XmlElement(name = "\u0421\u043a\u043b\u0430\u0434\u044b")
    protected Склады склады;
    @XmlElement(name = "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u044f\u0421\u0432\u043e\u0439\u0441\u0442\u0432")
    protected ЗначенияСвойств значенияСвойств;
    @XmlElement(name = "\u041f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u044f", required = true)
    protected Предложения предложения;
    @XmlAttribute(name = "\u0421\u043e\u0434\u0435\u0440\u0436\u0438\u0442\u0422\u043e\u043b\u044c\u043a\u043e\u0418\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u044f")
    protected Boolean содержитТолькоИзменения;

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
     * Gets the value of the идКаталога property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИдКаталога() {
        return идКаталога;
    }

    /**
     * Sets the value of the идКаталога property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИдКаталога(String value) {
        this.идКаталога = value;
    }

    /**
     * Gets the value of the идКлассификатора property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИдКлассификатора() {
        return идКлассификатора;
    }

    /**
     * Sets the value of the идКлассификатора property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИдКлассификатора(String value) {
        this.идКлассификатора = value;
    }

    /**
     * Gets the value of the действительноС property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДействительноС() {
        return действительноС;
    }

    /**
     * Sets the value of the действительноС property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДействительноС(XMLGregorianCalendar value) {
        this.действительноС = value;
    }

    /**
     * Gets the value of the действительноДо property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДействительноДо() {
        return действительноДо;
    }

    /**
     * Sets the value of the действительноДо property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДействительноДо(XMLGregorianCalendar value) {
        this.действительноДо = value;
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
     * Gets the value of the склады property.
     * 
     * @return
     *     possible object is
     *     {@link Склады }
     *     
     */
    public Склады getСклады() {
        return склады;
    }

    /**
     * Sets the value of the склады property.
     * 
     * @param value
     *     allowed object is
     *     {@link Склады }
     *     
     */
    public void setСклады(Склады value) {
        this.склады = value;
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
     * Gets the value of the предложения property.
     * 
     * @return
     *     possible object is
     *     {@link Предложения }
     *     
     */
    public Предложения getПредложения() {
        return предложения;
    }

    /**
     * Sets the value of the предложения property.
     * 
     * @param value
     *     allowed object is
     *     {@link Предложения }
     *     
     */
    public void setПредложения(Предложения value) {
        this.предложения = value;
    }

    /**
     * Gets the value of the содержитТолькоИзменения property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isСодержитТолькоИзменения() {
        return содержитТолькоИзменения;
    }

    /**
     * Sets the value of the содержитТолькоИзменения property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setСодержитТолькоИзменения(Boolean value) {
        this.содержитТолькоИзменения = value;
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
     *         <element name="Предложение" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{urn:1C.ru:commerceml_205}Товар">
     *                 <sequence>
     *                   <element name="Цены">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Цена" type="{urn:1C.ru:commerceml_205}Цена" maxOccurs="unbounded"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Количество" type="{urn:1C.ru:commerceml_205}Количество" minOccurs="0"/>
     *                   <element name="Склад" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <attribute name="ИдСклада" use="required" type="{urn:1C.ru:commerceml_205}Идентификатор" />
     *                           <attribute name="КоличествоНаСкладе" type="{urn:1C.ru:commerceml_205}Количество" />
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </extension>
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
    @XmlType(name = "", propOrder = {
        "\u043f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u0435"
    })
    public static class Предложения {

        @XmlElement(name = "\u041f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u0435", required = true)
        protected List<Предложение> предложение;

        /**
         * Gets the value of the предложение property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the предложение property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getПредложение().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Предложение }
         * 
         * 
         * @return
         *     The value of the предложение property.
         */
        public List<Предложение> getПредложение() {
            if (предложение == null) {
                предложение = new ArrayList<>();
            }
            return this.предложение;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{urn:1C.ru:commerceml_205}Товар">
         *       <sequence>
         *         <element name="Цены">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Цена" type="{urn:1C.ru:commerceml_205}Цена" maxOccurs="unbounded"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Количество" type="{urn:1C.ru:commerceml_205}Количество" minOccurs="0"/>
         *         <element name="Склад" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <attribute name="ИдСклада" use="required" type="{urn:1C.ru:commerceml_205}Идентификатор" />
         *                 <attribute name="КоличествоНаСкладе" type="{urn:1C.ru:commerceml_205}Количество" />
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *       </sequence>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "\u0446\u0435\u043d\u044b",
            "\u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e",
            "\u0441\u043a\u043b\u0430\u0434"
        })
        public static class Предложение
            extends Товар
        {

            @XmlElement(name = "\u0426\u0435\u043d\u044b", required = true)
            protected Цены цены;
            @XmlElement(name = "\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e")
            protected BigDecimal количество;
            @XmlElement(name = "\u0421\u043a\u043b\u0430\u0434")
            protected List<Склад> склад;

            /**
             * Gets the value of the цены property.
             * 
             * @return
             *     possible object is
             *     {@link Цены }
             *     
             */
            public Цены getЦены() {
                return цены;
            }

            /**
             * Sets the value of the цены property.
             * 
             * @param value
             *     allowed object is
             *     {@link Цены }
             *     
             */
            public void setЦены(Цены value) {
                this.цены = value;
            }

            /**
             * Gets the value of the количество property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getКоличество() {
                return количество;
            }

            /**
             * Sets the value of the количество property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setКоличество(BigDecimal value) {
                this.количество = value;
            }

            /**
             * Gets the value of the склад property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the склад property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getСклад().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Склад }
             * 
             * 
             * @return
             *     The value of the склад property.
             */
            public List<Склад> getСклад() {
                if (склад == null) {
                    склад = new ArrayList<>();
                }
                return this.склад;
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
             *       <attribute name="ИдСклада" use="required" type="{urn:1C.ru:commerceml_205}Идентификатор" />
             *       <attribute name="КоличествоНаСкладе" type="{urn:1C.ru:commerceml_205}Количество" />
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Склад {

                @XmlAttribute(name = "\u0418\u0434\u0421\u043a\u043b\u0430\u0434\u0430", required = true)
                protected String идСклада;
                @XmlAttribute(name = "\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e\u041d\u0430\u0421\u043a\u043b\u0430\u0434\u0435")
                protected BigDecimal количествоНаСкладе;

                /**
                 * Gets the value of the идСклада property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getИдСклада() {
                    return идСклада;
                }

                /**
                 * Sets the value of the идСклада property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setИдСклада(String value) {
                    this.идСклада = value;
                }

                /**
                 * Gets the value of the количествоНаСкладе property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getКоличествоНаСкладе() {
                    return количествоНаСкладе;
                }

                /**
                 * Sets the value of the количествоНаСкладе property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setКоличествоНаСкладе(BigDecimal value) {
                    this.количествоНаСкладе = value;
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
             *         <element name="Цена" type="{urn:1C.ru:commerceml_205}Цена" maxOccurs="unbounded"/>
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
                "\u0446\u0435\u043d\u0430"
            })
            public static class Цены {

                @XmlElement(name = "\u0426\u0435\u043d\u0430", required = true)
                protected List<Цена> цена;

                /**
                 * Gets the value of the цена property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the цена property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getЦена().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Цена }
                 * 
                 * 
                 * @return
                 *     The value of the цена property.
                 */
                public List<Цена> getЦена() {
                    if (цена == null) {
                        цена = new ArrayList<>();
                    }
                    return this.цена;
                }

            }

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
     *         <element name="Склад" type="{urn:1C.ru:commerceml_205}Склад" maxOccurs="unbounded"/>
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
        "\u0441\u043a\u043b\u0430\u0434"
    })
    public static class Склады {

        @XmlElement(name = "\u0421\u043a\u043b\u0430\u0434", required = true)
        protected List<Склад> склад;

        /**
         * Gets the value of the склад property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the склад property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getСклад().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Склад }
         * 
         * 
         * @return
         *     The value of the склад property.
         */
        public List<Склад> getСклад() {
            if (склад == null) {
                склад = new ArrayList<>();
            }
            return this.склад;
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
     *         <element name="ИдКлассификатора" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
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
        "\u0438\u0434\u041a\u043b\u0430\u0441\u0441\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0430",
        "\u0442\u0438\u043f\u0426\u0435\u043d\u044b"
    })
    public static class ТипыЦен {

        @XmlElement(name = "\u0418\u0434\u041a\u043b\u0430\u0441\u0441\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0430")
        protected String идКлассификатора;
        @XmlElement(name = "\u0422\u0438\u043f\u0426\u0435\u043d\u044b", required = true)
        protected List<ТипЦены> типЦены;

        /**
         * Gets the value of the идКлассификатора property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getИдКлассификатора() {
            return идКлассификатора;
        }

        /**
         * Sets the value of the идКлассификатора property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setИдКлассификатора(String value) {
            this.идКлассификатора = value;
        }

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
