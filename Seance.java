package poo;

import java.util.Date;


/**
 * Seance implemente l'interface Comparable<Seance>.
 * 
 * @author 
 * @version 
 */
public abstract class Seance implements Comparable<Seance>{
	

	/**
	    * jour est de type entier
		*/
	int jour;
	
	/**
	    * horaire est de type Heure
		*/
	Heure horaire;
	
	/**
	    * nbPlacesVenduesTN est de type entier et est initialisé à 0.
		*/
	int nbPlacesVenduesTN =0;
	
	
	/**
	    * Constructeur Seance.
	    * @param jour est de type entier
	    * @param horaire est de type Heure
		*/
	public Seance(int jour, Heure horaire) {
		super();
		this.jour=jour;
		this.horaire=horaire;
	}
	
	/**
	    * methode abstraite nbPlacesDispo()
		*/
	public abstract int nbPlacesDispo();
	
	/**
	    * methode abstraite totalVendu()
		*/
	 public abstract int totalVendu();
	 
	 
	 /**
	    * methode abstraite tauxRemplissage()
		*/
	 public abstract double tauxRemplissage();
	 
	 
	 /**
	    * ajoute le nombre de places vendues au tarif normal à nbPlacesVenduesTN
	    * @param nbre est un entier
		*/
	 public void vendrePlacesTN(int nbre) {
		 this.nbPlacesVenduesTN=nbre;
	 }
	
	 
	 /**
	    * compare deux Seance 
	    * @param s est de type Seance
	    * @return retourne un entier
		*/
	 public int compareTo(Seance s) {
		 int res = this.jour - s.jour;
		 if (res == 0){
			 res = horaire.compareTo(s.horaire);
		 }
	      return res;
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
			Seance other = (Seance) obj;
			if (horaire == null) {
				if (other.horaire != null)
					return false;
			} else if (!horaire.equals(other.horaire))
				return false;
			if (jour != other.jour)
				return false;
			if (nbPlacesVenduesTN != other.nbPlacesVenduesTN)
				return false;
			return true;
		}

		
		/**
		    * méthode toString de SeanceCinema.
		    * @return on retourne une chaine de caractère
			*/
		@Override
		public String toString() {
			return "Seance [jour=" + jour + ", horaire=" + horaire + ", nbPlacesVenduesTN=" + nbPlacesVenduesTN + "]";
		}

}
