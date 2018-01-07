package projet;

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
