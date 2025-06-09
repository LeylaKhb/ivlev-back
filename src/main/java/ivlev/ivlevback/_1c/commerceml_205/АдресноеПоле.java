
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for АдресноеПоле complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="АдресноеПоле">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Тип" type="{urn:1C.ru:commerceml_205}ТипАдреса"/>
 *         <element name="Значение" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0410\u0434\u0440\u0435\u0441\u043d\u043e\u0435\u041f\u043e\u043b\u0435", propOrder = {
    "\u0442\u0438\u043f",
    "\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435"
})
public class АдресноеПоле {

    @XmlElement(name = "\u0422\u0438\u043f", required = true)
    @XmlSchemaType(name = "string")
    protected ТипАдреса тип;
    @XmlElement(name = "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435", required = true)
    protected String значение;

    /**
     * Gets the value of the тип property.
     * 
     * @return
     *     possible object is
     *     {@link ТипАдреса }
     *     
     */
    public ТипАдреса getТип() {
        return тип;
    }

    /**
     * Sets the value of the тип property.
     * 
     * @param value
     *     allowed object is
     *     {@link ТипАдреса }
     *     
     */
    public void setТип(ТипАдреса value) {
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

}
