
package org.datacontract.schemas._2004._07.dataobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.dataobjects package. 
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

    private final static QName _OrderStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "OrderStatus");
    private final static QName _CustomerType_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "CustomerType");
    private final static QName _OrderType_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "OrderType");
    private final static QName _OrderRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "OrderRow");
    private final static QName _ArrayOfOrderStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "ArrayOfOrderStatus");
    private final static QName _CompanyIdentity_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "CompanyIdentity");
    private final static QName _IndividualIdentity_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "IndividualIdentity");
    private final static QName _CustomerIdentity_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "CustomerIdentity");
    private final static QName _Address_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "Address");
    private final static QName _ArrayOfOrderRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "ArrayOfOrderRow");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.dataobjects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerIdentity }
     * 
     */
    public CustomerIdentity createCustomerIdentity() {
        return new CustomerIdentity();
    }

    /**
     * Create an instance of {@link ArrayOfOrderStatus }
     * 
     */
    public ArrayOfOrderStatus createArrayOfOrderStatus() {
        return new ArrayOfOrderStatus();
    }

    /**
     * Create an instance of {@link IndividualIdentity }
     * 
     */
    public IndividualIdentity createIndividualIdentity() {
        return new IndividualIdentity();
    }

    /**
     * Create an instance of {@link CompanyIdentity }
     * 
     */
    public CompanyIdentity createCompanyIdentity() {
        return new CompanyIdentity();
    }

    /**
     * Create an instance of {@link OrderRow }
     * 
     */
    public OrderRow createOrderRow() {
        return new OrderRow();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ArrayOfOrderRow }
     * 
     */
    public ArrayOfOrderRow createArrayOfOrderRow() {
        return new ArrayOfOrderRow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "OrderStatus")
    public JAXBElement<OrderStatus> createOrderStatus(OrderStatus value) {
        return new JAXBElement<OrderStatus>(_OrderStatus_QNAME, OrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "CustomerType")
    public JAXBElement<CustomerType> createCustomerType(CustomerType value) {
        return new JAXBElement<CustomerType>(_CustomerType_QNAME, CustomerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "OrderType")
    public JAXBElement<OrderType> createOrderType(OrderType value) {
        return new JAXBElement<OrderType>(_OrderType_QNAME, OrderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "OrderRow")
    public JAXBElement<OrderRow> createOrderRow(OrderRow value) {
        return new JAXBElement<OrderRow>(_OrderRow_QNAME, OrderRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "ArrayOfOrderStatus")
    public JAXBElement<ArrayOfOrderStatus> createArrayOfOrderStatus(ArrayOfOrderStatus value) {
        return new JAXBElement<ArrayOfOrderStatus>(_ArrayOfOrderStatus_QNAME, ArrayOfOrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "CompanyIdentity")
    public JAXBElement<CompanyIdentity> createCompanyIdentity(CompanyIdentity value) {
        return new JAXBElement<CompanyIdentity>(_CompanyIdentity_QNAME, CompanyIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "IndividualIdentity")
    public JAXBElement<IndividualIdentity> createIndividualIdentity(IndividualIdentity value) {
        return new JAXBElement<IndividualIdentity>(_IndividualIdentity_QNAME, IndividualIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "CustomerIdentity")
    public JAXBElement<CustomerIdentity> createCustomerIdentity(CustomerIdentity value) {
        return new JAXBElement<CustomerIdentity>(_CustomerIdentity_QNAME, CustomerIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "ArrayOfOrderRow")
    public JAXBElement<ArrayOfOrderRow> createArrayOfOrderRow(ArrayOfOrderRow value) {
        return new JAXBElement<ArrayOfOrderRow>(_ArrayOfOrderRow_QNAME, ArrayOfOrderRow.class, null, value);
    }

}
