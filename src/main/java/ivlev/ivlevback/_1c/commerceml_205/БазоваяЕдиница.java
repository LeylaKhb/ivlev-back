
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for БазоваяЕдиница complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="БазоваяЕдиница">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Пересчет" type="{urn:1C.ru:commerceml_205}Пересчет" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Код">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="3"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="НаименованиеПолное" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="МеждународноеСокращение">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="3"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0411\u0430\u0437\u043e\u0432\u0430\u044f\u0415\u0434\u0438\u043d\u0438\u0446\u0430", propOrder = {
    "\u043f\u0435\u0440\u0435\u0441\u0447\u0435\u0442"
})
public class БазоваяЕдиница {

    @XmlElement(name = "\u041f\u0435\u0440\u0435\u0441\u0447\u0435\u0442")
    protected List<Пересчет> пересчет;
    @XmlAttribute(name = "\u041a\u043e\u0434")
    protected String код;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435\u041f\u043e\u043b\u043d\u043e\u0435")
    protected String наименованиеПолное;
    @XmlAttribute(name = "\u041c\u0435\u0436\u0434\u0443\u043d\u0430\u0440\u043e\u0434\u043d\u043e\u0435\u0421\u043e\u043a\u0440\u0430\u0449\u0435\u043d\u0438\u0435")
    protected String международноеСокращение;

    /**
     * Gets the value of the пересчет property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the пересчет property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getПересчет().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Пересчет }
     * 
     * 
     * @return
     *     The value of the пересчет property.
     */
    public List<Пересчет> getПересчет() {
        if (пересчет == null) {
            пересчет = new ArrayList<>();
        }
        return this.пересчет;
    }

    /**
     * Gets the value of the код property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКод() {
        return код;
    }

    /**
     * Sets the value of the код property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКод(String value) {
        this.код = value;
    }

    /**
     * Gets the value of the наименованиеПолное property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаименованиеПолное() {
        return наименованиеПолное;
    }

    /**
     * Sets the value of the наименованиеПолное property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаименованиеПолное(String value) {
        this.наименованиеПолное = value;
    }

    /**
     * Gets the value of the международноеСокращение property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getМеждународноеСокращение() {
        return международноеСокращение;
    }

    /**
     * Sets the value of the международноеСокращение property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setМеждународноеСокращение(String value) {
        this.международноеСокращение = value;
    }

}
