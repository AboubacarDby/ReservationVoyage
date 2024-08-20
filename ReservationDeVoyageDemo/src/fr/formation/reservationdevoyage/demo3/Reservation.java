package fr.formation.reservationdevoyage.demo3;

public class Reservation {
	
    private Client client; // Association avec Client
    private Hotel hotel;   // Association avec Hotel
    private String dates;  // Dates de réservation

    // Constructeur
    
    public Reservation(Client client, Hotel hotel, String dates) {
        this.client = client;
        this.hotel = hotel;
        this.dates = dates;
        client.ajouterReservation(this); 
    }
    
    
 // Ajoute cette réservation à la liste du client

    // Méthodes pour afficher les informations de réservation
    
    public String afficherInformations() {
        return "Réservation de " + client.afficherInformations() +
               " à l'hôtel " + hotel.name +
               " situé à " + hotel.location +
               " pour les dates suivantes : " + dates + ".";
    }
    
    
    

}
