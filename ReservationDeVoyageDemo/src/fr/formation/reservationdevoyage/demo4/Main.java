package fr.formation.reservationdevoyage.demo4;



public class Main {

	public static void main(String[] args) {

        Client client = new Client("Dupont", "Jean", "jean.dupont@example.com", "0123456789");
        Hotel hotel = new Hotel("Etoile du Matin", "Paris", 5);
        hotel.initialiserChambres(10); 
        
        // Création de services
        Service wifi = new Service("WiFi", 5.0);
        Service petitDejeuner = new Service("Petit-déjeuner", 12.0);
        Service boissonsAVolontees = new Service("Boissons à volontées", 150.0);

        
        System.out.println("###########################################");   
        // Création d'une réservation avec des services
        Reservation reservation = new Reservation(client, hotel, "2023-08-15 au 2023-08-20");
        reservation.ajouterService(wifi);
        reservation.ajouterService(petitDejeuner);
        reservation.ajouterService(boissonsAVolontees);

        // Affichage des réservations du client - démontre l'agrégation
        System.out.println("\nAgrégation: Réservations du client " + client.getNom());
        System.out.println(reservation.afficherInformations());
        
        System.out.println("###########################################");
        System.out.println();
        //Polymorphysme
        // Création d'une instance de ServiceDeChambre, mais avec une référence de type Service
        
        Service serviceChambre = new ServiceDeChambre("Nettoyage", 20.0, "Nettoyage quotidien de la chambre");

        // Appel polymorphique de la méthode
        serviceChambre.afficherDetails();
       
    }

}
