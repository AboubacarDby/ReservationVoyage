package fr.formation.reservationdevoyage.demo5.versionfinale;

import java.util.ArrayList;
import java.util.List;

public class Chambre {
	private int numero;
    private String type;
    private List<Service> services; // Composition avec Service

    public Chambre(int numero, String type) {
        this.numero = numero;
        this.type = type;
        this.services = new ArrayList<>(); //ajouter cette ligne
    }
    
    // Méthodes pour gérer les services
    public void ajouterService(Service service) {
        services.add(service);
    }

    // Getters pour les services
    public List<Service> getServices() {
        return services;
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
    

}
