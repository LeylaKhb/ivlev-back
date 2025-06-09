
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for Контакт complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Контакт">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Тип" type="{urn:1C.ru:commerceml_205}ТипКонтакта"/>
 *         <element name="Значение" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Комментарий" type="{urn:1C.ru:commerceml_205}Комментарий" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041a\u043e\u043d\u0442\u0430\u043a\u0442", propOrder = {
    "\u0442\u0438\u043f",
    "\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435",
    "\u043a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439"
})
public class Контакт {

    @XmlElement(name = "\u0422\u0438\u043f", required = true)
    @XmlSchemaType(name = "string")
    protected ТипКонтакта тип;
    @XmlElement(name = "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435", required = true)
    protected String значение;
    @XmlElement(name = "\u041a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439")
    protected String комментарий;

    /**
     * Gets the value of the тип property.
     * 
     * @return
     *     possible object is
     *     {@link ТипКонтакта }
     *     
     */
    public ТипКонтакта getТип() {
        return тип;
    }

    /**
     * Sets the value of the тип property.
     * 
     * @param value
     *     allowed object is
     *     {@link ТипКонтакта }
     *     
     */
    public void setТип(ТипКонтакта value) {
        this.тип = value;
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

}
