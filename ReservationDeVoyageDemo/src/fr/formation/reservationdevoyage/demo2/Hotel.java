package fr.formation.reservationdevoyage.demo2;

public class Hotel {
	
	// Attributs de la classe Hotel
    public String name;         // Nom de l'hôtel
    public String location;     // Localisation de l'hôtel
    public int rating;          // Classement de l'hôtel

    // Constructeur de la classe Hotel
    public Hotel(String name, String location, int rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    // Méthode pour réserver une chambre
    public String bookRoom(String clientName, String dates) {
        return "Chambre réservée pour " + clientName + " à l'hôtel " + name +
               " situé à " + location + " pour les dates suivantes : " + dates + ".";
    }

    // Méthode pour annuler une réservation
    public String cancelBooking(String clientName) {
        return "Réservation annulée pour " + clientName + " à l'hôtel " + name + ".";
    }

    // A NE PAS FAIRE DANS L'exercice
    // Exemple d'utilisation de la classe Hotel
    /*
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Etoile du Matin", "Paris", 5);
        System.out.println(hotel.bookRoom("Jean Dupont", "2023-08-15 au 2023-08-20"));
        System.out.println(hotel.cancelBooking("Jean Dupont"));
    }
    */

}
