
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for КоммерческаяИнформация complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="КоммерческаяИнформация">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Классификатор" type="{urn:1C.ru:commerceml_205}Классификатор" minOccurs="0"/>
 *         <element name="Каталог" type="{urn:1C.ru:commerceml_205}Каталог" minOccurs="0"/>
 *         <element name="ПакетПредложений" type="{urn:1C.ru:commerceml_205}ПакетПредложений" minOccurs="0"/>
 *         <element name="Документ" type="{urn:1C.ru:commerceml_205}Документ" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ВерсияСхемы" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ДатаФормирования" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041a\u043e\u043c\u043c\u0435\u0440\u0447\u0435\u0441\u043a\u0430\u044f\u0418\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044f", propOrder = {
    "\u043a\u043b\u0430\u0441\u0441\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440",
    "\u043a\u0430\u0442\u0430\u043b\u043e\u0433",
    "\u043f\u0430\u043a\u0435\u0442\u041f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u0439",
    "\u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442"
})
public class КоммерческаяИнформация {

    @XmlElement(name = "\u041a\u043b\u0430\u0441\u0441\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440")
    protected Классификатор классификатор;
    @XmlElement(name = "\u041a\u0430\u0442\u0430\u043b\u043e\u0433")
    protected Каталог каталог;
    @XmlElement(name = "\u041f\u0430\u043a\u0435\u0442\u041f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u0439")
    protected ПакетПредложений пакетПредложений;
    @XmlElement(name = "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442")
    protected List<Документ> документ;
    @XmlAttribute(name = "\u0412\u0435\u0440\u0441\u0438\u044f\u0421\u0445\u0435\u043c\u044b", required = true)
    protected String версияСхемы;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0424\u043e\u0440\u043c\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar датаФормирования;

    /**
     * Gets the value of the классификатор property.
     * 
     * @return
     *     possible object is
     *     {@link Классификатор }
     *     
     */
    public Классификатор getКлассификатор() {
        return классификатор;
    }

    /**
     * Sets the value of the классификатор property.
     * 
     * @param value
     *     allowed object is
     *     {@link Классификатор }
     *     
     */
    public void setКлассификатор(Классификатор value) {
        this.классификатор = value;
    }

    /**
     * Gets the value of the каталог property.
     * 
     * @return
     *     possible object is
     *     {@link Каталог }
     *     
     */
    public Каталог getКаталог() {
        return каталог;
    }

    /**
     * Sets the value of the каталог property.
     * 
     * @param value
     *     allowed object is
     *     {@link Каталог }
     *     
     */
    public void setКаталог(Каталог value) {
        this.каталог = value;
    }

    /**
     * Gets the value of the пакетПредложений property.
     * 
     * @return
     *     possible object is
     *     {@link ПакетПредложений }
     *     
     */
    public ПакетПредложений getПакетПредложений() {
        return пакетПредложений;
    }

    /**
     * Sets the value of the пакетПредложений property.
     * 
     * @param value
     *     allowed object is
     *     {@link ПакетПредложений }
     *     
     */
    public void setПакетПредложений(ПакетПредложений value) {
        this.пакетПредложений = value;
    }

    /**
     * Gets the value of the документ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the документ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getДокумент().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Документ }
     * 
     * 
     * @return
     *     The value of the документ property.
     */
    public List<Документ> getДокумент() {
        if (документ == null) {
            документ = new ArrayList<>();
        }
        return this.документ;
    }

    /**
     * Gets the value of the версияСхемы property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВерсияСхемы() {
        return версияСхемы;
    }

    /**
     * Sets the value of the версияСхемы property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВерсияСхемы(String value) {
        this.версияСхемы = value;
    }

    /**
     * Gets the value of the датаФормирования property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаФормирования() {
        return датаФормирования;
    }

    /**
     * Sets the value of the датаФормирования property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаФормирования(XMLGregorianCalendar value) {
        this.датаФормирования = value;
    }

}
