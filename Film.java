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
	
	@Override
	public String toString() {
		return "Film [realisateur=" + realisateur + ", duree=" + duree + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		if (duree == null) {
			if (other.duree != null)
				return false;
		} else if (!duree.equals(other.duree))
			return false;
		if (realisateur == null) {
			if (other.realisateur != null)
				return false;
		} else if (!realisateur.equals(other.realisateur))
			return false;
		return true;
	}

	
}