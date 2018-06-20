
package net.tecgurus.sistemabancario.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.tecgurus.sistemabancario.ws.client package. 
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

    private final static QName _LoginResponse_QNAME = new QName("http://webservices.sistemabancario_ws.tecgurus.net/", "loginResponse");
    private final static QName _GetBancosByExample_QNAME = new QName("http://webservices.sistemabancario_ws.tecgurus.net/", "getBancosByExample");
    private final static QName _GetUsuariosByExample_QNAME = new QName("http://webservices.sistemabancario_ws.tecgurus.net/", "getUsuariosByExample");
    private final static QName _GetBancosByExampleResponse_QNAME = new QName("http://webservices.sistemabancario_ws.tecgurus.net/", "getBancosByExampleResponse");
    private final static QName _GetUsuariosByExampleResponse_QNAME = new QName("http://webservices.sistemabancario_ws.tecgurus.net/", "getUsuariosByExampleResponse");
    private final static QName _Login_QNAME = new QName("http://webservices.sistemabancario_ws.tecgurus.net/", "login");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.tecgurus.sistemabancario.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetBancosByExample }
     * 
     */
    public GetBancosByExample createGetBancosByExample() {
        return new GetBancosByExample();
    }

    /**
     * Create an instance of {@link GetUsuariosByExample }
     * 
     */
    public GetUsuariosByExample createGetUsuariosByExample() {
        return new GetUsuariosByExample();
    }

    /**
     * Create an instance of {@link GetBancosByExampleResponse }
     * 
     */
    public GetBancosByExampleResponse createGetBancosByExampleResponse() {
        return new GetBancosByExampleResponse();
    }

    /**
     * Create an instance of {@link GetUsuariosByExampleResponse }
     * 
     */
    public GetUsuariosByExampleResponse createGetUsuariosByExampleResponse() {
        return new GetUsuariosByExampleResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Banco }
     * 
     */
    public Banco createBanco() {
        return new Banco();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.sistemabancario_ws.tecgurus.net/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBancosByExample }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.sistemabancario_ws.tecgurus.net/", name = "getBancosByExample")
    public JAXBElement<GetBancosByExample> createGetBancosByExample(GetBancosByExample value) {
        return new JAXBElement<GetBancosByExample>(_GetBancosByExample_QNAME, GetBancosByExample.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosByExample }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.sistemabancario_ws.tecgurus.net/", name = "getUsuariosByExample")
    public JAXBElement<GetUsuariosByExample> createGetUsuariosByExample(GetUsuariosByExample value) {
        return new JAXBElement<GetUsuariosByExample>(_GetUsuariosByExample_QNAME, GetUsuariosByExample.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBancosByExampleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.sistemabancario_ws.tecgurus.net/", name = "getBancosByExampleResponse")
    public JAXBElement<GetBancosByExampleResponse> createGetBancosByExampleResponse(GetBancosByExampleResponse value) {
        return new JAXBElement<GetBancosByExampleResponse>(_GetBancosByExampleResponse_QNAME, GetBancosByExampleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosByExampleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.sistemabancario_ws.tecgurus.net/", name = "getUsuariosByExampleResponse")
    public JAXBElement<GetUsuariosByExampleResponse> createGetUsuariosByExampleResponse(GetUsuariosByExampleResponse value) {
        return new JAXBElement<GetUsuariosByExampleResponse>(_GetUsuariosByExampleResponse_QNAME, GetUsuariosByExampleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.sistemabancario_ws.tecgurus.net/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

}
