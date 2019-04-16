//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.16 at 09:44:55 AM EDT 
//


package citrite;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *       &lt;sequence>
 *         &lt;element name="Registration_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Incentive_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reward_Submitted_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Registered_Total_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BackendApplicable_Flag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FrontendApplicable_Flag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Initial_Submitted_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "registrationID",
    "incentiveType",
    "rewardSubmittedDate",
    "registeredTotalAmount",
    "backendApplicableFlag",
    "frontendApplicableFlag",
    "initialSubmittedDate"
})
@XmlRootElement(name = "RewardRegistration", namespace = "urn:schemas-citrite-net:pip:sfdc:registration:1")
public class RewardRegistration {

    @XmlElement(name = "Registration_ID")
    protected String registrationID;
    @XmlElement(name = "Incentive_Type")
    protected String incentiveType;
    @XmlElement(name = "Reward_Submitted_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rewardSubmittedDate;
    @XmlElement(name = "Registered_Total_Amount")
    protected BigDecimal registeredTotalAmount;
    @XmlElementRef(name = "BackendApplicable_Flag", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> backendApplicableFlag;
    @XmlElementRef(name = "FrontendApplicable_Flag", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> frontendApplicableFlag;
    @XmlElement(name = "Initial_Submitted_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialSubmittedDate;

    /**
     * Gets the value of the registrationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationID() {
        return registrationID;
    }

    /**
     * Sets the value of the registrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationID(String value) {
        this.registrationID = value;
    }

    /**
     * Gets the value of the incentiveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncentiveType() {
        return incentiveType;
    }

    /**
     * Sets the value of the incentiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncentiveType(String value) {
        this.incentiveType = value;
    }

    /**
     * Gets the value of the rewardSubmittedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRewardSubmittedDate() {
        return rewardSubmittedDate;
    }

    /**
     * Sets the value of the rewardSubmittedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRewardSubmittedDate(XMLGregorianCalendar value) {
        this.rewardSubmittedDate = value;
    }

    /**
     * Gets the value of the registeredTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegisteredTotalAmount() {
        return registeredTotalAmount;
    }

    /**
     * Sets the value of the registeredTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegisteredTotalAmount(BigDecimal value) {
        this.registeredTotalAmount = value;
    }

    /**
     * Gets the value of the backendApplicableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBackendApplicableFlag() {
        return backendApplicableFlag;
    }

    /**
     * Sets the value of the backendApplicableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBackendApplicableFlag(JAXBElement<Boolean> value) {
        this.backendApplicableFlag = value;
    }

    /**
     * Gets the value of the frontendApplicableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFrontendApplicableFlag() {
        return frontendApplicableFlag;
    }

    /**
     * Sets the value of the frontendApplicableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFrontendApplicableFlag(JAXBElement<Boolean> value) {
        this.frontendApplicableFlag = value;
    }

    /**
     * Gets the value of the initialSubmittedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialSubmittedDate() {
        return initialSubmittedDate;
    }

    /**
     * Sets the value of the initialSubmittedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialSubmittedDate(XMLGregorianCalendar value) {
        this.initialSubmittedDate = value;
    }

}