
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ТипЦены complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ТипЦены">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ид" type="{urn:1C.ru:commerceml_205}Идентификатор"/>
 *         <element name="ИдСайта" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
 *         <element name="Наименование" type="{urn:1C.ru:commerceml_205}Наименование" minOccurs="0"/>
 *         <element name="Валюта" type="{urn:1C.ru:commerceml_205}КодВалюты" minOccurs="0"/>
 *         <element name="Описание" type="{urn:1C.ru:commerceml_205}Комментарий" minOccurs="0"/>
 *         <element name="Налог" type="{urn:1C.ru:commerceml_205}Налог" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0422\u0438\u043f\u0426\u0435\u043d\u044b", propOrder = {
    "\u0438\u0434",
    "\u0438\u0434\u0421\u0430\u0439\u0442\u0430",
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u0432\u0430\u043b\u044e\u0442\u0430",
    "\u043e\u043f\u0438\u0441\u0430\u043d\u0438\u0435",
    "\u043d\u0430\u043b\u043e\u0433"
})
public class ТипЦены {

    @XmlElement(name = "\u0418\u0434", required = true)
    protected String ид;
    @XmlElement(name = "\u0418\u0434\u0421\u0430\u0439\u0442\u0430")
    protected String идСайта;
    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435")
    protected String наименование;
    @XmlElement(name = "\u0412\u0430\u043b\u044e\u0442\u0430")
    protected String валюта;
    @XmlElement(name = "\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435")
    protected String описание;
    @XmlElement(name = "\u041d\u0430\u043b\u043e\u0433")
    protected List<Налог> налог;

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
     * {@link Налог }
     * 
     * 
     * @return
     *     The value of the налог property.
     */
    public List<Налог> getНалог() {
        if (налог == null) {
            налог = new ArrayList<>();
        }
        return this.налог;
    }

}
