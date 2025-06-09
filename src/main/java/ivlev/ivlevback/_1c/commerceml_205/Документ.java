
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Документ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Документ">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ид" type="{urn:1C.ru:commerceml_205}Идентификатор"/>
 *         <element name="Номер" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Дата" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="ХозОперация" type="{urn:1C.ru:commerceml_205}ХозОперация"/>
 *         <element name="Роль" type="{urn:1C.ru:commerceml_205}Роль"/>
 *         <element name="Валюта" type="{urn:1C.ru:commerceml_205}КодВалюты"/>
 *         <element name="Курс" type="{urn:1C.ru:commerceml_205}Коэффициент"/>
 *         <element name="Сумма" type="{urn:1C.ru:commerceml_205}Сумма"/>
 *         <element name="Контрагенты">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Контрагент" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{urn:1C.ru:commerceml_205}Контрагент">
 *                           <sequence>
 *                             <element name="Роль" type="{urn:1C.ru:commerceml_205}Роль"/>
 *                             <element name="РасчетныйСчет" type="{urn:1C.ru:commerceml_205}РасчетныйСчет" minOccurs="0"/>
 *                             <element name="Склад" type="{urn:1C.ru:commerceml_205}Склад" minOccurs="0"/>
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
 *         <element name="Время" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         <element name="СрокПлатежа" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="Комментарий" type="{urn:1C.ru:commerceml_205}Комментарий" minOccurs="0"/>
 *         <element name="Налоги" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Налог" type="{urn:1C.ru:commerceml_205}НалогВДокументе" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Скидки" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Скидка" type="{urn:1C.ru:commerceml_205}Скидка" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ДопРасходы" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ДопРасход" type="{urn:1C.ru:commerceml_205}ДопРасход" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Товары" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Товар" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{urn:1C.ru:commerceml_205}Товар">
 *                           <sequence>
 *                             <element name="ЦенаЗаЕдиницу" type="{urn:1C.ru:commerceml_205}Сумма" minOccurs="0"/>
 *                             <element name="Количество" type="{urn:1C.ru:commerceml_205}Количество" minOccurs="0"/>
 *                             <element name="Резерв" type="{urn:1C.ru:commerceml_205}Количество" minOccurs="0"/>
 *                             <element name="Сумма" type="{urn:1C.ru:commerceml_205}Сумма" minOccurs="0"/>
 *                             <element name="Единица" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             <element name="Коэффициент" type="{urn:1C.ru:commerceml_205}Коэффициент" minOccurs="0"/>
 *                             <element name="ДополнительныеДанные" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="ЗначениеРеквизита" type="{urn:1C.ru:commerceml_205}ЗначениеРеквизита" maxOccurs="unbounded"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="СтранаПроисхождения" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             <element name="ГТД" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             <element name="Налоги" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="Налог" type="{urn:1C.ru:commerceml_205}НалогВДокументе" maxOccurs="unbounded"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="Скидки" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="Скидка" type="{urn:1C.ru:commerceml_205}Скидка" maxOccurs="unbounded"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="ДопРасходы" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="ДопРасход" type="{urn:1C.ru:commerceml_205}ДопРасход" maxOccurs="unbounded"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="ДополнительныеЗначенияРеквизитов" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="ЗначениеРеквизита" type="{urn:1C.ru:commerceml_205}ЗначениеРеквизита" maxOccurs="unbounded"/>
 *                                     </sequence>
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
 *         <element name="ЗначенияРеквизитов" minOccurs="0">
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
@XmlType(name = "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442", propOrder = {
    "\u0438\u0434",
    "\u043d\u043e\u043c\u0435\u0440",
    "\u0434\u0430\u0442\u0430",
    "\u0445\u043e\u0437\u041e\u043f\u0435\u0440\u0430\u0446\u0438\u044f",
    "\u0440\u043e\u043b\u044c",
    "\u0432\u0430\u043b\u044e\u0442\u0430",
    "\u043a\u0443\u0440\u0441",
    "\u0441\u0443\u043c\u043c\u0430",
    "\u043a\u043e\u043d\u0442\u0440\u0430\u0433\u0435\u043d\u0442\u044b",
    "\u0432\u0440\u0435\u043c\u044f",
    "\u0441\u0440\u043e\u043a\u041f\u043b\u0430\u0442\u0435\u0436\u0430",
    "\u043a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439",
    "\u043d\u0430\u043b\u043e\u0433\u0438",
    "\u0441\u043a\u0438\u0434\u043a\u0438",
    "\u0434\u043e\u043f\u0420\u0430\u0441\u0445\u043e\u0434\u044b",
    "\u0442\u043e\u0432\u0430\u0440\u044b",
    "\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u043e\u0432"
})
public class Документ {

    @XmlElement(name = "\u0418\u0434", required = true)
    protected String ид;
    @XmlElement(name = "\u041d\u043e\u043c\u0435\u0440", required = true)
    protected String номер;
    @XmlElement(name = "\u0414\u0430\u0442\u0430", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar дата;
    @XmlElement(name = "\u0425\u043e\u0437\u041e\u043f\u0435\u0440\u0430\u0446\u0438\u044f", required = true)
    @XmlSchemaType(name = "string")
    protected ХозОперация хозОперация;
    @XmlElement(name = "\u0420\u043e\u043b\u044c", required = true)
    @XmlSchemaType(name = "string")
    protected Роль роль;
    @XmlElement(name = "\u0412\u0430\u043b\u044e\u0442\u0430", required = true)
    protected String валюта;
    @XmlElement(name = "\u041a\u0443\u0440\u0441", required = true)
    protected String курс;
    @XmlElement(name = "\u0421\u0443\u043c\u043c\u0430", required = true)
    protected BigDecimal сумма;
    @XmlElement(name = "\u041a\u043e\u043d\u0442\u0440\u0430\u0433\u0435\u043d\u0442\u044b", required = true)
    protected Контрагенты контрагенты;
    @XmlElement(name = "\u0412\u0440\u0435\u043c\u044f")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar время;
    @XmlElement(name = "\u0421\u0440\u043e\u043a\u041f\u043b\u0430\u0442\u0435\u0436\u0430")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar срокПлатежа;
    @XmlElement(name = "\u041a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439")
    protected String комментарий;
    @XmlElement(name = "\u041d\u0430\u043b\u043e\u0433\u0438")
    protected Налоги налоги;
    @XmlElement(name = "\u0421\u043a\u0438\u0434\u043a\u0438")
    protected Скидки скидки;
    @XmlElement(name = "\u0414\u043e\u043f\u0420\u0430\u0441\u0445\u043e\u0434\u044b")
    protected ДопРасходы допРасходы;
    @XmlElement(name = "\u0422\u043e\u0432\u0430\u0440\u044b")
    protected Товары товары;
    @XmlElement(name = "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u044f\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u043e\u0432")
    protected ЗначенияРеквизитов значенияРеквизитов;

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
     * Gets the value of the номер property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНомер() {
        return номер;
    }

    /**
     * Sets the value of the номер property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНомер(String value) {
        this.номер = value;
    }

    /**
     * Gets the value of the дата property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДата() {
        return дата;
    }

    /**
     * Sets the value of the дата property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДата(XMLGregorianCalendar value) {
        this.дата = value;
    }

    /**
     * Gets the value of the хозОперация property.
     * 
     * @return
     *     possible object is
     *     {@link ХозОперация }
     *     
     */
    public ХозОперация getХозОперация() {
        return хозОперация;
    }

    /**
     * Sets the value of the хозОперация property.
     * 
     * @param value
     *     allowed object is
     *     {@link ХозОперация }
     *     
     */
    public void setХозОперация(ХозОперация value) {
        this.хозОперация = value;
    }

    /**
     * Gets the value of the роль property.
     * 
     * @return
     *     possible object is
     *     {@link Роль }
     *     
     */
    public Роль getРоль() {
        return роль;
    }

    /**
     * Sets the value of the роль property.
     * 
     * @param value
     *     allowed object is
     *     {@link Роль }
     *     
     */
    public void setРоль(Роль value) {
        this.роль = value;
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
     * Gets the value of the курс property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКурс() {
        return курс;
    }

    /**
     * Sets the value of the курс property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКурс(String value) {
        this.курс = value;
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
     * Gets the value of the контрагенты property.
     * 
     * @return
     *     possible object is
     *     {@link Контрагенты }
     *     
     */
    public Контрагенты getКонтрагенты() {
        return контрагенты;
    }

    /**
     * Sets the value of the контрагенты property.
     * 
     * @param value
     *     allowed object is
     *     {@link Контрагенты }
     *     
     */
    public void setКонтрагенты(Контрагенты value) {
        this.контрагенты = value;
    }

    /**
     * Gets the value of the время property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getВремя() {
        return время;
    }

    /**
     * Sets the value of the время property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setВремя(XMLGregorianCalendar value) {
        this.время = value;
    }

    /**
     * Gets the value of the срокПлатежа property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getСрокПлатежа() {
        return срокПлатежа;
    }

    /**
     * Sets the value of the срокПлатежа property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setСрокПлатежа(XMLGregorianCalendar value) {
        this.срокПлатежа = value;
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
     * Gets the value of the налоги property.
     * 
     * @return
     *     possible object is
     *     {@link Налоги }
     *     
     */
    public Налоги getНалоги() {
        return налоги;
    }

    /**
     * Sets the value of the налоги property.
     * 
     * @param value
     *     allowed object is
     *     {@link Налоги }
     *     
     */
    public void setНалоги(Налоги value) {
        this.налоги = value;
    }

    /**
     * Gets the value of the скидки property.
     * 
     * @return
     *     possible object is
     *     {@link Скидки }
     *     
     */
    public Скидки getСкидки() {
        return скидки;
    }

    /**
     * Sets the value of the скидки property.
     * 
     * @param value
     *     allowed object is
     *     {@link Скидки }
     *     
     */
    public void setСкидки(Скидки value) {
        this.скидки = value;
    }

    /**
     * Gets the value of the допРасходы property.
     * 
     * @return
     *     possible object is
     *     {@link ДопРасходы }
     *     
     */
    public ДопРасходы getДопРасходы() {
        return допРасходы;
    }

    /**
     * Sets the value of the допРасходы property.
     * 
     * @param value
     *     allowed object is
     *     {@link ДопРасходы }
     *     
     */
    public void setДопРасходы(ДопРасходы value) {
        this.допРасходы = value;
    }

    /**
     * Gets the value of the товары property.
     * 
     * @return
     *     possible object is
     *     {@link Товары }
     *     
     */
    public Товары getТовары() {
        return товары;
    }

    /**
     * Sets the value of the товары property.
     * 
     * @param value
     *     allowed object is
     *     {@link Товары }
     *     
     */
    public void setТовары(Товары value) {
        this.товары = value;
    }

    /**
     * Gets the value of the значенияРеквизитов property.
     * 
     * @return
     *     possible object is
     *     {@link ЗначенияРеквизитов }
     *     
     */
    public ЗначенияРеквизитов getЗначенияРеквизитов() {
        return значенияРеквизитов;
    }

    /**
     * Sets the value of the значенияРеквизитов property.
     * 
     * @param value
     *     allowed object is
     *     {@link ЗначенияРеквизитов }
     *     
     */
    public void setЗначенияРеквизитов(ЗначенияРеквизитов value) {
        this.значенияРеквизитов = value;
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
     *         <element name="ДопРасход" type="{urn:1C.ru:commerceml_205}ДопРасход" maxOccurs="unbounded"/>
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
        "\u0434\u043e\u043f\u0420\u0430\u0441\u0445\u043e\u0434"
    })
    public static class ДопРасходы {

        @XmlElement(name = "\u0414\u043e\u043f\u0420\u0430\u0441\u0445\u043e\u0434", required = true)
        protected List<ДопРасход> допРасход;

        /**
         * Gets the value of the допРасход property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the допРасход property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getДопРасход().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ДопРасход }
         * 
         * 
         * @return
         *     The value of the допРасход property.
         */
        public List<ДопРасход> getДопРасход() {
            if (допРасход == null) {
                допРасход = new ArrayList<>();
            }
            return this.допРасход;
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
    public static class ЗначенияРеквизитов {

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
     *         <element name="Контрагент" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{urn:1C.ru:commerceml_205}Контрагент">
     *                 <sequence>
     *                   <element name="Роль" type="{urn:1C.ru:commerceml_205}Роль"/>
     *                   <element name="РасчетныйСчет" type="{urn:1C.ru:commerceml_205}РасчетныйСчет" minOccurs="0"/>
     *                   <element name="Склад" type="{urn:1C.ru:commerceml_205}Склад" minOccurs="0"/>
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
        "\u043a\u043e\u043d\u0442\u0440\u0430\u0433\u0435\u043d\u0442"
    })
    public static class Контрагенты {

        @XmlElement(name = "\u041a\u043e\u043d\u0442\u0440\u0430\u0433\u0435\u043d\u0442", required = true)
        protected List<Контрагент> контрагент;

        /**
         * Gets the value of the контрагент property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the контрагент property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getКонтрагент().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Контрагент }
         * 
         * 
         * @return
         *     The value of the контрагент property.
         */
        public List<Контрагент> getКонтрагент() {
            if (контрагент == null) {
                контрагент = new ArrayList<>();
            }
            return this.контрагент;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{urn:1C.ru:commerceml_205}Контрагент">
         *       <sequence>
         *         <element name="Роль" type="{urn:1C.ru:commerceml_205}Роль"/>
         *         <element name="РасчетныйСчет" type="{urn:1C.ru:commerceml_205}РасчетныйСчет" minOccurs="0"/>
         *         <element name="Склад" type="{urn:1C.ru:commerceml_205}Склад" minOccurs="0"/>
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
            "\u0440\u043e\u043b\u044c",
            "\u0440\u0430\u0441\u0447\u0435\u0442\u043d\u044b\u0439\u0421\u0447\u0435\u0442",
            "\u0441\u043a\u043b\u0430\u0434"
        })
        public static class Контрагент
            extends ivlev.ivlevback._1c.commerceml_205.Контрагент
        {

            @XmlElement(name = "\u0420\u043e\u043b\u044c", required = true)
            @XmlSchemaType(name = "string")
            protected Роль роль;
            @XmlElement(name = "\u0420\u0430\u0441\u0447\u0435\u0442\u043d\u044b\u0439\u0421\u0447\u0435\u0442")
            protected РасчетныйСчет расчетныйСчет;
            @XmlElement(name = "\u0421\u043a\u043b\u0430\u0434")
            protected Склад склад;

            /**
             * Gets the value of the роль property.
             * 
             * @return
             *     possible object is
             *     {@link Роль }
             *     
             */
            public Роль getРоль() {
                return роль;
            }

            /**
             * Sets the value of the роль property.
             * 
             * @param value
             *     allowed object is
             *     {@link Роль }
             *     
             */
            public void setРоль(Роль value) {
                this.роль = value;
            }

            /**
             * Gets the value of the расчетныйСчет property.
             * 
             * @return
             *     possible object is
             *     {@link РасчетныйСчет }
             *     
             */
            public РасчетныйСчет getРасчетныйСчет() {
                return расчетныйСчет;
            }

            /**
             * Sets the value of the расчетныйСчет property.
             * 
             * @param value
             *     allowed object is
             *     {@link РасчетныйСчет }
             *     
             */
            public void setРасчетныйСчет(РасчетныйСчет value) {
                this.расчетныйСчет = value;
            }

            /**
             * Gets the value of the склад property.
             * 
             * @return
             *     possible object is
             *     {@link Склад }
             *     
             */
            public Склад getСклад() {
                return склад;
            }

            /**
             * Sets the value of the склад property.
             * 
             * @param value
             *     allowed object is
             *     {@link Склад }
             *     
             */
            public void setСклад(Склад value) {
                this.склад = value;
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
     *         <element name="Налог" type="{urn:1C.ru:commerceml_205}НалогВДокументе" maxOccurs="unbounded"/>
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
        "\u043d\u0430\u043b\u043e\u0433"
    })
    public static class Налоги {

        @XmlElement(name = "\u041d\u0430\u043b\u043e\u0433", required = true)
        protected List<НалогВДокументе> налог;

        /**
         * Gets the value of the налог property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the налог property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getНалог().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link НалогВДокументе }
         * 
         * 
         * @return
         *     The value of the налог property.
         */
        public List<НалогВДокументе> getНалог() {
            if (налог == null) {
                налог = new ArrayList<>();
            }
            return this.налог;
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
     *         <element name="Скидка" type="{urn:1C.ru:commerceml_205}Скидка" maxOccurs="unbounded"/>
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
        "\u0441\u043a\u0438\u0434\u043a\u0430"
    })
    public static class Скидки {

        @XmlElement(name = "\u0421\u043a\u0438\u0434\u043a\u0430", required = true)
        protected List<Скидка> скидка;

        /**
         * Gets the value of the скидка property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the скидка property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getСкидка().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Скидка }
         * 
         * 
         * @return
         *     The value of the скидка property.
         */
        public List<Скидка> getСкидка() {
            if (скидка == null) {
                скидка = new ArrayList<>();
            }
            return this.скидка;
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
     *         <element name="Товар" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{urn:1C.ru:commerceml_205}Товар">
     *                 <sequence>
     *                   <element name="ЦенаЗаЕдиницу" type="{urn:1C.ru:commerceml_205}Сумма" minOccurs="0"/>
     *                   <element name="Количество" type="{urn:1C.ru:commerceml_205}Количество" minOccurs="0"/>
     *                   <element name="Резерв" type="{urn:1C.ru:commerceml_205}Количество" minOccurs="0"/>
     *                   <element name="Сумма" type="{urn:1C.ru:commerceml_205}Сумма" minOccurs="0"/>
     *                   <element name="Единица" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   <element name="Коэффициент" type="{urn:1C.ru:commerceml_205}Коэффициент" minOccurs="0"/>
     *                   <element name="ДополнительныеДанные" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="ЗначениеРеквизита" type="{urn:1C.ru:commerceml_205}ЗначениеРеквизита" maxOccurs="unbounded"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="СтранаПроисхождения" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   <element name="ГТД" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   <element name="Налоги" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Налог" type="{urn:1C.ru:commerceml_205}НалогВДокументе" maxOccurs="unbounded"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Скидки" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Скидка" type="{urn:1C.ru:commerceml_205}Скидка" maxOccurs="unbounded"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="ДопРасходы" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="ДопРасход" type="{urn:1C.ru:commerceml_205}ДопРасход" maxOccurs="unbounded"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="ДополнительныеЗначенияРеквизитов" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="ЗначениеРеквизита" type="{urn:1C.ru:commerceml_205}ЗначениеРеквизита" maxOccurs="unbounded"/>
     *                           </sequence>
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
        "\u0442\u043e\u0432\u0430\u0440"
    })
    public static class Товары {

        @XmlElement(name = "\u0422\u043e\u0432\u0430\u0440", required = true)
        protected List<Товар> товар;

        /**
         * Gets the value of the товар property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the товар property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getТовар().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Товар }
         * 
         * 
         * @return
         *     The value of the товар property.
         */
        public List<Товар> getТовар() {
            if (товар == null) {
                товар = new ArrayList<>();
            }
            return this.товар;
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
         *         <element name="ЦенаЗаЕдиницу" type="{urn:1C.ru:commerceml_205}Сумма" minOccurs="0"/>
         *         <element name="Количество" type="{urn:1C.ru:commerceml_205}Количество" minOccurs="0"/>
         *         <element name="Резерв" type="{urn:1C.ru:commerceml_205}Количество" minOccurs="0"/>
         *         <element name="Сумма" type="{urn:1C.ru:commerceml_205}Сумма" minOccurs="0"/>
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
         *         <element name="СтранаПроисхождения" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         <element name="ГТД" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         <element name="Налоги" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Налог" type="{urn:1C.ru:commerceml_205}НалогВДокументе" maxOccurs="unbounded"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Скидки" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Скидка" type="{urn:1C.ru:commerceml_205}Скидка" maxOccurs="unbounded"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="ДопРасходы" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="ДопРасход" type="{urn:1C.ru:commerceml_205}ДопРасход" maxOccurs="unbounded"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="ДополнительныеЗначенияРеквизитов" minOccurs="0">
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
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "\u0446\u0435\u043d\u0430\u0417\u0430\u0415\u0434\u0438\u043d\u0438\u0446\u0443",
            "\u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e",
            "\u0440\u0435\u0437\u0435\u0440\u0432",
            "\u0441\u0443\u043c\u043c\u0430",
            "\u0435\u0434\u0438\u043d\u0438\u0446\u0430",
            "\u043a\u043e\u044d\u0444\u0444\u0438\u0446\u0438\u0435\u043d\u0442",
            "\u0434\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0435\u0414\u0430\u043d\u043d\u044b\u0435",
            "\u0441\u0442\u0440\u0430\u043d\u0430\u041f\u0440\u043e\u0438\u0441\u0445\u043e\u0436\u0434\u0435\u043d\u0438\u044f",
            "\u0433\u0442\u0434",
            "\u043d\u0430\u043b\u043e\u0433\u0438",
            "\u0441\u043a\u0438\u0434\u043a\u0438",
            "\u0434\u043e\u043f\u0420\u0430\u0441\u0445\u043e\u0434\u044b",
            "\u0434\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0435\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u044f\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u043e\u0432"
        })
        public static class Товар
            extends ivlev.ivlevback._1c.commerceml_205.Товар
        {

            @XmlElement(name = "\u0426\u0435\u043d\u0430\u0417\u0430\u0415\u0434\u0438\u043d\u0438\u0446\u0443")
            protected BigDecimal ценаЗаЕдиницу;
            @XmlElement(name = "\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e")
            protected BigDecimal количество;
            @XmlElement(name = "\u0420\u0435\u0437\u0435\u0440\u0432")
            protected BigDecimal резерв;
            @XmlElement(name = "\u0421\u0443\u043c\u043c\u0430")
            protected BigDecimal сумма;
            @XmlElement(name = "\u0415\u0434\u0438\u043d\u0438\u0446\u0430")
            protected String единица;
            @XmlElement(name = "\u041a\u043e\u044d\u0444\u0444\u0438\u0446\u0438\u0435\u043d\u0442")
            protected String коэффициент;
            @XmlElement(name = "\u0414\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0435\u0414\u0430\u043d\u043d\u044b\u0435")
            protected ДополнительныеДанные дополнительныеДанные;
            @XmlElement(name = "\u0421\u0442\u0440\u0430\u043d\u0430\u041f\u0440\u043e\u0438\u0441\u0445\u043e\u0436\u0434\u0435\u043d\u0438\u044f")
            protected String странаПроисхождения;
            @XmlElement(name = "\u0413\u0422\u0414")
            protected String гтд;
            @XmlElement(name = "\u041d\u0430\u043b\u043e\u0433\u0438")
            protected Налоги налоги;
            @XmlElement(name = "\u0421\u043a\u0438\u0434\u043a\u0438")
            protected Скидки скидки;
            @XmlElement(name = "\u0414\u043e\u043f\u0420\u0430\u0441\u0445\u043e\u0434\u044b")
            protected ДопРасходы допРасходы;
            @XmlElement(name = "\u0414\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0435\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u044f\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u043e\u0432")
            protected ДополнительныеЗначенияРеквизитов дополнительныеЗначенияРеквизитов;

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
             * Gets the value of the резерв property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getРезерв() {
                return резерв;
            }

            /**
             * Sets the value of the резерв property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setРезерв(BigDecimal value) {
                this.резерв = value;
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
             * Gets the value of the странаПроисхождения property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getСтранаПроисхождения() {
                return странаПроисхождения;
            }

            /**
             * Sets the value of the странаПроисхождения property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setСтранаПроисхождения(String value) {
                this.странаПроисхождения = value;
            }

            /**
             * Gets the value of the гтд property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getГТД() {
                return гтд;
            }

            /**
             * Sets the value of the гтд property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setГТД(String value) {
                this.гтд = value;
            }

            /**
             * Gets the value of the налоги property.
             * 
             * @return
             *     possible object is
             *     {@link Налоги }
             *     
             */
            public Налоги getНалоги() {
                return налоги;
            }

            /**
             * Sets the value of the налоги property.
             * 
             * @param value
             *     allowed object is
             *     {@link Налоги }
             *     
             */
            public void setНалоги(Налоги value) {
                this.налоги = value;
            }

            /**
             * Gets the value of the скидки property.
             * 
             * @return
             *     possible object is
             *     {@link Скидки }
             *     
             */
            public Скидки getСкидки() {
                return скидки;
            }

            /**
             * Sets the value of the скидки property.
             * 
             * @param value
             *     allowed object is
             *     {@link Скидки }
             *     
             */
            public void setСкидки(Скидки value) {
                this.скидки = value;
            }

            /**
             * Gets the value of the допРасходы property.
             * 
             * @return
             *     possible object is
             *     {@link ДопРасходы }
             *     
             */
            public ДопРасходы getДопРасходы() {
                return допРасходы;
            }

            /**
             * Sets the value of the допРасходы property.
             * 
             * @param value
             *     allowed object is
             *     {@link ДопРасходы }
             *     
             */
            public void setДопРасходы(ДопРасходы value) {
                this.допРасходы = value;
            }

            /**
             * Gets the value of the дополнительныеЗначенияРеквизитов property.
             * 
             * @return
             *     possible object is
             *     {@link ДополнительныеЗначенияРеквизитов }
             *     
             */
            public ДополнительныеЗначенияРеквизитов getДополнительныеЗначенияРеквизитов() {
                return дополнительныеЗначенияРеквизитов;
            }

            /**
             * Sets the value of the дополнительныеЗначенияРеквизитов property.
             * 
             * @param value
             *     allowed object is
             *     {@link ДополнительныеЗначенияРеквизитов }
             *     
             */
            public void setДополнительныеЗначенияРеквизитов(ДополнительныеЗначенияРеквизитов value) {
                this.дополнительныеЗначенияРеквизитов = value;
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
            public static class ДополнительныеЗначенияРеквизитов {

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
             *         <element name="ДопРасход" type="{urn:1C.ru:commerceml_205}ДопРасход" maxOccurs="unbounded"/>
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
                "\u0434\u043e\u043f\u0420\u0430\u0441\u0445\u043e\u0434"
            })
            public static class ДопРасходы {

                @XmlElement(name = "\u0414\u043e\u043f\u0420\u0430\u0441\u0445\u043e\u0434", required = true)
                protected List<ДопРасход> допРасход;

                /**
                 * Gets the value of the допРасход property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the допРасход property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getДопРасход().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ДопРасход }
                 * 
                 * 
                 * @return
                 *     The value of the допРасход property.
                 */
                public List<ДопРасход> getДопРасход() {
                    if (допРасход == null) {
                        допРасход = new ArrayList<>();
                    }
                    return this.допРасход;
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
             *         <element name="Налог" type="{urn:1C.ru:commerceml_205}НалогВДокументе" maxOccurs="unbounded"/>
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
                "\u043d\u0430\u043b\u043e\u0433"
            })
            public static class Налоги {

                @XmlElement(name = "\u041d\u0430\u043b\u043e\u0433", required = true)
                protected List<НалогВДокументе> налог;

                /**
                 * Gets the value of the налог property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the налог property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getНалог().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link НалогВДокументе }
                 * 
                 * 
                 * @return
                 *     The value of the налог property.
                 */
                public List<НалогВДокументе> getНалог() {
                    if (налог == null) {
                        налог = new ArrayList<>();
                    }
                    return this.налог;
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
             *         <element name="Скидка" type="{urn:1C.ru:commerceml_205}Скидка" maxOccurs="unbounded"/>
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
                "\u0441\u043a\u0438\u0434\u043a\u0430"
            })
            public static class Скидки {

                @XmlElement(name = "\u0421\u043a\u0438\u0434\u043a\u0430", required = true)
                protected List<Скидка> скидка;

                /**
                 * Gets the value of the скидка property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the скидка property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getСкидка().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Скидка }
                 * 
                 * 
                 * @return
                 *     The value of the скидка property.
                 */
                public List<Скидка> getСкидка() {
                    if (скидка == null) {
                        скидка = new ArrayList<>();
                    }
                    return this.скидка;
                }

            }

        }

    }

}
