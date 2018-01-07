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

	@Override
	public String toString() {
		return "Salle [nomSalle=" + nomSalle + ", capacite=" + capacite + ", tarif=" + tarif + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salle other = (Salle) obj;
		if (capacite != other.capacite)
			return false;
		if (nomSalle == null) {
			if (other.nomSalle != null)
				return false;
		} else if (!nomSalle.equals(other.nomSalle))
			return false;
		if (Double.doubleToLongBits(tarif) != Double.doubleToLongBits(other.tarif))
			return false;
		return true;
	}
	
}
