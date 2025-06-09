
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Адрес complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Адрес">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Представление" type="{urn:1C.ru:commerceml_205}Наименование"/>
 *         <element name="Комментарий" type="{urn:1C.ru:commerceml_205}Комментарий" minOccurs="0"/>
 *         <element name="АдресноеПоле" type="{urn:1C.ru:commerceml_205}АдресноеПоле" maxOccurs="10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0410\u0434\u0440\u0435\u0441", propOrder = {
    "\u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u0438\u0435",
    "\u043a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439",
    "\u0430\u0434\u0440\u0435\u0441\u043d\u043e\u0435\u041f\u043e\u043b\u0435"
})
public class Адрес {

    @XmlElement(name = "\u041f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u0438\u0435", required = true)
    protected String представление;
    @XmlElement(name = "\u041a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439")
    protected String комментарий;
    @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441\u043d\u043e\u0435\u041f\u043e\u043b\u0435")
    protected List<АдресноеПоле> адресноеПоле;

    /**
     * Gets the value of the представление property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПредставление() {
        return представление;
    }

    /**
     * Sets the value of the представление property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПредставление(String value) {
        this.представление = value;
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
     * Gets the value of the адресноеПоле property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the адресноеПоле property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getАдресноеПоле().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link АдресноеПоле }
     * 
     * 
     * @return
     *     The value of the адресноеПоле property.
     */
    public List<АдресноеПоле> getАдресноеПоле() {
        if (адресноеПоле == null) {
            адресноеПоле = new ArrayList<>();
        }
        return this.адресноеПоле;
    }

}
