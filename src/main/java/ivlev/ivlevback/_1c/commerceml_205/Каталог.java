
package ivlev.ivlevback._1c.commerceml_205;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Каталог complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Каталог">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ид" type="{urn:1C.ru:commerceml_205}Идентификатор"/>
 *         <element name="ИдКлассификатора" type="{urn:1C.ru:commerceml_205}Идентификатор" minOccurs="0"/>
 *         <element name="Наименование" type="{urn:1C.ru:commerceml_205}Наименование"/>
 *         <element name="Владелец" type="{urn:1C.ru:commerceml_205}Контрагент"/>
 *         <element name="Товары">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Товар" type="{urn:1C.ru:commerceml_205}Товар" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Описание" type="{urn:1C.ru:commerceml_205}Комментарий" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="СодержитТолькоИзменения" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041a\u0430\u0442\u0430\u043b\u043e\u0433", propOrder = {
    "\u0438\u0434",
    "\u0438\u0434\u041a\u043b\u0430\u0441\u0441\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0430",
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u0432\u043b\u0430\u0434\u0435\u043b\u0435\u0446",
    "\u0442\u043e\u0432\u0430\u0440\u044b",
    "\u043e\u043f\u0438\u0441\u0430\u043d\u0438\u0435"
})
public class Каталог {

    @XmlElement(name = "\u0418\u0434", required = true)
    protected String ид;
    @XmlElement(name = "\u0418\u0434\u041a\u043b\u0430\u0441\u0441\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0430")
    protected String идКлассификатора;
    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435", required = true)
    protected String наименование;
    @XmlElement(name = "\u0412\u043b\u0430\u0434\u0435\u043b\u0435\u0446", required = true)
    protected Контрагент владелец;
    @XmlElement(name = "\u0422\u043e\u0432\u0430\u0440\u044b", required = true)
    protected Товары товары;
    @XmlElement(name = "\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435")
    protected String описание;
    @XmlAttribute(name = "\u0421\u043e\u0434\u0435\u0440\u0436\u0438\u0442\u0422\u043e\u043b\u044c\u043a\u043e\u0418\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u044f")
    protected Boolean содержитТолькоИзменения;

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
     * Gets the value of the идКлассификатора property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИдКлассификатора() {
        return идКлассификатора;
    }

    /**
     * Sets the value of the идКлассификатора property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИдКлассификатора(String value) {
        this.идКлассификатора = value;
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
     * Gets the value of the владелец property.
     * 
     * @return
     *     possible object is
     *     {@link Контрагент }
     *     
     */
    public Контрагент getВладелец() {
        return владелец;
    }

    /**
     * Sets the value of the владелец property.
     * 
     * @param value
     *     allowed object is
     *     {@link Контрагент }
     *     
     */
    public void setВладелец(Контрагент value) {
        this.владелец = value;
    }

    /**
     * Gets the value of the товары property.
     * 
     * @return
     *     possible object is
     *     {@link Товары }
     *     
     */
    public Товары getТовары() {
        return товары;
    }

    /**
     * Sets the value of the товары property.
     * 
     * @param value
     *     allowed object is
     *     {@link Товары }
     *     
     */
    public void setТовары(Товары value) {
        this.товары = value;
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
     * Gets the value of the содержитТолькоИзменения property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isСодержитТолькоИзменения() {
        return содержитТолькоИзменения;
    }

    /**
     * Sets the value of the содержитТолькоИзменения property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setСодержитТолькоИзменения(Boolean value) {
        this.содержитТолькоИзменения = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Товар" type="{urn:1C.ru:commerceml_205}Товар" maxOccurs="unbounded"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0442\u043e\u0432\u0430\u0440"
    })
    public static class Товары {

        @XmlElement(name = "\u0422\u043e\u0432\u0430\u0440", required = true)
        protected List<Товар> товар;

        /**
         * Gets the value of the товар property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the товар property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getТовар().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Товар }
         * 
         * 
         * @return
         *     The value of the товар property.
         */
        public List<Товар> getТовар() {
            if (товар == null) {
                товар = new ArrayList<>();
            }
            return this.товар;
        }

    }

}
