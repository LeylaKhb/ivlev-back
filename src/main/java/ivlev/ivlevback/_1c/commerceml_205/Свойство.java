
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for Свойство complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Свойство">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ид" type="{urn:1C.ru:commerceml_205}Идентификатор"/>
 *         <element name="ИдСайта" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
 *         <element name="Наименование" type="{urn:1C.ru:commerceml_205}Наименование"/>
 *         <element name="Описание" type="{urn:1C.ru:commerceml_205}Комментарий" minOccurs="0"/>
 *         <element name="Обязательное" type="{urn:1C.ru:commerceml_205}ОбязательностьСвойства" minOccurs="0"/>
 *         <element name="Множественное" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ТипЗначений" type="{urn:1C.ru:commerceml_205}ТипЗначенийСвойства" minOccurs="0"/>
 *         <element name="ВариантыЗначений" type="{urn:1C.ru:commerceml_205}ВариантыЗначенийСвойства" minOccurs="0"/>
 *         <element name="ДляТоваров" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ДляПредложений" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ДляДокументов" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0421\u0432\u043e\u0439\u0441\u0442\u0432\u043e", propOrder = {
    "\u0438\u0434",
    "\u0438\u0434\u0421\u0430\u0439\u0442\u0430",
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u043e\u043f\u0438\u0441\u0430\u043d\u0438\u0435",
    "\u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u043e\u0435",
    "\u043c\u043d\u043e\u0436\u0435\u0441\u0442\u0432\u0435\u043d\u043d\u043e\u0435",
    "\u0442\u0438\u043f\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0439",
    "\u0432\u0430\u0440\u0438\u0430\u043d\u0442\u044b\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0439",
    "\u0434\u043b\u044f\u0422\u043e\u0432\u0430\u0440\u043e\u0432",
    "\u0434\u043b\u044f\u041f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u0439",
    "\u0434\u043b\u044f\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u043e\u0432"
})
public class Свойство {

    @XmlElement(name = "\u0418\u0434", required = true)
    protected String ид;
    @XmlElement(name = "\u0418\u0434\u0421\u0430\u0439\u0442\u0430")
    protected String идСайта;
    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435", required = true)
    protected String наименование;
    @XmlElement(name = "\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435")
    protected String описание;
    @XmlElement(name = "\u041e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u043e\u0435")
    @XmlSchemaType(name = "string")
    protected ОбязательностьСвойства обязательное;
    @XmlElement(name = "\u041c\u043d\u043e\u0436\u0435\u0441\u0442\u0432\u0435\u043d\u043d\u043e\u0435")
    protected Boolean множественное;
    @XmlElement(name = "\u0422\u0438\u043f\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0439")
    @XmlSchemaType(name = "string")
    protected ТипЗначенийСвойства типЗначений;
    @XmlElement(name = "\u0412\u0430\u0440\u0438\u0430\u043d\u0442\u044b\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0439")
    protected ВариантыЗначенийСвойства вариантыЗначений;
    @XmlElement(name = "\u0414\u043b\u044f\u0422\u043e\u0432\u0430\u0440\u043e\u0432")
    protected Boolean дляТоваров;
    @XmlElement(name = "\u0414\u043b\u044f\u041f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u0439")
    protected Boolean дляПредложений;
    @XmlElement(name = "\u0414\u043b\u044f\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u043e\u0432")
    protected Boolean дляДокументов;

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
     * Gets the value of the обязательное property.
     * 
     * @return
     *     possible object is
     *     {@link ОбязательностьСвойства }
     *     
     */
    public ОбязательностьСвойства getОбязательное() {
        return обязательное;
    }

    /**
     * Sets the value of the обязательное property.
     * 
     * @param value
     *     allowed object is
     *     {@link ОбязательностьСвойства }
     *     
     */
    public void setОбязательное(ОбязательностьСвойства value) {
        this.обязательное = value;
    }

    /**
     * Gets the value of the множественное property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isМножественное() {
        return множественное;
    }

    /**
     * Sets the value of the множественное property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setМножественное(Boolean value) {
        this.множественное = value;
    }

    /**
     * Gets the value of the типЗначений property.
     * 
     * @return
     *     possible object is
     *     {@link ТипЗначенийСвойства }
     *     
     */
    public ТипЗначенийСвойства getТипЗначений() {
        return типЗначений;
    }

    /**
     * Sets the value of the типЗначений property.
     * 
     * @param value
     *     allowed object is
     *     {@link ТипЗначенийСвойства }
     *     
     */
    public void setТипЗначений(ТипЗначенийСвойства value) {
        this.типЗначений = value;
    }

    /**
     * Gets the value of the вариантыЗначений property.
     * 
     * @return
     *     possible object is
     *     {@link ВариантыЗначенийСвойства }
     *     
     */
    public ВариантыЗначенийСвойства getВариантыЗначений() {
        return вариантыЗначений;
    }

    /**
     * Sets the value of the вариантыЗначений property.
     * 
     * @param value
     *     allowed object is
     *     {@link ВариантыЗначенийСвойства }
     *     
     */
    public void setВариантыЗначений(ВариантыЗначенийСвойства value) {
        this.вариантыЗначений = value;
    }

    /**
     * Gets the value of the дляТоваров property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isДляТоваров() {
        return дляТоваров;
    }

    /**
     * Sets the value of the дляТоваров property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setДляТоваров(Boolean value) {
        this.дляТоваров = value;
    }

    /**
     * Gets the value of the дляПредложений property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isДляПредложений() {
        return дляПредложений;
    }

    /**
     * Sets the value of the дляПредложений property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setДляПредложений(Boolean value) {
        this.дляПредложений = value;
    }

    /**
     * Gets the value of the дляДокументов property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isДляДокументов() {
        return дляДокументов;
    }

    /**
     * Sets the value of the дляДокументов property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setДляДокументов(Boolean value) {
        this.дляДокументов = value;
    }

}
