package projet;

import java.util.Date;

public class SeanceCinema extends Seance{

	Salle salle;
	int nbPlacesVenduesTR=0;
	
	public SeanceCinema(int jour, Date horaire,Salle salle) {
		super(jour,horaire);
		this.salle=salle;
	}
	
	@Override
	public int nbPlacesDispo() {
		return salle.getCapacite();
	}

	@Override
	public int totalVendu() {
		return nbPlacesVenduesTR + nbPlacesVenduesTN;
	}

	@Override
	public double tauxRemplissage() {
		return (nbPlacesDispo()/(nbPlacesDispo()+totalVendu()))*100;
	}
	
	public void vendrePlacesTR(int nbre) {
		this.nbPlacesVenduesTR=nbre;
	}

}
