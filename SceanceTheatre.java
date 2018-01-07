package poo;
public class SceanceTheatre extends Seance{
	SalleTheatre salleTheatre;
	int nbFauteuilsVendus;
	
	public SceanceTheatre(Heure horaire){
		super(0, horaire);
	}
	public int nbPlacesDispo(){
		return salleTheatre.nbFauteuils - nbFauteuilsVendus;
	}
	public int totalVendu(){
		return nbFauteuilsVendus;
	}
	public double tauxRemplissage(){
		return (nbPlacesDispo()/(nbPlacesDispo()+totalVendu()))*100;
		
	}
	public int nbFauteuilsDispo(){
		return nbPlacesDispo();
	}
	
	public void vendrePlacesFauteuil(int nbre) throws Exception{
		if(nbFauteuilsDispo()<nbre) throw new Exception("Il n'y a plus assez de place!");
		nbFauteuilsVendus += nbre;
	}

	
}
