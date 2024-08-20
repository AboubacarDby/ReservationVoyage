package fr.formation.reservationdevoyage.demo3;

public class Chambre {
	private int numero;
    private String type;

    public Chambre(int numero, String type) {
        this.numero = numero;
        this.type = type;
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
    

}
