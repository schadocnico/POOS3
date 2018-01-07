package projet;

import java.util.Date;

public class Film extends Spectacle{
	String realisateur;
	Date duree;
	
	public Film(String titre, String interpretes, String realisateur, Date duree) {
		super(titre, interpretes);
		this.realisateur = realisateur;
		this.duree = duree;
	}
	
}