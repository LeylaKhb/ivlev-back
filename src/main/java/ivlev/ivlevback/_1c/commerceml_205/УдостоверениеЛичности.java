
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for УдостоверениеЛичности complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="УдостоверениеЛичности">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ВидДокумента" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Серия" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Номер" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ДатаВыдачи" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="КемВыдан" type="{urn:1C.ru:commerceml_205}Наименование"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0423\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435\u041b\u0438\u0447\u043d\u043e\u0441\u0442\u0438", propOrder = {
    "\u0432\u0438\u0434\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0430",
    "\u0441\u0435\u0440\u0438\u044f",
    "\u043d\u043e\u043c\u0435\u0440",
    "\u0434\u0430\u0442\u0430\u0412\u044b\u0434\u0430\u0447\u0438",
    "\u043a\u0435\u043c\u0412\u044b\u0434\u0430\u043d"
})
public class УдостоверениеЛичности {

    @XmlElement(name = "\u0412\u0438\u0434\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0430", required = true)
    protected String видДокумента;
    @XmlElement(name = "\u0421\u0435\u0440\u0438\u044f")
    protected String серия;
    @XmlElement(name = "\u041d\u043e\u043c\u0435\u0440", required = true)
    protected String номер;
    @XmlElement(name = "\u0414\u0430\u0442\u0430\u0412\u044b\u0434\u0430\u0447\u0438", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаВыдачи;
    @XmlElement(name = "\u041a\u0435\u043c\u0412\u044b\u0434\u0430\u043d", required = true)
    protected String кемВыдан;

    /**
     * Gets the value of the видДокумента property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВидДокумента() {
        return видДокумента;
    }

    /**
     * Sets the value of the видДокумента property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВидДокумента(String value) {
        this.видДокумента = value;
    }

    /**
     * Gets the value of the серия property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getСерия() {
        return серия;
    }

    /**
     * Sets the value of the серия property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setСерия(String value) {
        this.серия = value;
    }

    /**
     * Gets the value of the номер property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНомер() {
        return номер;
    }

    /**
     * Sets the value of the номер property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНомер(String value) {
        this.номер = value;
    }

    /**
     * Gets the value of the датаВыдачи property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаВыдачи() {
        return датаВыдачи;
    }

    /**
     * Sets the value of the датаВыдачи property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаВыдачи(XMLGregorianCalendar value) {
        this.датаВыдачи = value;
    }

    /**
     * Gets the value of the кемВыдан property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКемВыдан() {
        return кемВыдан;
    }

    /**
     * Sets the value of the кемВыдан property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКемВыдан(String value) {
        this.кемВыдан = value;
    }

}
