package com.ave;

import javax.xml.ws.Endpoint;

import com.ave.services.EmpleadoService;

public class Exporter {

	public static void main(String[] args) {

		try {
			
			Endpoint.publish("http://localhost:8080/app-web-soap/ws/demo", new EmpleadoService());
			System.out.println("Hecho");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
}
