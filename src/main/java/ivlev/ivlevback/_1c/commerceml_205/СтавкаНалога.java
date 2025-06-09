
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for СтавкаНалога complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="СтавкаНалога">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Ставка" type="{urn:1C.ru:commerceml_205}Коэффициент"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0421\u0442\u0430\u0432\u043a\u0430\u041d\u0430\u043b\u043e\u0433\u0430", propOrder = {
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u0441\u0442\u0430\u0432\u043a\u0430"
})
public class СтавкаНалога {

    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435", required = true)
    protected String наименование;
    @XmlElement(name = "\u0421\u0442\u0430\u0432\u043a\u0430", required = true)
    protected String ставка;

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
     * Gets the value of the ставка property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getСтавка() {
        return ставка;
    }

    /**
     * Sets the value of the ставка property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setСтавка(String value) {
        this.ставка = value;
    }

}
