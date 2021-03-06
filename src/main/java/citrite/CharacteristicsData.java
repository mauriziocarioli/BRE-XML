//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.16 at 09:44:55 AM EDT 
//


package citrite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Characteristic" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="KeyDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VaueDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="SKU_Marketing" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "characteristic"
})
@XmlRootElement(name = "CharacteristicsData", namespace = "urn:schemas-citrite-net:pip:bre:characteristics:1")
public class CharacteristicsData {

    @XmlElement(name = "Characteristic")
    protected List<CharacteristicsData.Characteristic> characteristic;

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicsData.Characteristic }
     * 
     * 
     */
    public List<CharacteristicsData.Characteristic> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<CharacteristicsData.Characteristic>();
        }
        return this.characteristic;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="KeyDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="VaueDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="SKU_Marketing" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "keyDesc",
        "value",
        "vaueDesc"
    })
    public static class Characteristic {

        @XmlElement(name = "Key", required = true)
        protected String key;
        @XmlElement(name = "KeyDesc", required = true)
        protected String keyDesc;
        @XmlElement(name = "Value", required = true)
        protected String value;
        @XmlElement(name = "VaueDesc", required = true)
        protected String vaueDesc;
        @XmlAttribute(name = "SKU_Marketing")
        protected String skuMarketing;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

        /**
         * Gets the value of the keyDesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeyDesc() {
            return keyDesc;
        }

        /**
         * Sets the value of the keyDesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeyDesc(String value) {
            this.keyDesc = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the vaueDesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVaueDesc() {
            return vaueDesc;
        }

        /**
         * Sets the value of the vaueDesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVaueDesc(String value) {
            this.vaueDesc = value;
        }

        /**
         * Gets the value of the skuMarketing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSKUMarketing() {
            return skuMarketing;
        }

        /**
         * Sets the value of the skuMarketing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSKUMarketing(String value) {
            this.skuMarketing = value;
        }

    }

}
