package projet;


public class SeanceTheatre extends Seance{
	
	@Override
	public String toString() {
		return "SeanceTheatre [salleTheatre=" + salleTheatre + ", nbFauteuilsVendus=" + nbFauteuilsVendus + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeanceTheatre other = (SeanceTheatre) obj;
		if (nbFauteuilsVendus != other.nbFauteuilsVendus)
			return false;
		if (salleTheatre == null) {
			if (other.salleTheatre != null)
				return false;
		} else if (!salleTheatre.equals(other.salleTheatre))
			return false;
		return true;
	}

	SalleTheatre salleTheatre;
	int nbFauteuilsVendus=0;
	
	public SeanceTheatre(int jour, Heure horaire,SalleTheatre salleTheatre) {
		super(jour, horaire);
		this.salleTheatre=salleTheatre;
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
	
	public void vendrePlacesFauteuil(int nbre){
		nbFauteuilsVendus += nbre;
	}
	
}

	

	