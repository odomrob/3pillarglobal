package prabhat;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
@HandlerChain(file="handler.xml")
public interface SOAPService {
	
	@WebMethod(operationName = "HeaderRequest", action = "headerValidation")
	@WebResult(name = "HeaderResponse")
	public String headerValidation(String id);
}
