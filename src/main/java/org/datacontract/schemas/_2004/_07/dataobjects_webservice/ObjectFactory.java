
package org.datacontract.schemas._2004._07.dataobjects_webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.dataobjects_webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreatePaymentPlanDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", "CreatePaymentPlanDetails");
    private final static QName _InvoiceDistributionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice.DeliverOrder", "InvoiceDistributionType");
    private final static QName _CreateOrderResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", "CreateOrderResult");
    private final static QName _CreateOrderInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", "CreateOrderInformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.dataobjects_webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateOrderResult }
     * 
     */
    public CreateOrderResult createCreateOrderResult() {
        return new CreateOrderResult();
    }

    /**
     * Create an instance of {@link CreateOrderInformation }
     * 
     */
    public CreateOrderInformation createCreateOrderInformation() {
        return new CreateOrderInformation();
    }

    /**
     * Create an instance of {@link CreatePaymentPlanDetails }
     * 
     */
    public CreatePaymentPlanDetails createCreatePaymentPlanDetails() {
        return new CreatePaymentPlanDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePaymentPlanDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", name = "CreatePaymentPlanDetails")
    public JAXBElement<CreatePaymentPlanDetails> createCreatePaymentPlanDetails(CreatePaymentPlanDetails value) {
        return new JAXBElement<CreatePaymentPlanDetails>(_CreatePaymentPlanDetails_QNAME, CreatePaymentPlanDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceDistributionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice.DeliverOrder", name = "InvoiceDistributionType")
    public JAXBElement<InvoiceDistributionType> createInvoiceDistributionType(InvoiceDistributionType value) {
        return new JAXBElement<InvoiceDistributionType>(_InvoiceDistributionType_QNAME, InvoiceDistributionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", name = "CreateOrderResult")
    public JAXBElement<CreateOrderResult> createCreateOrderResult(CreateOrderResult value) {
        return new JAXBElement<CreateOrderResult>(_CreateOrderResult_QNAME, CreateOrderResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", name = "CreateOrderInformation")
    public JAXBElement<CreateOrderInformation> createCreateOrderInformation(CreateOrderInformation value) {
        return new JAXBElement<CreateOrderInformation>(_CreateOrderInformation_QNAME, CreateOrderInformation.class, null, value);
    }

}
