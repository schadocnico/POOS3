package projet;

/**
 * SeanceTheatre hérite de la classe Seance.
 * 
 * @author 
 * @version 
 */
public class SeanceTheatre extends Seance{
	
	
	/**
	    * salleTheatre est de type SalleTheatre
		*/
	SalleTheatre salleTheatre;
	
	/**
	    * nbFauteilsVendus est de type entier et est initialisé à 0
		*/
	int nbFauteuilsVendus=0;
	
	
	
	/**
	    * Constructeur SeanceTheatre.
	    * @param jour est de type entier
	    * @param horaire est de type Heure
	    * @param salleTheatre est de type SalleTheatre
		*/	
	public SeanceTheatre(int jour, Heure horaire,SalleTheatre salleTheatre) {
		super(jour, horaire);
		this.salleTheatre=salleTheatre;
	}

	/**
	    * indique le nombre de places disponibles
	    * @return on retourne un entier
		*/	
	public int nbPlacesDispo(){
		return salleTheatre.nbFauteuils - nbFauteuilsVendus;
	}
	
	/**
	    * indique le nombre de place vendues au total.
	    * @return on retourne un entier.
		*/	
	public int totalVendu(){
		return nbFauteuilsVendus;
	}
	
	/**
	    * indique le taux de remplissage en pourcentage.
	    * @return on retourne un double.
		*/
	public double tauxRemplissage(){
		return (nbPlacesDispo()/(nbPlacesDispo()+totalVendu()))*100;
		
	}
	
	/**
	    * indique le nombre de fauteuils disponibles.
	    * @return on retourne un entier.
		*/
	public int nbFauteuilsDispo(){
		return nbPlacesDispo();
	}
	
	
	/**
	    * indique le nombre de places(fauteuil) vendues.
	    * @param nbre est un entier
		*/
	public void vendrePlacesFauteuil(int nbre){
		nbFauteuilsVendus += nbre;
	}
	
		/**
	    * méthode toString de SeanceTheatre.
	    * @return on retourne une chaine de caractère
		*/
	@Override
	public String toString() {
		return "SeanceTheatre [salleTheatre=" + salleTheatre + ", nbFauteuilsVendus=" + nbFauteuilsVendus + "]";
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
		SeanceTheatre other = (SeanceTheatre) obj;
		if (nbFauteuilsVendus != other.nbFauteuilsVendus)
			return false;
		if (salleTheatre == null) {
			if (other.salleTheatre != null)
				return false;
		} else if (!salleTheatre.equals(other.salleTheatre))
			return false;
		return true;
	}
	
}

	