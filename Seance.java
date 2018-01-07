package projet;

import java.util.Date;

public abstract class Seance implements Comparable<Seance>{{
	
	int jour;
	Heure horaire;
	int nbPlacesVenduesTN =0;
	
	public Seance(int jour, Date horaire) {
		super();
		this.jour=jour;
		this.horaire=horaire;
	}
	
	public abstract int nbPlacesDispo();
	
	 public abstract int totalVendu();
	 
	 public abstract double tauxRemplissage();
	 
	 public void vendrePlacesTN(int nbre) {
		 this.nbPlacesVenduesTN=nbre;
	 }
	
	 public int compareTo(Seance s) {
		 int res = this.jour - s.jour;
		 if (res == 0){
			 res = horaire.compareTo(s.horaire);
		 }
	      return res;
	 }

}
