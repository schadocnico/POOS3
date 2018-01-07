package projet;

public class PieceTheatre extends Spectacle{



	private String metteurEnScene;
	private int nbEntractes;
	
	public PieceTheatre(String titre, String interpretes,String metteurEnScene, int nbEntarctes) {
		super(titre,interpretes);
		this.metteurEnScene=metteurEnScene;
		this.nbEntractes=nbEntractes;
	}
	

	public String getMetteurEnScene() {
		return metteurEnScene;
	}

	public void setMetteurEnScene(String metteurEnScene) {
		this.metteurEnScene = metteurEnScene;
	}

	public int getNbEntractes() {
		return nbEntractes;
	}

	public void setNbEntractes(int nbEntractes) {
		this.nbEntractes = nbEntractes;
	}


	@Override
	public String toString() {
		return "PieceTheatre [metteurEnScene=" + metteurEnScene + ", nbEntractes=" + nbEntractes + "]";
	}


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
