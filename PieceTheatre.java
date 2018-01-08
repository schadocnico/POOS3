package poo;


/**
 * Classe PieceTheatre qui hérite de Spectacle
 * 
 * @author 
 * @version 
 */
public class PieceTheatre extends Spectacle{


	/**
	    * metteurEnScene est une chaine de caractères
		*/
	private String metteurEnScene;
	
	/**
	    * nbEntractes est un entier
		*/
	private int nbEntractes;
	
	
	/**
	    * Constructeur PieceTheatre.
	    * @param titre est une chaine de caractères
	    * @param interpretes est une chaine de caractères
	    * @param metteurEnScene est une chaine de caractères
	    * @param nbEntractes est un entier
		*/
	public PieceTheatre(String titre, String interpretes,String metteurEnScene, int nbEntarctes) {
		super(titre,interpretes);
		this.metteurEnScene=metteurEnScene;
		this.nbEntractes=nbEntractes;
	}
	

	/**
	    * getter de metteurEnScene.
	    * @return on retourne une chaine de caracteres
		*/
	public String getMetteurEnScene() {
		return metteurEnScene;
	}

	/**
	    * setter de metteurEnScene.
	    * @param metteurEnScene est une chaine de caractères
		*/
	public void setMetteurEnScene(String metteurEnScene) {
		this.metteurEnScene = metteurEnScene;
	}

	/**
	    * getter de nbEntractes.
	    * @return on retourne un entier
		*/
	public int getNbEntractes() {
		return nbEntractes;
	}

	/**
	    * setter de nbEntractes.
	    * @param nbEntractes est un entier
		*/
	public void setNbEntractes(int nbEntractes) {
		this.nbEntractes = nbEntractes;
	}


	
	/**
	    * méthode toString de SeanceTheatre.
	    * @return on retourne une chaine de caractère
		*/
	@Override
	public String toString() {
		return "PieceTheatre [metteurEnScene=" + metteurEnScene + ", nbEntractes=" + nbEntractes + "]";
	}


	
	/**
	* indique si l'objet passé en parametre est égal à celui ci
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PieceTheatre other = (PieceTheatre) obj;
		if (metteurEnScene == null) {
			if (other.metteurEnScene != null)
				return false;
		} else if (!metteurEnScene.equals(other.metteurEnScene))
			return false;
		if (nbEntractes != other.nbEntractes)
			return false;
		return true;
	}
	
}
