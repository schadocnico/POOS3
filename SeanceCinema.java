package poo;

public class SeanceCinema extends Seance{

	Salle salle;
	int nbPlacesVenduesTR=0;
	
	public SeanceCinema(int jour, Heure horaire,Salle salle) {
		super(jour,horaire);
		this.salle=salle;
	}
	
	@Override
	public int nbPlacesDispo() {
		return salle.getCapacite() - nbPlacesVenduesTR;
	}



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

	@Override
	public String toString() {
		return "SeanceCinema [salle=" + salle + ", nbPlacesVenduesTR=" + nbPlacesVenduesTR + "]";
	}

	@Override
	public int totalVendu() {
		return nbPlacesVenduesTR + super.nbPlacesVenduesTN;
	}

	@Override
	public double tauxRemplissage() {
		return (nbPlacesDispo()/(nbPlacesDispo()+totalVendu()))*100;
	}
	
	public void vendrePlacesTR(int nbre) {
		
		this.nbPlacesVenduesTR+=nbre;
	}

}
