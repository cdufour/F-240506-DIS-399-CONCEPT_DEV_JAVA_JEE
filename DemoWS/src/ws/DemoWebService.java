package ws;

import java.util.Random;
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
	
	@WebMethod(operationName="randint")
	public int getRandInt(
			@WebParam(name="min")int min, 
			@WebParam(name="max")int max) 
	{
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	
	}
	
	@WebMethod(operationName="randstr")
	public String getAlphaNumericString(
			@WebParam(name="len")int n) { 
	 
	  // choose a Character random from this String 
	  String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	         + "0123456789"
			 + "/-?_"
	         + "abcdefghijklmnopqrstuvxyz"; 
	 
	  // create StringBuffer size of AlphaNumericString 
	  StringBuilder sb = new StringBuilder(n); 
	 
	  for (int i = 0; i < n; i++) { 
	 
	   // generate a random number between 
	   // 0 to AlphaNumericString variable length 
	   int index = (int)(AlphaNumericString.length() * Math.random()); 
	 
	   // add Character one by one in end of sb 
	   sb.append(AlphaNumericString 
	      .charAt(index)); 
	  } 
	 
	  return sb.toString(); 
	 } 
	
}
