package org.simple.main;

import org.simple.entity.Client;
import org.simple.service.ServiceImplementation;

public class Main {

	public static void main(String[] args) {
		
		ServiceImplementation proxiService = new ServiceImplementation();

		Client c1 = new Client();
		c1.setNomClient("Jerome");
		
		proxiService.ajouterClient(c1);
		

}
}