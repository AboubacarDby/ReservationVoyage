package fr.formation.reservationdevoyage.demo5.versionfinale;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
	
    private Client client; 
    private Hotel hotel;  
    private String dates; 
    private List<Service> servicesReserves; // Association avec Service

    // Constructeur
    public Reservation(Client client, Hotel hotel, String dates) {
        this.client = client;
        this.hotel = hotel;
        this.dates = dates;
        this.servicesReserves = new ArrayList<>();
        client.ajouterReservation(this); 
    }
    
    //Méthode pour ajouter un service
    public void ajouterService(Service service) {
        servicesReserves.add(service);
    }
    
   
    // ATTENTION, MODIFIER LA Méthode pour afficher 
    //les services réservés.
    public String afficherInformations() {
        String info = "Réservation de " + client.afficherInformations() +
                      " à l'hôtel " + hotel.name +
                      " situé à " + hotel.location +
                      " pour les dates suivantes : " + dates;

        // Ajout des informations sur les services réservés
        if (!servicesReserves.isEmpty()) {
            info += "\nServices réservés: ";
            for (Service service : servicesReserves) {
                info += service.getNom() + " (Prix: " + service.getPrix() + "€), ";
            }
            // Supprimer la dernière virgule et espace
            info = info.substring(0, info.length() - 2);
        } else {
            info += "\nAucun service supplémentaire réservé.";
        }

        return info;
    }
    
    
    

}
