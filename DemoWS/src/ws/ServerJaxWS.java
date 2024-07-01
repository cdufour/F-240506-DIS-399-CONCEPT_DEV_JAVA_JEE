package ws;

import javax.xml.ws.Endpoint;

public class ServerJaxWS {

	public static void main(String[] args) {
		String url = "http://localhost:8686/";
		Endpoint.publish(url, new DemoWebService());
		System.out.println("Server running on " + url + "...");
	}

}
