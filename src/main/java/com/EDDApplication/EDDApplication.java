package com.EDDApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*Bootstrap SpringBootApplication 
 * it creates the Servelet container in Tomcat Server
 * and deploys the application in it and runs it */
@SpringBootApplication
public class EDDApplication {

	public static void main(String[] args) {
		SpringApplication.run(EDDApplication.class, args);

	}

}
