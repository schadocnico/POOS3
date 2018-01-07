package projet;

public class Salle {

	private String nomSalle;
	private int capacite;
	private double tarif;
	
	public Salle(String nomSalle, int capacite, double tarif) {
		this.nomSalle=nomSalle;
		this.capacite=capacite;
		this.tarif=tarif;
	}

	public String getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}
	
}
