package poo;


public class SalleTheatre extends Salle{
	int nbPlaceBalcon;
	double prixPlaceBalcon;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalleTheatre other = (SalleTheatre) obj;
		if (nbFauteuils != other.nbFauteuils)
			return false;
		if (Double.doubleToLongBits(prixDuFauteuil) != Double.doubleToLongBits(other.prixDuFauteuil))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SalleTheatre [nbFauteuils=" + nbFauteuils + ", prixDuFauteuil=" + prixDuFauteuil + "]";
	}

	int nbFauteuils;
	double prixDuFauteuil;
	
	public SalleTheatre(String nomSalle, int capacite, double tarif, int nbPlaceBalcon, double prixPlaceBalcon) {
		super(nomSalle, capacite, tarif);
		this.nbPlaceBalcon = nbPlaceBalcon;
		this.prixPlaceBalcon = prixPlaceBalcon;
	}
}