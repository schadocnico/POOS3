package poo;


/**
 * Classe Heure qui implemente l'interface Comparable<Heure>
 * 
 * @author 
 * @version 
 */
public class Heure implements Comparable<Heure> {

	/**
	    * heures est un entier
		*/
	int heures;
	
	/**
	    * minutes est un entier
		*/
	int minutes;
	
	
	/**
	    * Constructeur Heure.
	    * @param heures est un entier
	    * @param minutes est un entier	    
		*/
	public Heure(int heures, int minutes) {
		this.heures= heures;
		this.minutes = minutes;
	}
	
	
	/**
	* compare deux heures entre elles
	* @return on retourne un entier
	*/
	public int compareTo(Heure h) {
		int res = this.heures - h.heures;
		if (res ==0){
			res = this.minutes - h.minutes;  
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
		Heure other = (Heure) obj;
		if (heures != other.heures)
			return false;
		if (minutes != other.minutes)
			return false;
		return true;
	}
	
	
	/**
	    * méthode toString de SeanceTheatre.
	    * @return on retourne une chaine de caractère
		*/
	@Override
	public String toString() {
		return "Heure [heures=" + heures + ", minutes=" + minutes + "]";
	}
}