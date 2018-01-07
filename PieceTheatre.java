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
	
}
