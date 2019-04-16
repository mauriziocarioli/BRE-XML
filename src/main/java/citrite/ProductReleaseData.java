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
 *         &lt;element name="ProductReleaseRecord" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProductLineID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ProductReleaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ProductReleaseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SuiteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SuiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="InstallationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RevenueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "productReleaseRecord"
})
@XmlRootElement(name = "ProductReleaseData", namespace = "urn:schemas-citrite-net:pip:bre:productrelease:1")
public class ProductReleaseData {

    @XmlElement(name = "ProductReleaseRecord")
    protected List<ProductReleaseData.ProductReleaseRecord> productReleaseRecord;

    /**
     * Gets the value of the productReleaseRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productReleaseRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductReleaseRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductReleaseData.ProductReleaseRecord }
     * 
     * 
     */
    public List<ProductReleaseData.ProductReleaseRecord> getProductReleaseRecord() {
        if (productReleaseRecord == null) {
            productReleaseRecord = new ArrayList<ProductReleaseData.ProductReleaseRecord>();
        }
        return this.productReleaseRecord;
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
     *         &lt;element name="ProductLineID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ProductReleaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ProductReleaseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SuiteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SuiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="InstallationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RevenueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "productLineID",
        "productReleaseName",
        "productReleaseID",
        "suiteID",
        "suiteName",
        "installationType",
        "revenueType"
    })
    public static class ProductReleaseRecord {

        @XmlElement(name = "ProductLineID")
        protected String productLineID;
        @XmlElement(name = "ProductReleaseName")
        protected String productReleaseName;
        @XmlElement(name = "ProductReleaseID")
        protected String productReleaseID;
        @XmlElement(name = "SuiteID")
        protected String suiteID;
        @XmlElement(name = "SuiteName")
        protected String suiteName;
        @XmlElement(name = "InstallationType")
        protected String installationType;
        @XmlElement(name = "RevenueType")
        protected String revenueType;
        @XmlAttribute(name = "SKU_Marketing")
        protected String skuMarketing;

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
         * Gets the value of the productReleaseName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductReleaseName() {
            return productReleaseName;
        }

        /**
         * Sets the value of the productReleaseName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductReleaseName(String value) {
            this.productReleaseName = value;
        }

        /**
         * Gets the value of the productReleaseID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductReleaseID() {
            return productReleaseID;
        }

        /**
         * Sets the value of the productReleaseID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductReleaseID(String value) {
            this.productReleaseID = value;
        }

        /**
         * Gets the value of the suiteID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuiteID() {
            return suiteID;
        }

        /**
         * Sets the value of the suiteID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuiteID(String value) {
            this.suiteID = value;
        }

        /**
         * Gets the value of the suiteName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuiteName() {
            return suiteName;
        }

        /**
         * Sets the value of the suiteName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuiteName(String value) {
            this.suiteName = value;
        }

        /**
         * Gets the value of the installationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstallationType() {
            return installationType;
        }

        /**
         * Sets the value of the installationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstallationType(String value) {
            this.installationType = value;
        }

        /**
         * Gets the value of the revenueType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRevenueType() {
            return revenueType;
        }

        /**
         * Sets the value of the revenueType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRevenueType(String value) {
            this.revenueType = value;
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
