
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
 *         <element name="OrdersData" type="{urn:1C.ru:commerceml_205}КоммерческаяИнформация"/>
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
    "ordersData"
})
@XmlRootElement(name = "LoadOrders")
public class LoadOrders {

    @XmlElement(name = "OrdersData", required = true)
    protected КоммерческаяИнформация ordersData;

    /**
     * Gets the value of the ordersData property.
     * 
     * @return
     *     possible object is
     *     {@link КоммерческаяИнформация }
     *     
     */
    public КоммерческаяИнформация getOrdersData() {
        return ordersData;
    }

    /**
     * Sets the value of the ordersData property.
     * 
     * @param value
     *     allowed object is
     *     {@link КоммерческаяИнформация }
     *     
     */
    public void setOrdersData(КоммерческаяИнформация value) {
        this.ordersData = value;
    }

}
