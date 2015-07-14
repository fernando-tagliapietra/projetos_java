
package bean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bean package. 
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

    private final static QName _ListarTurmas_QNAME = new QName("http://bean/", "listarTurmas");
    private final static QName _ListarTurmasResponse_QNAME = new QName("http://bean/", "listarTurmasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarTurmasResponse }
     * 
     */
    public ListarTurmasResponse createListarTurmasResponse() {
        return new ListarTurmasResponse();
    }

    /**
     * Create an instance of {@link ListarTurmas }
     * 
     */
    public ListarTurmas createListarTurmas() {
        return new ListarTurmas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTurmas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean/", name = "listarTurmas")
    public JAXBElement<ListarTurmas> createListarTurmas(ListarTurmas value) {
        return new JAXBElement<ListarTurmas>(_ListarTurmas_QNAME, ListarTurmas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTurmasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean/", name = "listarTurmasResponse")
    public JAXBElement<ListarTurmasResponse> createListarTurmasResponse(ListarTurmasResponse value) {
        return new JAXBElement<ListarTurmasResponse>(_ListarTurmasResponse_QNAME, ListarTurmasResponse.class, null, value);
    }

}
