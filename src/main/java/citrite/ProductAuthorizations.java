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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="AuthorizationItem" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Product_Line_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Cert_Start_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="Cert_End_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="Cert_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
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
    "authorizationItem"
})
@XmlRootElement(name = "ProductAuthorizations", namespace = "urn:schemas-citrite-net:pip:salesforce:product-authorization:1")
public class ProductAuthorizations {

    @XmlElement(name = "AuthorizationItem")
    protected List<ProductAuthorizations.AuthorizationItem> authorizationItem;

    /**
     * Gets the value of the authorizationItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductAuthorizations.AuthorizationItem }
     * 
     * 
     */
    public List<ProductAuthorizations.AuthorizationItem> getAuthorizationItem() {
        if (authorizationItem == null) {
            authorizationItem = new ArrayList<ProductAuthorizations.AuthorizationItem>();
        }
        return this.authorizationItem;
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
     *         &lt;element name="Product_Line_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Cert_Start_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="Cert_End_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="Cert_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "productLineID",
        "certStartDate",
        "certEndDate",
        "certStatus"
    })
    public static class AuthorizationItem {

        @XmlElement(name = "Product_Line_ID")
        protected String productLineID;
        @XmlElement(name = "Cert_Start_Date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar certStartDate;
        @XmlElement(name = "Cert_End_Date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar certEndDate;
        @XmlElement(name = "Cert_Status")
        protected String certStatus;

        /**
         * Gets the value of the productLineID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductLineID() {
            return productLineID;
        }

        /**
         * Sets the value of the productLineID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductLineID(String value) {
            this.productLineID = value;
        }

        /**
         * Gets the value of the certStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCertStartDate() {
            return certStartDate;
        }

        /**
         * Sets the value of the certStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCertStartDate(XMLGregorianCalendar value) {
            this.certStartDate = value;
        }

        /**
         * Gets the value of the certEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCertEndDate() {
            return certEndDate;
        }

        /**
         * Sets the value of the certEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCertEndDate(XMLGregorianCalendar value) {
            this.certEndDate = value;
        }

        /**
         * Gets the value of the certStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCertStatus() {
            return certStatus;
        }

        /**
         * Sets the value of the certStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCertStatus(String value) {
            this.certStatus = value;
        }

    }

}