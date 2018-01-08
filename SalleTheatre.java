package poo;


/**
 * Classe SalleTheatre qui hérite de la classe Salle.
 * 
 * @author 
 * @version 
 */
public class SalleTheatre extends Salle{
	
	/**
	    * nbPlaceBalcon est un entier
		*/
	int nbPlaceBalcon;
	
	/**
	    * prixPlaceBalcon est de type double
		*/
	double prixPlaceBalcon;
	
	/**
	    * nbFauteuils est un entier
		*/
	int nbFauteuils;
	
	/**
	    * prixDuFauteuil est de type double
		*/
	double prixDuFauteuil;
	
	
	/**
	    * Constructeur SalleTheatre.
	    * @param nomSalle est de type chaine de caracteres
	    * @param capacite est de type entier
	    * @param tarif est de type double
	    * @param nbPlaceBalcon est de type entier
	    * @param prixPlaceBalcon est de type double
		*/	
	public SalleTheatre(String nomSalle, int capacite, double tarif, int nbPlaceBalcon, double prixPlaceBalcon) {
		super(nomSalle, capacite, tarif);
		this.nbPlaceBalcon = nbPlaceBalcon;
		this.prixPlaceBalcon = prixPlaceBalcon;
	}
	
	
	/**
	* indique si l'objet passé en parametre est égal à celui ci
	*/
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

	
	/**
	    * méthode toString de SalleTheatre.
	    * @return on retourne une chaine de caractères
		*/
	@Override
	public String toString() {
		return "SalleTheatre [nbFauteuils=" + nbFauteuils + ", prixDuFauteuil=" + prixDuFauteuil + "]";
	}
}