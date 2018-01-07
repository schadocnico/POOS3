package projet;

import java.util.Date;

public abstract class Seance implements Comparable<Seance>{
	


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

	@Override
	public String toString() {
		return "Seance [jour=" + jour + ", horaire=" + horaire + ", nbPlacesVenduesTN=" + nbPlacesVenduesTN + "]";
	}

	int jour;
	Heure horaire;
	int nbPlacesVenduesTN =0;
	
	public Seance(int jour, Heure horaire) {
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
