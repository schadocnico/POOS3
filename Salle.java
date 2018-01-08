package poo;


/**
 * Classe Salle.
 * 
 * @author 
 * @version 
 */
public class Salle {

	
	/**
	    * nomSalle est une chaine de caractères
		*/
	private String nomSalle;
	
	/**
	    * capacite est un entier
		*/
	private int capacite;
	
	/**
	    * tarif est de type double
		*/
	private double tarif;
	
	
	/**
	    * Constructeur Salle.
	    * @param nomSalle est de type chaine de caracteres
	    * @param capacite est de type entier
	    * @param tarif est de type double
		*/
	public Salle(String nomSalle, int capacite, double tarif) {
		this.nomSalle=nomSalle;
		this.capacite=capacite;
		this.tarif=tarif;
	}

	
	/**
	    * getter de nomSalle.
	    * @return on retourne une chaine de caracteres
		*/
	public String getNomSalle() {
		return nomSalle;
	}

	/**
	    * setter de nomSalle.
	    * @param nomSalle est une chaine de caractères
		*/
	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}

	/**
	    * getter de capacite.
	    * @return on retourne un entier
		*/
	public int getCapacite() {
		return capacite;
	}

	
	/**
	    * setter de capacite.
	    * @param capacite est un entier
		*/
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	
	/**
	    * getter de tarif.
	    * @return on retourne un double
		*/
	public double getTarif() {
		return tarif;
	}

	
	/**
	    * setter de tarif.
	    * @param tarif est un double
		*/
	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	/**
	    * méthode toString de Salle.
	    * @return on retourne une chaine de caractères
		*/
	@Override
	public String toString() {
		return "Salle [nomSalle=" + nomSalle + ", capacite=" + capacite + ", tarif=" + tarif + "]";
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
