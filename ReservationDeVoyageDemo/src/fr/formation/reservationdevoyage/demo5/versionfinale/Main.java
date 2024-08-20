package fr.formation.reservationdevoyage.demo5.versionfinale;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Service> services = new ArrayList<>(); // Liste pour stocker différents types de services

        // Ajout de services variés, y compris le service premium
        services.add(new Service("WiFi", 5.0));
        services.add(new ServiceDeChambre("Nettoyage", 20.0, "Nettoyage quotidien"));
        services.add(new ServicePremium("Suite Royale", 200.0, "Accès au salon VIP, Service de limousine"));

        for (Service service : services) {
        	System.out.println("#########");
            service.afficherDetails(); // Polymorphisme: la méthode adaptée est appelée
        }
       
    }

}
