package fr.formation.reservationdevoyage.demo3;

public class Main {

	public static void main(String[] args) {
		// Création d'un client
        Client client = new Client("Dupont", "Jean", "jean.dupont@example.com", "0123456789");

        // Création d'un hôtel
        Hotel hotel = new Hotel("Etoile du Matin", "Paris", 5);

        // Composition : Initialisation des chambres pour l'hôtel
        hotel.initialiserChambres(10); // par exemple, crée 10 chambres

        // Affichage des chambres - démontre la composition 
        //utilisation de la boucle foreach
        System.out.println("Composition: Chambres de l'hôtel " + hotel.getName());
        for (Chambre chambre : hotel.getChambres()) {
            System.out.println("Chambre " + chambre.getNumero() + ", Type: " + chambre.getType());
        }

        // Agrégation : Création d'une réservation pour le client
        Reservation reservation = new Reservation(client, hotel, "2023-08-15 au 2023-08-20");
        client.ajouterReservation(reservation);

        // Affichage des réservations du client - démontre l'agrégation
        System.out.println("\nAgrégation: Réservations du client " + client.getNom());
        System.out.println(reservation.afficherInformations());

        // Démonstration de la différence entre Composition et Agrégation
        // En supprimant l'hôtel, les chambres devraient également être supprimées (composition)
        // En supprimant le client, les réservations peuvent toujours exister (agrégation)

        // Suppression de l'hôtel
        hotel = null;

        // Suppression du client
        client = null;

        // Erreur car Les chambres n'existent plus car elles sont composantes de l'hôtel
        /*
        System.out.println("Composition: Chambres de l'hôtel " + hotel.getName());
        for (Chambre chambre : hotel.getChambres()) {
            System.out.println("Chambre " + chambre.getNumero() + ", Type: " + chambre.getType());
        }
        */
        
        // Les réservations peuvent toujours exister indépendamment du client
        //System.out.println(reservation.afficherInformations());
    }

}
