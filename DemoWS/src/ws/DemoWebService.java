package ws;

import javax.jws.WebService;

@WebService(serviceName="demo")
public class DemoWebService {

	public String Test() {
		return "Test";
	}
	
}
