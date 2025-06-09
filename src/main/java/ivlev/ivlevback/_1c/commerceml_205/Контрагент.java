
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Контрагент complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Контрагент">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ид" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
 *         <element name="Наименование" type="{urn:1C.ru:commerceml_205}Наименование" minOccurs="0"/>
 *         <element name="ОфициальноеНаименование" type="{urn:1C.ru:commerceml_205}Наименование" minOccurs="0"/>
 *         <element name="ЮридическийАдрес" type="{urn:1C.ru:commerceml_205}Адрес" minOccurs="0"/>
 *         <element name="ИНН" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="10"/>
 *               <maxLength value="12"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="КПП" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <length value="9"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ОсновнойВидДеятельности" type="{urn:1C.ru:commerceml_205}Наименование" minOccurs="0"/>
 *         <element name="ЕГРПО" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ОКВЭД" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ОКДП" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ОКОПФ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ОКФС" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ОКПО" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ДатаРегистрации" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="Руководитель" type="{urn:1C.ru:commerceml_205}Контрагент" minOccurs="0"/>
 *         <element name="РасчетныеСчета" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="РасчетныйСчет" type="{urn:1C.ru:commerceml_205}РасчетныйСчет" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ПолноеНаименование" type="{urn:1C.ru:commerceml_205}Наименование" minOccurs="0"/>
 *         <element name="Обращение" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="20"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Фамилия" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Имя" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Отчество" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ДатаРождения" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="МестоРождения" type="{urn:1C.ru:commerceml_205}Адрес" minOccurs="0"/>
 *         <element name="Пол" type="{urn:1C.ru:commerceml_205}Пол" minOccurs="0"/>
 *         <element name="УдостоверениеЛичности" type="{urn:1C.ru:commerceml_205}УдостоверениеЛичности" minOccurs="0"/>
 *         <element name="АдресРегистрации" type="{urn:1C.ru:commerceml_205}Адрес" minOccurs="0"/>
 *         <element name="Организация" type="{urn:1C.ru:commerceml_205}Контрагент" minOccurs="0"/>
 *         <element name="Должность" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         <element name="Представители" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Представитель" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{urn:1C.ru:commerceml_205}Контрагент">
 *                           <sequence>
 *                             <element name="Отношение" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041a\u043e\u043d\u0442\u0440\u0430\u0433\u0435\u043d\u0442", propOrder = {
    "\u0438\u0434",
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u043e\u0444\u0438\u0446\u0438\u0430\u043b\u044c\u043d\u043e\u0435\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u044e\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043a\u0438\u0439\u0410\u0434\u0440\u0435\u0441",
    "\u0438\u043d\u043d",
    "\u043a\u043f\u043f",
    "\u043e\u0441\u043d\u043e\u0432\u043d\u043e\u0439\u0412\u0438\u0434\u0414\u0435\u044f\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u0438",
    "\u0435\u0433\u0440\u043f\u043e",
    "\u043e\u043a\u0432\u044d\u0434",
    "\u043e\u043a\u0434\u043f",
    "\u043e\u043a\u043e\u043f\u0444",
    "\u043e\u043a\u0444\u0441",
    "\u043e\u043a\u043f\u043e",
    "\u0434\u0430\u0442\u0430\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438",
    "\u0440\u0443\u043a\u043e\u0432\u043e\u0434\u0438\u0442\u0435\u043b\u044c",
    "\u0440\u0430\u0441\u0447\u0435\u0442\u043d\u044b\u0435\u0421\u0447\u0435\u0442\u0430",
    "\u043f\u043e\u043b\u043d\u043e\u0435\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u043e\u0431\u0440\u0430\u0449\u0435\u043d\u0438\u0435",
    "\u0444\u0430\u043c\u0438\u043b\u0438\u044f",
    "\u0438\u043c\u044f",
    "\u043e\u0442\u0447\u0435\u0441\u0442\u0432\u043e",
    "\u0434\u0430\u0442\u0430\u0420\u043e\u0436\u0434\u0435\u043d\u0438\u044f",
    "\u043c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434\u0435\u043d\u0438\u044f",
    "\u043f\u043e\u043b",
    "\u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435\u041b\u0438\u0447\u043d\u043e\u0441\u0442\u0438",
    "\u0430\u0434\u0440\u0435\u0441\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438",
    "\u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f",
    "\u0434\u043e\u043b\u0436\u043d\u043e\u0441\u0442\u044c",
    "\u043a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439",
    "\u0430\u0434\u0440\u0435\u0441",
    "\u043a\u043e\u043d\u0442\u0430\u043a\u0442\u044b",
    "\u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u0438\u0442\u0435\u043b\u0438"
})
@XmlSeeAlso({
    Документ.Контрагенты.Контрагент.class,
    Контрагент.Представители.Представитель.class
})
public class Контрагент {

    @XmlElement(name = "\u0418\u0434")
    protected String ид;
    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435")
    protected String наименование;
    @XmlElement(name = "\u041e\u0444\u0438\u0446\u0438\u0430\u043b\u044c\u043d\u043e\u0435\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435")
    protected String официальноеНаименование;
    @XmlElement(name = "\u042e\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043a\u0438\u0439\u0410\u0434\u0440\u0435\u0441")
    protected Адрес юридическийАдрес;
    @XmlElement(name = "\u0418\u041d\u041d")
    protected String инн;
    @XmlElement(name = "\u041a\u041f\u041f")
    protected String кпп;
    @XmlElement(name = "\u041e\u0441\u043d\u043e\u0432\u043d\u043e\u0439\u0412\u0438\u0434\u0414\u0435\u044f\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u0438")
    protected String основнойВидДеятельности;
    @XmlElement(name = "\u0415\u0413\u0420\u041f\u041e")
    protected String егрпо;
    @XmlElement(name = "\u041e\u041a\u0412\u042d\u0414")
    protected String оквэд;
    @XmlElement(name = "\u041e\u041a\u0414\u041f")
    protected String окдп;
    @XmlElement(name = "\u041e\u041a\u041e\u041f\u0424")
    protected String окопф;
    @XmlElement(name = "\u041e\u041a\u0424\u0421")
    protected String окфс;
    @XmlElement(name = "\u041e\u041a\u041f\u041e")
    protected String окпо;
    @XmlElement(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаРегистрации;
    @XmlElement(name = "\u0420\u0443\u043a\u043e\u0432\u043e\u0434\u0438\u0442\u0435\u043b\u044c")
    protected Контрагент руководитель;
    @XmlElement(name = "\u0420\u0430\u0441\u0447\u0435\u0442\u043d\u044b\u0435\u0421\u0447\u0435\u0442\u0430")
    protected РасчетныеСчета расчетныеСчета;
    @XmlElement(name = "\u041f\u043e\u043b\u043d\u043e\u0435\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435")
    protected String полноеНаименование;
    @XmlElement(name = "\u041e\u0431\u0440\u0430\u0449\u0435\u043d\u0438\u0435")
    protected String обращение;
    @XmlElement(name = "\u0424\u0430\u043c\u0438\u043b\u0438\u044f")
    protected String фамилия;
    @XmlElement(name = "\u0418\u043c\u044f")
    protected String имя;
    @XmlElement(name = "\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e")
    protected String отчество;
    @XmlElement(name = "\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434\u0435\u043d\u0438\u044f")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаРождения;
    @XmlElement(name = "\u041c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434\u0435\u043d\u0438\u044f")
    protected Адрес местоРождения;
    @XmlElement(name = "\u041f\u043e\u043b")
    @XmlSchemaType(name = "string")
    protected Пол пол;
    @XmlElement(name = "\u0423\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435\u041b\u0438\u0447\u043d\u043e\u0441\u0442\u0438")
    protected УдостоверениеЛичности удостоверениеЛичности;
    @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438")
    protected Адрес адресРегистрации;
    @XmlElement(name = "\u041e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f")
    protected Контрагент организация;
    @XmlElement(name = "\u0414\u043e\u043b\u0436\u043d\u043e\u0441\u0442\u044c")
    protected String должность;
    @XmlElement(name = "\u041a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439")
    protected String комментарий;
    @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441")
    protected Адрес адрес;
    @XmlElement(name = "\u041a\u043e\u043d\u0442\u0430\u043a\u0442\u044b")
    protected Контакты контакты;
    @XmlElement(name = "\u041f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u0438\u0442\u0435\u043b\u0438")
    protected Представители представители;

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
     * Gets the value of the официальноеНаименование property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОфициальноеНаименование() {
        return официальноеНаименование;
    }

    /**
     * Sets the value of the официальноеНаименование property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОфициальноеНаименование(String value) {
        this.официальноеНаименование = value;
    }

    /**
     * Gets the value of the юридическийАдрес property.
     * 
     * @return
     *     possible object is
     *     {@link Адрес }
     *     
     */
    public Адрес getЮридическийАдрес() {
        return юридическийАдрес;
    }

    /**
     * Sets the value of the юридическийАдрес property.
     * 
     * @param value
     *     allowed object is
     *     {@link Адрес }
     *     
     */
    public void setЮридическийАдрес(Адрес value) {
        this.юридическийАдрес = value;
    }

    /**
     * Gets the value of the инн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИНН() {
        return инн;
    }

    /**
     * Sets the value of the инн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИНН(String value) {
        this.инн = value;
    }

    /**
     * Gets the value of the кпп property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКПП() {
        return кпп;
    }

    /**
     * Sets the value of the кпп property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКПП(String value) {
        this.кпп = value;
    }

    /**
     * Gets the value of the основнойВидДеятельности property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОсновнойВидДеятельности() {
        return основнойВидДеятельности;
    }

    /**
     * Sets the value of the основнойВидДеятельности property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОсновнойВидДеятельности(String value) {
        this.основнойВидДеятельности = value;
    }

    /**
     * Gets the value of the егрпо property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getЕГРПО() {
        return егрпо;
    }

    /**
     * Sets the value of the егрпо property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setЕГРПО(String value) {
        this.егрпо = value;
    }

    /**
     * Gets the value of the оквэд property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОКВЭД() {
        return оквэд;
    }

    /**
     * Sets the value of the оквэд property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОКВЭД(String value) {
        this.оквэд = value;
    }

    /**
     * Gets the value of the окдп property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОКДП() {
        return окдп;
    }

    /**
     * Sets the value of the окдп property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОКДП(String value) {
        this.окдп = value;
    }

    /**
     * Gets the value of the окопф property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОКОПФ() {
        return окопф;
    }

    /**
     * Sets the value of the окопф property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОКОПФ(String value) {
        this.окопф = value;
    }

    /**
     * Gets the value of the окфс property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОКФС() {
        return окфс;
    }

    /**
     * Sets the value of the окфс property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОКФС(String value) {
        this.окфс = value;
    }

    /**
     * Gets the value of the окпо property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОКПО() {
        return окпо;
    }

    /**
     * Sets the value of the окпо property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОКПО(String value) {
        this.окпо = value;
    }

    /**
     * Gets the value of the датаРегистрации property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаРегистрации() {
        return датаРегистрации;
    }

    /**
     * Sets the value of the датаРегистрации property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаРегистрации(XMLGregorianCalendar value) {
        this.датаРегистрации = value;
    }

    /**
     * Gets the value of the руководитель property.
     * 
     * @return
     *     possible object is
     *     {@link Контрагент }
     *     
     */
    public Контрагент getРуководитель() {
        return руководитель;
    }

    /**
     * Sets the value of the руководитель property.
     * 
     * @param value
     *     allowed object is
     *     {@link Контрагент }
     *     
     */
    public void setРуководитель(Контрагент value) {
        this.руководитель = value;
    }

    /**
     * Gets the value of the расчетныеСчета property.
     * 
     * @return
     *     possible object is
     *     {@link РасчетныеСчета }
     *     
     */
    public РасчетныеСчета getРасчетныеСчета() {
        return расчетныеСчета;
    }

    /**
     * Sets the value of the расчетныеСчета property.
     * 
     * @param value
     *     allowed object is
     *     {@link РасчетныеСчета }
     *     
     */
    public void setРасчетныеСчета(РасчетныеСчета value) {
        this.расчетныеСчета = value;
    }

    /**
     * Gets the value of the полноеНаименование property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПолноеНаименование() {
        return полноеНаименование;
    }

    /**
     * Sets the value of the полноеНаименование property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПолноеНаименование(String value) {
        this.полноеНаименование = value;
    }

    /**
     * Gets the value of the обращение property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОбращение() {
        return обращение;
    }

    /**
     * Sets the value of the обращение property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОбращение(String value) {
        this.обращение = value;
    }

    /**
     * Gets the value of the фамилия property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getФамилия() {
        return фамилия;
    }

    /**
     * Sets the value of the фамилия property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setФамилия(String value) {
        this.фамилия = value;
    }

    /**
     * Gets the value of the имя property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИмя() {
        return имя;
    }

    /**
     * Sets the value of the имя property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИмя(String value) {
        this.имя = value;
    }

    /**
     * Gets the value of the отчество property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОтчество() {
        return отчество;
    }

    /**
     * Sets the value of the отчество property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОтчество(String value) {
        this.отчество = value;
    }

    /**
     * Gets the value of the датаРождения property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаРождения() {
        return датаРождения;
    }

    /**
     * Sets the value of the датаРождения property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаРождения(XMLGregorianCalendar value) {
        this.датаРождения = value;
    }

    /**
     * Gets the value of the местоРождения property.
     * 
     * @return
     *     possible object is
     *     {@link Адрес }
     *     
     */
    public Адрес getМестоРождения() {
        return местоРождения;
    }

    /**
     * Sets the value of the местоРождения property.
     * 
     * @param value
     *     allowed object is
     *     {@link Адрес }
     *     
     */
    public void setМестоРождения(Адрес value) {
        this.местоРождения = value;
    }

    /**
     * Gets the value of the пол property.
     * 
     * @return
     *     possible object is
     *     {@link Пол }
     *     
     */
    public Пол getПол() {
        return пол;
    }

    /**
     * Sets the value of the пол property.
     * 
     * @param value
     *     allowed object is
     *     {@link Пол }
     *     
     */
    public void setПол(Пол value) {
        this.пол = value;
    }

    /**
     * Gets the value of the удостоверениеЛичности property.
     * 
     * @return
     *     possible object is
     *     {@link УдостоверениеЛичности }
     *     
     */
    public УдостоверениеЛичности getУдостоверениеЛичности() {
        return удостоверениеЛичности;
    }

    /**
     * Sets the value of the удостоверениеЛичности property.
     * 
     * @param value
     *     allowed object is
     *     {@link УдостоверениеЛичности }
     *     
     */
    public void setУдостоверениеЛичности(УдостоверениеЛичности value) {
        this.удостоверениеЛичности = value;
    }

    /**
     * Gets the value of the адресРегистрации property.
     * 
     * @return
     *     possible object is
     *     {@link Адрес }
     *     
     */
    public Адрес getАдресРегистрации() {
        return адресРегистрации;
    }

    /**
     * Sets the value of the адресРегистрации property.
     * 
     * @param value
     *     allowed object is
     *     {@link Адрес }
     *     
     */
    public void setАдресРегистрации(Адрес value) {
        this.адресРегистрации = value;
    }

    /**
     * Gets the value of the организация property.
     * 
     * @return
     *     possible object is
     *     {@link Контрагент }
     *     
     */
    public Контрагент getОрганизация() {
        return организация;
    }

    /**
     * Sets the value of the организация property.
     * 
     * @param value
     *     allowed object is
     *     {@link Контрагент }
     *     
     */
    public void setОрганизация(Контрагент value) {
        this.организация = value;
    }

    /**
     * Gets the value of the должность property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getДолжность() {
        return должность;
    }

    /**
     * Sets the value of the должность property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДолжность(String value) {
        this.должность = value;
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
     * Gets the value of the представители property.
     * 
     * @return
     *     possible object is
     *     {@link Представители }
     *     
     */
    public Представители getПредставители() {
        return представители;
    }

    /**
     * Sets the value of the представители property.
     * 
     * @param value
     *     allowed object is
     *     {@link Представители }
     *     
     */
    public void setПредставители(Представители value) {
        this.представители = value;
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
     *         <element name="Представитель" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{urn:1C.ru:commerceml_205}Контрагент">
     *                 <sequence>
     *                   <element name="Отношение" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "\u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u0438\u0442\u0435\u043b\u044c"
    })
    public static class Представители {

        @XmlElement(name = "\u041f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u0438\u0442\u0435\u043b\u044c", required = true)
        protected List<Представитель> представитель;

        /**
         * Gets the value of the представитель property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the представитель property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getПредставитель().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Представитель }
         * 
         * 
         * @return
         *     The value of the представитель property.
         */
        public List<Представитель> getПредставитель() {
            if (представитель == null) {
                представитель = new ArrayList<>();
            }
            return this.представитель;
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
         *         <element name="Отношение" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "\u043e\u0442\u043d\u043e\u0448\u0435\u043d\u0438\u0435"
        })
        public static class Представитель
            extends Контрагент
        {

            @XmlElement(name = "\u041e\u0442\u043d\u043e\u0448\u0435\u043d\u0438\u0435", required = true)
            protected String отношение;

            /**
             * Gets the value of the отношение property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getОтношение() {
                return отношение;
            }

            /**
             * Sets the value of the отношение property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setОтношение(String value) {
                this.отношение = value;
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
     *         <element name="РасчетныйСчет" type="{urn:1C.ru:commerceml_205}РасчетныйСчет" maxOccurs="unbounded"/>
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
        "\u0440\u0430\u0441\u0447\u0435\u0442\u043d\u044b\u0439\u0421\u0447\u0435\u0442"
    })
    public static class РасчетныеСчета {

        @XmlElement(name = "\u0420\u0430\u0441\u0447\u0435\u0442\u043d\u044b\u0439\u0421\u0447\u0435\u0442", required = true)
        protected List<РасчетныйСчет> расчетныйСчет;

        /**
         * Gets the value of the расчетныйСчет property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the расчетныйСчет property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getРасчетныйСчет().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link РасчетныйСчет }
         * 
         * 
         * @return
         *     The value of the расчетныйСчет property.
         */
        public List<РасчетныйСчет> getРасчетныйСчет() {
            if (расчетныйСчет == null) {
                расчетныйСчет = new ArrayList<>();
            }
            return this.расчетныйСчет;
        }

    }

}
