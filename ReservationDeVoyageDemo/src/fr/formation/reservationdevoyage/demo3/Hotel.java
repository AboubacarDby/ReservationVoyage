package fr.formation.reservationdevoyage.demo3;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	
	// Attributs de la classe Hotel
    
	public String name;         	// Nom de l'hôtel
    public String location;     	// Localisation de l'hôtel
    public int rating;          	// Classement de l'hôtel
    private List<Chambre> chambres; // Composition

    // Constructeur de la classe Hotel
    
    public Hotel(String name, String location, int rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.chambres = new ArrayList<>(); //Ajout de l'ArrayList
    }
    
    
  
    
	public void ajouterChambre(Chambre chambre) {
        chambres.add(chambre);
    }

    // Méthode pour initialiser des chambres lors de la création de l'hôtel
	//Cette methode montre bien que les chambres dépendes de l'objet hotel
    public void initialiserChambres(int nombreChambres) {
        for (int i = 1; i <= nombreChambres; i++) {
            this.chambres.add(new Chambre(i, "Standard"));
        }
    }
    
    //Getters et Setters
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public List<Chambre> getChambres() {
		return chambres;
	}

	//ajouter les Getters et les Setters pour la chambre
	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}

	
	
    

}
