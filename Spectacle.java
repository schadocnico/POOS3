package projet;

/**
 * Classe Spectacle
 * 
 * @author 
 * @version 
 */
public abstract class Spectacle {
	

	/**
	    * titre et interpretes sont de type chaine de caracteres
		*/
	private String titre, interpretes;
	
	

	/**
	    * Constructeur Spectacle.
	    * @param titre est de type chaine de caract�res
	    * @param interpretes est de type chaine de caract�res
		*/	
	public Spectacle(String titre, String interpretes) {
		super();
		this.titre = titre;
		this.interpretes = interpretes;
	}

	
	/**
	    * m�thode toString de Spectacle.
	    * @return on retourne une chaine de caract�res
		*/
	@Override
	public String toString() {
		return "Spectacle [titre=" + titre + ", interpretes=" + interpretes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((interpretes == null) ? 0 : interpretes.hashCode());
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
		return result;
	}

	
	/**
	* indique si l'objet pass� en parametre est �gal � celui ci
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Spectacle other = (Spectacle) obj;
		if (interpretes == null) {
			if (other.interpretes != null)
				return false;
		} else if (!interpretes.equals(other.interpretes))
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}
}



