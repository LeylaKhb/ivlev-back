
package ivlev.ivlevback._1c.exchangewithsites;

import ivlev.ivlevback._1c.commerceml_205.КоммерческаяИнформация;
import jakarta.xml.bind.annotation.*;


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
 *         <element name="return" type="{urn:1C.ru:commerceml_205}КоммерческаяИнформация"/>
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
    "_return"
})
@XmlRootElement(name = "GetItemsResponse")
public class GetItemsResponse {

    @XmlElement(name = "return", required = true, nillable = true)
    protected КоммерческаяИнформация _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link КоммерческаяИнформация }
     *     
     */
    public КоммерческаяИнформация getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link КоммерческаяИнформация }
     *     
     */
    public void setReturn(КоммерческаяИнформация value) {
        this._return = value;
    }

}
