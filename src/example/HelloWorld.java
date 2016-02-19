package example;
import business.Service;
import model.Product;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by USER on 28.01.2016.
 */
@WebService(name = "TestName", portName = "TestPortName", serviceName = "TestServiceName")
public class HelloWorld {
  Service service = new Service();

  @WebMethod(exclude = true)
  @WebResult(partName = "newResult")
  public String sayHelloWorldFrom(@WebParam(partName = "from") String from) {
    return service.sayHelloWorldFrom(from);
  }

  public List<String> getCatalog() {
    return service.getCatalog();
  }

  @WebMethod
  public List<String> getProductList(String category) {
    return service.getProductList(category);
  }

  @WebMethod
  @WebResult(name = "newResult")
  public List<Product> getProductList2(String category) {
    return service.getProductList2(category);
  }

  @WebMethod
  public boolean addProduct(String category, String product) {
    return service.addProduct(category, product);
  }

  public static void main(String[] argv) {
    Object implementor = new HelloWorld ();
    String address = "http://localhost:9000/HelloWorld";
    Endpoint.publish(address, implementor);


  }


}
