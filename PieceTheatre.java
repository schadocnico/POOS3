package projet;

public class PieceTheatre extends Spectacle{

	private String metteurEnScene;
	private int nbEntractes;
	
	public PieceTheatre(String titre, String interpretes,String metteurEnScene, int nbEntarctes) {
		this.titre=titre;
		this.interpretes=interpretes;
		this.metteurEnScene=metteurEnScene;
		this.nbEntractes=nbEntractes;
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String getInterpretes() {
		return interpretes;
	}

	public void setInterpretes(String interpretes) {
		this.interpretes = interpretes;
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
