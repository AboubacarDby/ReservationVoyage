package fr.formation.reservationdevoyage.demo3;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	// Attributs privés de la classe Client
    
	private String nom;         			// Nom du client
    private String prenom;      			// Prénom du client
    private String email;       			// Adresse e-mail du client
    private String telephone;   			// Numéro de téléphone du client
    private List<Reservation> reservations; // Agrégation

    // Constructeur de la classe Client
    public Client(String nom, String prenom, String email, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.reservations = new ArrayList<>(); //ajout de la reservation
    }

    // Getters pour accéder aux attributs privés
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    // Setters pour modifier les attributs privés
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    //Metode pour ajouter une réservation
    public void ajouterReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    // Méthode pour afficher les informations du client
    public String afficherInformations() {
        return "Client: " + nom + " " + prenom + "\n" +
               "Email: " + email + "\n" +
               "Téléphone: " + telephone;
    }


}
