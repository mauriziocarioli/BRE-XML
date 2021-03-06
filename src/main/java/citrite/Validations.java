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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Validation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CheckName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CheckDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="CheckResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Header" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OrderLineID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CheckType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MergedStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "validation"
})
public class Validations {

    @XmlElement(name = "Validation")
    protected List<Validations.Validation> validation;
    @XmlAttribute(name = "Status")
    protected String status;

    /**
     * Gets the value of the validation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Validations.Validation }
     * 
     * 
     */
    public List<Validations.Validation> getValidation() {
        if (validation == null) {
            validation = new ArrayList<Validations.Validation>();
        }
        return this.validation;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     *         &lt;element name="CheckName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CheckDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="CheckResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Header" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OrderLineID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CheckType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MergedStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "checkName",
        "checkDate",
        "checkResult",
        "header",
        "orderID",
        "orderLineID",
        "checkType",
        "mergedStatus"
    })
    public static class Validation {

        @XmlElement(name = "CheckName", required = true)
        protected String checkName;
        @XmlElement(name = "CheckDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar checkDate;
        @XmlElement(name = "CheckResult", required = true)
        protected String checkResult;
        @XmlElement(name = "Header")
        protected boolean header;
        @XmlElement(name = "OrderID", required = true)
        protected String orderID;
        @XmlElement(name = "OrderLineID", required = true)
        protected String orderLineID;
        @XmlElement(name = "CheckType")
        protected String checkType;
        @XmlElement(name = "MergedStatus")
        protected boolean mergedStatus;

        /**
         * Gets the value of the checkName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCheckName() {
            return checkName;
        }

        /**
         * Sets the value of the checkName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheckName(String value) {
            this.checkName = value;
        }

        /**
         * Gets the value of the checkDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCheckDate() {
            return checkDate;
        }

        /**
         * Sets the value of the checkDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCheckDate(XMLGregorianCalendar value) {
            this.checkDate = value;
        }

        /**
         * Gets the value of the checkResult property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCheckResult() {
            return checkResult;
        }

        /**
         * Sets the value of the checkResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheckResult(String value) {
            this.checkResult = value;
        }

        /**
         * Gets the value of the header property.
         * 
         */
        public boolean isHeader() {
            return header;
        }

        /**
         * Sets the value of the header property.
         * 
         */
        public void setHeader(boolean value) {
            this.header = value;
        }

        /**
         * Gets the value of the orderID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderID() {
            return orderID;
        }

        /**
         * Sets the value of the orderID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderID(String value) {
            this.orderID = value;
        }

        /**
         * Gets the value of the orderLineID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderLineID() {
            return orderLineID;
        }

        /**
         * Sets the value of the orderLineID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderLineID(String value) {
            this.orderLineID = value;
        }

        /**
         * Gets the value of the checkType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCheckType() {
            return checkType;
        }

        /**
         * Sets the value of the checkType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheckType(String value) {
            this.checkType = value;
        }

        /**
         * Gets the value of the mergedStatus property.
         * 
         */
        public boolean isMergedStatus() {
            return mergedStatus;
        }

        /**
         * Sets the value of the mergedStatus property.
         * 
         */
        public void setMergedStatus(boolean value) {
            this.mergedStatus = value;
        }

    }

}
