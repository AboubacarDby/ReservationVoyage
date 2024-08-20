package fr.formation.reservationdevoyage.demo2;

public class Reservation {
	
	// Attributs privés pour garantir l'encapsulation
    
	private String date;          // Date de la réservation
    private String destination;   // Destination de la réservation
    private String clientName;    // Nom du client faisant la réservation

    // Constructeur de la classe
    public Reservation(String date, String destination, String clientName) {
        // Initialisation des attributs avec les valeurs fournies
        this.date = date;
        this.destination = destination;
        this.clientName = clientName;
    }

    // Getters pour accéder aux valeurs des attributs privés
    
    public String getDate() {
        return date;
    }

    public String getDestination() {
        return destination;
    }

    public String getClientName() {
        return clientName;
    }

    // Setters pour modifier les valeurs des attributs privés
    
    
    public void setDate(String date) {
        this.date = date;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    // Méthode pour effectuer une réservation
    public String makeReservation() {
        // Retourne une chaîne de caractères confirmant la réservation
        return "Réservation effectuée pour " + clientName +
               " à destination de " + destination +
               " le " + date + ".";
    }

    // Méthode pour annuler une réservation
    public String cancelReservation() {
        // Retourne une chaîne de caractères confirmant l'annulation de la réservation
        return "Réservation annulée pour " + clientName +
               " à destination de " + destination +
               " le " + date + ".";
    }

   
    public static void main(String[] args) {
        // Exemple d'utilisation de la classe Reservation
    	
        Reservation reservation = new Reservation("2023-12-01", "Paris", "Jean Dupont");
        
        
        System.out.println(reservation.makeReservation());
        
        
        reservation.setDestination("Londres"); // Modification de la destination
        
        System.out.println(reservation.makeReservation());
        
        
    }
    

}
