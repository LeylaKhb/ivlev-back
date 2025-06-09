
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for РасчетныйСчет complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="РасчетныйСчет">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="НомерСчета" type="{urn:1C.ru:commerceml_205}НомерСчета"/>
 *         <element name="Банк" type="{urn:1C.ru:commerceml_205}Банк"/>
 *         <element name="БанкКорреспондент" type="{urn:1C.ru:commerceml_205}Банк" minOccurs="0"/>
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
@XmlType(name = "\u0420\u0430\u0441\u0447\u0435\u0442\u043d\u044b\u0439\u0421\u0447\u0435\u0442", propOrder = {
    "\u043d\u043e\u043c\u0435\u0440\u0421\u0447\u0435\u0442\u0430",
    "\u0431\u0430\u043d\u043a",
    "\u0431\u0430\u043d\u043a\u041a\u043e\u0440\u0440\u0435\u0441\u043f\u043e\u043d\u0434\u0435\u043d\u0442",
    "\u043a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439"
})
public class РасчетныйСчет {

    @XmlElement(name = "\u041d\u043e\u043c\u0435\u0440\u0421\u0447\u0435\u0442\u0430", required = true)
    protected String номерСчета;
    @XmlElement(name = "\u0411\u0430\u043d\u043a", required = true)
    protected Банк банк;
    @XmlElement(name = "\u0411\u0430\u043d\u043a\u041a\u043e\u0440\u0440\u0435\u0441\u043f\u043e\u043d\u0434\u0435\u043d\u0442")
    protected Банк банкКорреспондент;
    @XmlElement(name = "\u041a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439")
    protected String комментарий;

    /**
     * Gets the value of the номерСчета property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНомерСчета() {
        return номерСчета;
    }

    /**
     * Sets the value of the номерСчета property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНомерСчета(String value) {
        this.номерСчета = value;
    }

    /**
     * Gets the value of the банк property.
     * 
     * @return
     *     possible object is
     *     {@link Банк }
     *     
     */
    public Банк getБанк() {
        return банк;
    }

    /**
     * Sets the value of the банк property.
     * 
     * @param value
     *     allowed object is
     *     {@link Банк }
     *     
     */
    public void setБанк(Банк value) {
        this.банк = value;
    }

    /**
     * Gets the value of the банкКорреспондент property.
     * 
     * @return
     *     possible object is
     *     {@link Банк }
     *     
     */
    public Банк getБанкКорреспондент() {
        return банкКорреспондент;
    }

    /**
     * Sets the value of the банкКорреспондент property.
     * 
     * @param value
     *     allowed object is
     *     {@link Банк }
     *     
     */
    public void setБанкКорреспондент(Банк value) {
        this.банкКорреспондент = value;
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
