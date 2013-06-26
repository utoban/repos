
package org.utopia.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.utopia.service package. 
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

    private final static QName _QueryUserInfo_QNAME = new QName("http://service.utopia.org/", "queryUserInfo");
    private final static QName _QueryUserInfoResponse_QNAME = new QName("http://service.utopia.org/", "queryUserInfoResponse");
    private final static QName _AddResponse_QNAME = new QName("http://service.utopia.org/", "addResponse");
    private final static QName _QueryUserListResponse_QNAME = new QName("http://service.utopia.org/", "queryUserListResponse");
    private final static QName _SayHello_QNAME = new QName("http://service.utopia.org/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://service.utopia.org/", "sayHelloResponse");
    private final static QName _Add_QNAME = new QName("http://service.utopia.org/", "add");
    private final static QName _QueryUserList_QNAME = new QName("http://service.utopia.org/", "queryUserList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.utopia.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryUserList }
     * 
     */
    public QueryUserList createQueryUserList() {
        return new QueryUserList();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link QueryUserInfo }
     * 
     */
    public QueryUserInfo createQueryUserInfo() {
        return new QueryUserInfo();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link QueryUserInfoResponse }
     * 
     */
    public QueryUserInfoResponse createQueryUserInfoResponse() {
        return new QueryUserInfoResponse();
    }

    /**
     * Create an instance of {@link QueryUserListResponse }
     * 
     */
    public QueryUserListResponse createQueryUserListResponse() {
        return new QueryUserListResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUserInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.utopia.org/", name = "queryUserInfo")
    public JAXBElement<QueryUserInfo> createQueryUserInfo(QueryUserInfo value) {
        return new JAXBElement<QueryUserInfo>(_QueryUserInfo_QNAME, QueryUserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUserInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.utopia.org/", name = "queryUserInfoResponse")
    public JAXBElement<QueryUserInfoResponse> createQueryUserInfoResponse(QueryUserInfoResponse value) {
        return new JAXBElement<QueryUserInfoResponse>(_QueryUserInfoResponse_QNAME, QueryUserInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.utopia.org/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUserListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.utopia.org/", name = "queryUserListResponse")
    public JAXBElement<QueryUserListResponse> createQueryUserListResponse(QueryUserListResponse value) {
        return new JAXBElement<QueryUserListResponse>(_QueryUserListResponse_QNAME, QueryUserListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.utopia.org/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.utopia.org/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.utopia.org/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUserList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.utopia.org/", name = "queryUserList")
    public JAXBElement<QueryUserList> createQueryUserList(QueryUserList value) {
        return new JAXBElement<QueryUserList>(_QueryUserList_QNAME, QueryUserList.class, null, value);
    }

}
