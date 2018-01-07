
public class SceanceTheatre extends Seance{
	SalleTheatre salleTheatre;
	int nbFauteuilesVendus;
	
	public int nbPlacesDispo(){
		return salleTheatre.nbFauteuils - nbFauteuilsVendus;
	}
	public int totalVendu(){
		return nbFauteuilesVendus;
	}
	public double tauxRemplissage(){
		return (nbPlacesDispo()/(nbPlacesDispo()+totalVendu()))*100;
		
	}
	public int nbFauteuilsDispo(){
		return nbPlaceDispo();
	}
	
	public void vendrePlacesFauteuil(int nbre){
		
	}

	
}
