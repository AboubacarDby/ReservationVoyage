package fr.formation.reservationdevoyage.demo1;

public class Reservation {
	
	// Attributs avec une visibilité 'public'
    
	public String date;          // Attribut pour stocker la date de la réservation
    public String destination;   // Attribut pour stocker la destination de la réservation
    public String clientName;    // Attribut pour stocker le nom du client

    // Constructeur de la classe 'Reservation'
    
    public Reservation(String date, String destination, String clientName) {
        this.date = date;
        this.destination = destination;
        this.clientName = clientName;
    }

    // Méthode publique 'makeReservation'
    
    public String makeReservation() {
        return "Réservation effectuée pour " + clientName +
               " à destination de " + destination +
               " le " + date + ".";
    }

    // Méthode publique 'cancelReservation'
    
    public String cancelReservation() {
        return "Réservation annulée pour " + clientName +
               " à destination de " + destination +
               " le " + date + ".";
    }

    public static void main(String[] args) {
        // Création d'une instance de la classe 'Reservation'
        Reservation reservation = new Reservation("2023-12-01", "Paris", "Jean Dupont");

        // Appel de la méthode 'makeReservation' sur l'objet 'reservation'
        System.out.println(reservation.makeReservation());

        // Appel de la méthode 'cancelReservation' sur l'objet 'reservation'
        System.out.println(reservation.cancelReservation());
    }

}
