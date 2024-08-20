package fr.formation.reservationdevoyage.demo5.versionfinale;

public class ServiceDeChambre extends Service {
	private String description;
    public ServiceDeChambre(String nom, double prix, String description) {
        super(nom, prix);
        this.description = description;
    }

    //Cette méthode est récrite depuis Service grâce à l'héritage
    
    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Description: " + description);
    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
}
