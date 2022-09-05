package com.basicapp;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicAppApplication.class, args);


		System.out.println("This is a Basic Spring boot Application");
	}



}
