package com.ave;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(serviceName = "servicio_saludar")
@SOAPBinding(style = Style.RPC)
public class Hello {

	@WebMethod(operationName = "bonjour")
	public String bonjour(String name) {
		return "Bonjour " + name;
	}
}