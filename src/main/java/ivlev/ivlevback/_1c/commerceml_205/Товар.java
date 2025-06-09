
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Товар complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Товар">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ид" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="80"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ИдСайта" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
 *         <element name="Штрихкод" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="8"/>
 *               <maxLength value="14"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Артикул" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Код" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Наименование" type="{urn:1C.ru:commerceml_205}Наименование" minOccurs="0"/>
 *         <element name="БазоваяЕдиница" type="{urn:1C.ru:commerceml_205}БазоваяЕдиница" minOccurs="0"/>
 *         <element name="ИдТовараУКонтрагента" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
 *         <element name="Группы" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Ид" type="{urn:1C.ru:commerceml_205}Идентификатор" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Категория" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
 *         <element name="Описание" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Картинка" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Страна" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Вес" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ТорговаяМарка" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ВладелецТорговойМарки" type="{urn:1C.ru:commerceml_205}Контрагент" minOccurs="0"/>
 *         <element name="Изготовитель" type="{urn:1C.ru:commerceml_205}Контрагент" minOccurs="0"/>
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
 *         <element name="СтавкиНалогов" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="СтавкаНалога" type="{urn:1C.ru:commerceml_205}СтавкаНалога" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Акцизы" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Акциз" type="{urn:1C.ru:commerceml_205}Акциз" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Комплектующие" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Комплектующее" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{urn:1C.ru:commerceml_205}Товар">
 *                           <sequence>
 *                             <element name="Количество" type="{urn:1C.ru:commerceml_205}Количество"/>
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
 *         <element name="Аналоги" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Аналог" type="{urn:1C.ru:commerceml_205}Товар" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ХарактеристикиТовара" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ХарактеристикаТовара" type="{urn:1C.ru:commerceml_205}ХарактеристикаТовара" maxOccurs="unbounded" minOccurs="0"/>
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
 *         <element name="ИдКаталога" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
 *         <element name="ИдКлассификатора" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Статус" type="{urn:1C.ru:commerceml_205}СтатусТовара" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0422\u043e\u0432\u0430\u0440", propOrder = {
    "\u0438\u0434",
    "\u0438\u0434\u0421\u0430\u0439\u0442\u0430",
    "\u0448\u0442\u0440\u0438\u0445\u043a\u043e\u0434",
    "\u0430\u0440\u0442\u0438\u043a\u0443\u043b",
    "\u043a\u043e\u0434",
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u0431\u0430\u0437\u043e\u0432\u0430\u044f\u0415\u0434\u0438\u043d\u0438\u0446\u0430",
    "\u0438\u0434\u0422\u043e\u0432\u0430\u0440\u0430\u0423\u041a\u043e\u043d\u0442\u0440\u0430\u0433\u0435\u043d\u0442\u0430",
    "\u0433\u0440\u0443\u043f\u043f\u044b",
    "\u043a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u044f",
    "\u043e\u043f\u0438\u0441\u0430\u043d\u0438\u0435",
    "\u043a\u0430\u0440\u0442\u0438\u043d\u043a\u0430",
    "\u0441\u0442\u0440\u0430\u043d\u0430",
    "\u0432\u0435\u0441",
    "\u0442\u043e\u0440\u0433\u043e\u0432\u0430\u044f\u041c\u0430\u0440\u043a\u0430",
    "\u0432\u043b\u0430\u0434\u0435\u043b\u0435\u0446\u0422\u043e\u0440\u0433\u043e\u0432\u043e\u0439\u041c\u0430\u0440\u043a\u0438",
    "\u0438\u0437\u0433\u043e\u0442\u043e\u0432\u0438\u0442\u0435\u043b\u044c",
    "\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f\u0421\u0432\u043e\u0439\u0441\u0442\u0432",
    "\u0441\u0442\u0430\u0432\u043a\u0438\u041d\u0430\u043b\u043e\u0433\u043e\u0432",
    "\u0430\u043a\u0446\u0438\u0437\u044b",
    "\u043a\u043e\u043c\u043f\u043b\u0435\u043a\u0442\u0443\u044e\u0449\u0438\u0435",
    "\u0430\u043d\u0430\u043b\u043e\u0433\u0438",
    "\u0445\u0430\u0440\u0430\u043a\u0442\u0435\u0440\u0438\u0441\u0442\u0438\u043a\u0438\u0422\u043e\u0432\u0430\u0440\u0430",
    "\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u043e\u0432",
    "\u0438\u0434\u041a\u0430\u0442\u0430\u043b\u043e\u0433\u0430",
    "\u0438\u0434\u041a\u043b\u0430\u0441\u0441\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0430"
})
@XmlSeeAlso({
    Документ.Товары.Товар.class,
    ПакетПредложений.Предложения.Предложение.class,
    Товар.Комплектующие.Комплектующее.class
})
public class Товар {

    @XmlElement(name = "\u0418\u0434")
    protected String ид;
    @XmlElement(name = "\u0418\u0434\u0421\u0430\u0439\u0442\u0430")
    protected String идСайта;
    @XmlElement(name = "\u0428\u0442\u0440\u0438\u0445\u043a\u043e\u0434")
    protected String штрихкод;
    @XmlElement(name = "\u0410\u0440\u0442\u0438\u043a\u0443\u043b")
    protected String артикул;
    @XmlElement(name = "\u041a\u043e\u0434")
    protected String код;
    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435")
    protected String наименование;
    @XmlElement(name = "\u0411\u0430\u0437\u043e\u0432\u0430\u044f\u0415\u0434\u0438\u043d\u0438\u0446\u0430")
    protected БазоваяЕдиница базоваяЕдиница;
    @XmlElement(name = "\u0418\u0434\u0422\u043e\u0432\u0430\u0440\u0430\u0423\u041a\u043e\u043d\u0442\u0440\u0430\u0433\u0435\u043d\u0442\u0430")
    protected String идТовараУКонтрагента;
    @XmlElement(name = "\u0413\u0440\u0443\u043f\u043f\u044b")
    protected Группы группы;
    @XmlElement(name = "\u041a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u044f")
    protected String категория;
    @XmlElement(name = "\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435")
    protected String описание;
    @XmlElement(name = "\u041a\u0430\u0440\u0442\u0438\u043d\u043a\u0430")
    protected List<String> картинка;
    @XmlElement(name = "\u0421\u0442\u0440\u0430\u043d\u0430")
    protected String страна;
    @XmlElement(name = "\u0412\u0435\u0441")
    protected String вес;
    @XmlElement(name = "\u0422\u043e\u0440\u0433\u043e\u0432\u0430\u044f\u041c\u0430\u0440\u043a\u0430")
    protected String торговаяМарка;
    @XmlElement(name = "\u0412\u043b\u0430\u0434\u0435\u043b\u0435\u0446\u0422\u043e\u0440\u0433\u043e\u0432\u043e\u0439\u041c\u0430\u0440\u043a\u0438")
    protected Контрагент владелецТорговойМарки;
    @XmlElement(name = "\u0418\u0437\u0433\u043e\u0442\u043e\u0432\u0438\u0442\u0435\u043b\u044c")
    protected Контрагент изготовитель;
    @XmlElement(name = "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u044f\u0421\u0432\u043e\u0439\u0441\u0442\u0432")
    protected ЗначенияСвойств значенияСвойств;
    @XmlElement(name = "\u0421\u0442\u0430\u0432\u043a\u0438\u041d\u0430\u043b\u043e\u0433\u043e\u0432")
    protected СтавкиНалогов ставкиНалогов;
    @XmlElement(name = "\u0410\u043a\u0446\u0438\u0437\u044b")
    protected Акцизы акцизы;
    @XmlElement(name = "\u041a\u043e\u043c\u043f\u043b\u0435\u043a\u0442\u0443\u044e\u0449\u0438\u0435")
    protected Комплектующие комплектующие;
    @XmlElement(name = "\u0410\u043d\u0430\u043b\u043e\u0433\u0438")
    protected Аналоги аналоги;
    @XmlElement(name = "\u0425\u0430\u0440\u0430\u043a\u0442\u0435\u0440\u0438\u0441\u0442\u0438\u043a\u0438\u0422\u043e\u0432\u0430\u0440\u0430")
    protected ХарактеристикиТовара характеристикиТовара;
    @XmlElement(name = "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u044f\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u043e\u0432")
    protected ЗначенияРеквизитов значенияРеквизитов;
    @XmlElement(name = "\u0418\u0434\u041a\u0430\u0442\u0430\u043b\u043e\u0433\u0430")
    protected String идКаталога;
    @XmlElement(name = "\u0418\u0434\u041a\u043b\u0430\u0441\u0441\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0430")
    protected String идКлассификатора;
    @XmlAttribute(name = "\u0421\u0442\u0430\u0442\u0443\u0441")
    protected СтатусТовара статус;

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
     * Gets the value of the штрихкод property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getШтрихкод() {
        return штрихкод;
    }

    /**
     * Sets the value of the штрихкод property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setШтрихкод(String value) {
        this.штрихкод = value;
    }

    /**
     * Gets the value of the артикул property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getАртикул() {
        return артикул;
    }

    /**
     * Sets the value of the артикул property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setАртикул(String value) {
        this.артикул = value;
    }

    /**
     * Gets the value of the код property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКод() {
        return код;
    }

    /**
     * Sets the value of the код property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКод(String value) {
        this.код = value;
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
     * Gets the value of the базоваяЕдиница property.
     * 
     * @return
     *     possible object is
     *     {@link БазоваяЕдиница }
     *     
     */
    public БазоваяЕдиница getБазоваяЕдиница() {
        return базоваяЕдиница;
    }

    /**
     * Sets the value of the базоваяЕдиница property.
     * 
     * @param value
     *     allowed object is
     *     {@link БазоваяЕдиница }
     *     
     */
    public void setБазоваяЕдиница(БазоваяЕдиница value) {
        this.базоваяЕдиница = value;
    }

    /**
     * Gets the value of the идТовараУКонтрагента property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИдТовараУКонтрагента() {
        return идТовараУКонтрагента;
    }

    /**
     * Sets the value of the идТовараУКонтрагента property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИдТовараУКонтрагента(String value) {
        this.идТовараУКонтрагента = value;
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
     * Gets the value of the категория property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКатегория() {
        return категория;
    }

    /**
     * Sets the value of the категория property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКатегория(String value) {
        this.категория = value;
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
     * Gets the value of the картинка property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the картинка property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getКартинка().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the картинка property.
     */
    public List<String> getКартинка() {
        if (картинка == null) {
            картинка = new ArrayList<>();
        }
        return this.картинка;
    }

    /**
     * Gets the value of the страна property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getСтрана() {
        return страна;
    }

    /**
     * Sets the value of the страна property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setСтрана(String value) {
        this.страна = value;
    }

    /**
     * Gets the value of the вес property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВес() {
        return вес;
    }

    /**
     * Sets the value of the вес property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВес(String value) {
        this.вес = value;
    }

    /**
     * Gets the value of the торговаяМарка property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getТорговаяМарка() {
        return торговаяМарка;
    }

    /**
     * Sets the value of the торговаяМарка property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setТорговаяМарка(String value) {
        this.торговаяМарка = value;
    }

    /**
     * Gets the value of the владелецТорговойМарки property.
     * 
     * @return
     *     possible object is
     *     {@link Контрагент }
     *     
     */
    public Контрагент getВладелецТорговойМарки() {
        return владелецТорговойМарки;
    }

    /**
     * Sets the value of the владелецТорговойМарки property.
     * 
     * @param value
     *     allowed object is
     *     {@link Контрагент }
     *     
     */
    public void setВладелецТорговойМарки(Контрагент value) {
        this.владелецТорговойМарки = value;
    }

    /**
     * Gets the value of the изготовитель property.
     * 
     * @return
     *     possible object is
     *     {@link Контрагент }
     *     
     */
    public Контрагент getИзготовитель() {
        return изготовитель;
    }

    /**
     * Sets the value of the изготовитель property.
     * 
     * @param value
     *     allowed object is
     *     {@link Контрагент }
     *     
     */
    public void setИзготовитель(Контрагент value) {
        this.изготовитель = value;
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
     * Gets the value of the ставкиНалогов property.
     * 
     * @return
     *     possible object is
     *     {@link СтавкиНалогов }
     *     
     */
    public СтавкиНалогов getСтавкиНалогов() {
        return ставкиНалогов;
    }

    /**
     * Sets the value of the ставкиНалогов property.
     * 
     * @param value
     *     allowed object is
     *     {@link СтавкиНалогов }
     *     
     */
    public void setСтавкиНалогов(СтавкиНалогов value) {
        this.ставкиНалогов = value;
    }

    /**
     * Gets the value of the акцизы property.
     * 
     * @return
     *     possible object is
     *     {@link Акцизы }
     *     
     */
    public Акцизы getАкцизы() {
        return акцизы;
    }

    /**
     * Sets the value of the акцизы property.
     * 
     * @param value
     *     allowed object is
     *     {@link Акцизы }
     *     
     */
    public void setАкцизы(Акцизы value) {
        this.акцизы = value;
    }

    /**
     * Gets the value of the комплектующие property.
     * 
     * @return
     *     possible object is
     *     {@link Комплектующие }
     *     
     */
    public Комплектующие getКомплектующие() {
        return комплектующие;
    }

    /**
     * Sets the value of the комплектующие property.
     * 
     * @param value
     *     allowed object is
     *     {@link Комплектующие }
     *     
     */
    public void setКомплектующие(Комплектующие value) {
        this.комплектующие = value;
    }

    /**
     * Gets the value of the аналоги property.
     * 
     * @return
     *     possible object is
     *     {@link Аналоги }
     *     
     */
    public Аналоги getАналоги() {
        return аналоги;
    }

    /**
     * Sets the value of the аналоги property.
     * 
     * @param value
     *     allowed object is
     *     {@link Аналоги }
     *     
     */
    public void setАналоги(Аналоги value) {
        this.аналоги = value;
    }

    /**
     * Gets the value of the характеристикиТовара property.
     * 
     * @return
     *     possible object is
     *     {@link ХарактеристикиТовара }
     *     
     */
    public ХарактеристикиТовара getХарактеристикиТовара() {
        return характеристикиТовара;
    }

    /**
     * Sets the value of the характеристикиТовара property.
     * 
     * @param value
     *     allowed object is
     *     {@link ХарактеристикиТовара }
     *     
     */
    public void setХарактеристикиТовара(ХарактеристикиТовара value) {
        this.характеристикиТовара = value;
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
     * Gets the value of the статус property.
     * 
     * @return
     *     possible object is
     *     {@link СтатусТовара }
     *     
     */
    public СтатусТовара getСтатус() {
        return статус;
    }

    /**
     * Sets the value of the статус property.
     * 
     * @param value
     *     allowed object is
     *     {@link СтатусТовара }
     *     
     */
    public void setСтатус(СтатусТовара value) {
        this.статус = value;
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
     *         <element name="Акциз" type="{urn:1C.ru:commerceml_205}Акциз" maxOccurs="unbounded"/>
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
        "\u0430\u043a\u0446\u0438\u0437"
    })
    public static class Акцизы {

        @XmlElement(name = "\u0410\u043a\u0446\u0438\u0437", required = true)
        protected List<Акциз> акциз;

        /**
         * Gets the value of the акциз property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the акциз property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getАкциз().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Акциз }
         * 
         * 
         * @return
         *     The value of the акциз property.
         */
        public List<Акциз> getАкциз() {
            if (акциз == null) {
                акциз = new ArrayList<>();
            }
            return this.акциз;
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
     *         <element name="Аналог" type="{urn:1C.ru:commerceml_205}Товар" maxOccurs="unbounded"/>
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
        "\u0430\u043d\u0430\u043b\u043e\u0433"
    })
    public static class Аналоги {

        @XmlElement(name = "\u0410\u043d\u0430\u043b\u043e\u0433", required = true)
        protected List<Товар> аналог;

        /**
         * Gets the value of the аналог property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the аналог property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getАналог().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Товар }
         * 
         * 
         * @return
         *     The value of the аналог property.
         */
        public List<Товар> getАналог() {
            if (аналог == null) {
                аналог = new ArrayList<>();
            }
            return this.аналог;
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
     *         <element name="Ид" type="{urn:1C.ru:commerceml_205}Идентификатор" maxOccurs="unbounded"/>
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
        "\u0438\u0434"
    })
    public static class Группы {

        @XmlElement(name = "\u0418\u0434", required = true)
        protected List<String> ид;

        /**
         * Gets the value of the ид property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the ид property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getИд().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         * @return
         *     The value of the ид property.
         */
        public List<String> getИд() {
            if (ид == null) {
                ид = new ArrayList<>();
            }
            return this.ид;
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
     *         <element name="Комплектующее" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{urn:1C.ru:commerceml_205}Товар">
     *                 <sequence>
     *                   <element name="Количество" type="{urn:1C.ru:commerceml_205}Количество"/>
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
        "\u043a\u043e\u043c\u043f\u043b\u0435\u043a\u0442\u0443\u044e\u0449\u0435\u0435"
    })
    public static class Комплектующие {

        @XmlElement(name = "\u041a\u043e\u043c\u043f\u043b\u0435\u043a\u0442\u0443\u044e\u0449\u0435\u0435", required = true)
        protected List<Комплектующее> комплектующее;

        /**
         * Gets the value of the комплектующее property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the комплектующее property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getКомплектующее().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Комплектующее }
         * 
         * 
         * @return
         *     The value of the комплектующее property.
         */
        public List<Комплектующее> getКомплектующее() {
            if (комплектующее == null) {
                комплектующее = new ArrayList<>();
            }
            return this.комплектующее;
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
         *         <element name="Количество" type="{urn:1C.ru:commerceml_205}Количество"/>
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
            "\u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e"
        })
        public static class Комплектующее
            extends Товар
        {

            @XmlElement(name = "\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e", required = true)
            protected BigDecimal количество;

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
     *         <element name="СтавкаНалога" type="{urn:1C.ru:commerceml_205}СтавкаНалога" maxOccurs="unbounded"/>
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
        "\u0441\u0442\u0430\u0432\u043a\u0430\u041d\u0430\u043b\u043e\u0433\u0430"
    })
    public static class СтавкиНалогов {

        @XmlElement(name = "\u0421\u0442\u0430\u0432\u043a\u0430\u041d\u0430\u043b\u043e\u0433\u0430", required = true)
        protected List<СтавкаНалога> ставкаНалога;

        /**
         * Gets the value of the ставкаНалога property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the ставкаНалога property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getСтавкаНалога().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link СтавкаНалога }
         * 
         * 
         * @return
         *     The value of the ставкаНалога property.
         */
        public List<СтавкаНалога> getСтавкаНалога() {
            if (ставкаНалога == null) {
                ставкаНалога = new ArrayList<>();
            }
            return this.ставкаНалога;
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
     *         <element name="ХарактеристикаТовара" type="{urn:1C.ru:commerceml_205}ХарактеристикаТовара" maxOccurs="unbounded" minOccurs="0"/>
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
        "\u0445\u0430\u0440\u0430\u043a\u0442\u0435\u0440\u0438\u0441\u0442\u0438\u043a\u0430\u0422\u043e\u0432\u0430\u0440\u0430"
    })
    public static class ХарактеристикиТовара {

        @XmlElement(name = "\u0425\u0430\u0440\u0430\u043a\u0442\u0435\u0440\u0438\u0441\u0442\u0438\u043a\u0430\u0422\u043e\u0432\u0430\u0440\u0430")
        protected List<ХарактеристикаТовара> характеристикаТовара;

        /**
         * Gets the value of the характеристикаТовара property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the характеристикаТовара property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getХарактеристикаТовара().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ХарактеристикаТовара }
         * 
         * 
         * @return
         *     The value of the характеристикаТовара property.
         */
        public List<ХарактеристикаТовара> getХарактеристикаТовара() {
            if (характеристикаТовара == null) {
                характеристикаТовара = new ArrayList<>();
            }
            return this.характеристикаТовара;
        }

    }

}
