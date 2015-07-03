package prabhat;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(endpointInterface = "prabhat.SOAPService",
				portName="WSPort", serviceName = "SOAPService")
@HandlerChain(file="handler.xml")
public class SOAPServiceImpl implements SOAPService{

	@WebMethod(operationName = "HeaderRequest", action = "headerValidation")
	@WebResult(name = "HeaderResponse")
	public String headerValidation(String id){
		
		return id;
	}
}
