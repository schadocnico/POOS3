package projet;

public class SeanceCinema extends Seance{

	Salle salle;
	int nbPlacesVenduesTR=0;
	
	
	@Override
	public int nbPlacesDispo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalVendu() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double tauxRemplissage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void vendrePlacesTR(int nbre) {
		this.nbPlacesVenduesTR=nbre;
	}

}
