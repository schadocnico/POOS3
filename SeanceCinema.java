package poo;


/**
 * SeanceCinema hérite de la classe Seance.
 * 
 * @author 
 * @version 
 */
public class SeanceCinema extends Seance{

	
	/**
	    * salle est de type Salle
		*/
	Salle salle;
	
	/**
	    * nbPlacesVenduesTR est de type entier et est initialisé à 0
		*/
	int nbPlacesVenduesTR=0;
	
	
	/**
	    * Constructeur SeanceCinema.
	    * @param jour est de type entier
	    * @param horaire est de type Heure
	    * @param salle est de type Salle
		*/	
	public SeanceCinema(int jour, Heure horaire,Salle salle) {
		super(jour,horaire);
		this.salle=salle;
	}
	
	
	/**
	    * indique le nombre de places disponibles
	    * @return on retourne un entier
		*/
	@Override
	public int nbPlacesDispo() {
		return salle.getCapacite() - nbPlacesVenduesTR;
	}

	
	/**
	    * indique le nombre de place vendues au total.
	    * @return on retourne un entier.
		*/	
	@Override
	public int totalVendu() {
		return nbPlacesVenduesTR + super.nbPlacesVenduesTN;
	}

	
	/**
	    * indique le taux de remplissage en pourcentage.
	    * @return on retourne un double.
		*/
	@Override
	public double tauxRemplissage() {
		return (nbPlacesDispo()/(nbPlacesDispo()+totalVendu()))*100;
	}
	
	
	/**
	    * indique le nombre de places(tarif reduit) vendues.
	    * @param nbre est un entier
		*/
	public void vendrePlacesTR(int nbre) {
		
		this.nbPlacesVenduesTR+=nbre;
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
		SeanceCinema other = (SeanceCinema) obj;
		if (nbPlacesVenduesTR != other.nbPlacesVenduesTR)
			return false;
		if (salle == null) {
			if (other.salle != null)
				return false;
		} else if (!salle.equals(other.salle))
			return false;
		return true;
	}
	
	
	/**
	    * méthode toString de SeanceCinema.
	    * @return on retourne une chaine de caractère
		*/
	@Override
	public String toString() {
		return "SeanceCinema [salle=" + salle + ", nbPlacesVenduesTR=" + nbPlacesVenduesTR + "]";
	}

}