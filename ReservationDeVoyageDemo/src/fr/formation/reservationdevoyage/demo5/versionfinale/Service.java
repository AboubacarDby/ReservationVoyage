package fr.formation.reservationdevoyage.demo5.versionfinale;

public class Service {
	private String nom;
    private double prix;

    public Service(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }
    
    // Affiche les détails du service
    public void afficherDetails() {
        System.out.println("Service: " + nom + ", Prix: " + prix + "€");
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	@Override
    public String toString() {
        return nom + " (Prix: " + prix + ")";
    }


}
