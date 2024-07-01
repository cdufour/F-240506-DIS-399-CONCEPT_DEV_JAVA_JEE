package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName="demo")
public class DemoWebService {

	@WebMethod(operationName="test")
	public String Test() {
		return "Test";
	}
	
	@WebMethod(operationName="convert")
	public double convertInFr(@WebParam(name="amt")double amount) {
		return amount * 6.5;
	}
	
}
