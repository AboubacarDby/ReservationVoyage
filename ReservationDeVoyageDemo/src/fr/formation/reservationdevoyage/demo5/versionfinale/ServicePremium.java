package fr.formation.reservationdevoyage.demo5.versionfinale;

public class ServicePremium extends Service {
	
	private String avantages; // Attribut supplémentaire pour les avantages exclusifs

    public ServicePremium(String nom, double prix, String avantages) {
        super(nom, prix); // Appel au constructeur de la super-classe Service
        this.avantages = avantages;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails(); // Appel de la méthode de la super-classe
        System.out.println("Avantages: " + avantages); // Affichage des avantages spécifiques
    }

	public String getAvantages() {
		return avantages;
	}

	public void setAvantages(String avantages) {
		this.avantages = avantages;
	}
      
}
