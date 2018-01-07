package projet;

import java.util.Date;

public abstract class Seance {
	
	int jour;
	Date horaire;
	int nbPlacesVenduesTN =0;
	
	public Seance(int jour, Date horaire) {
		this.jour=jour;
		this.horaire=horaire;
	}
	
	public abstract int nbPlacesDispo();
	
	 public abstract int totalVendu();
	 
	 public abstract double tauxRemplissage();
	 
	 public void vendrePlacesTN(int nbre) {
		 this.nbPlacesVenduesTN=nbre;
	 }
	
	

}
