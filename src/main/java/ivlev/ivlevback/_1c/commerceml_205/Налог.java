
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Налог complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Налог">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Наименование" type="{urn:1C.ru:commerceml_205}Наименование"/>
 *         <element name="УчтеноВСумме" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Акциз" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041d\u0430\u043b\u043e\u0433", propOrder = {
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u0443\u0447\u0442\u0435\u043d\u043e\u0412\u0421\u0443\u043c\u043c\u0435",
    "\u0430\u043a\u0446\u0438\u0437"
})
public class Налог {

    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435", required = true)
    protected String наименование;
    @XmlElement(name = "\u0423\u0447\u0442\u0435\u043d\u043e\u0412\u0421\u0443\u043c\u043c\u0435")
    protected Boolean учтеноВСумме;
    @XmlElement(name = "\u0410\u043a\u0446\u0438\u0437")
    protected Boolean акциз;

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
     * Gets the value of the учтеноВСумме property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isУчтеноВСумме() {
        return учтеноВСумме;
    }

    /**
     * Sets the value of the учтеноВСумме property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setУчтеноВСумме(Boolean value) {
        this.учтеноВСумме = value;
    }

    /**
     * Gets the value of the акциз property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isАкциз() {
        return акциз;
    }

    /**
     * Sets the value of the акциз property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setАкциз(Boolean value) {
        this.акциз = value;
    }

}
