package poo;

import java.util.*;

public class ProgrammationSemaine {
	int semaine;
	SortedMap<SeanceCinema, Film> listeSeancesCinema;
	SortedMap<SeanceTheatre, PieceTheatre> ListeSeancesTheatre;
	
	public ProgrammationSemaine(int semaine){
		this.semaine = semaine;
	}
	
	public void associerEnsembleSeanceAUnFilm(Collection<SeanceCinema> c, Film film){
		Iterator<SeanceCinema> it = c.iterator();
		while(it.hasNext()){
			listeSeancesCinema.putIfAbsent(it.next(), film);
		}
	}
	
	public void associerEnsembleSeanceAUnePiece(Collection<SeanceTheatre> c, PieceTheatre piece){
		Iterator<SeanceTheatre> it = c.iterator();
		while(it.hasNext()){
			ListeSeancesTheatre.putIfAbsent(it.next(), piece);
		}
	}
	
	public Collection<SeanceCinema> recupererEnsembleSceance(Film film){
		Collection<SeanceCinema> seance = new ArrayList<>();
		
		Iterator<Map.Entry<SeanceCinema, Film>> it = listeSeancesCinema.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			SeanceCinema key = (SeanceCinema) entry.getKey();
			Film value = (Film) entry.getValue();
			if(value.equals(film)){
				seance.add(key);
			}
		}
		return seance;
	}
	
	public Collection<SeanceTheatre> recupererEnsembleSceance(PieceTheatre piece){
		Collection<SeanceTheatre> seance = new ArrayList<>();
		
		Iterator<Map.Entry<SeanceTheatre, PieceTheatre>> it = ListeSeancesTheatre.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			SeanceTheatre key = (SeanceTheatre) entry.getKey();
			PieceTheatre value = (PieceTheatre) entry.getValue();
			if(value.equals(piece)){
				seance.add(key);
			}
		}
		return seance;
	}
	
	public Collection<SeanceCinema> recupererEnsembleSceance(Film film, int jour){
		Collection<SeanceCinema> liste = recupererEnsembleSceance(film);
		Collection<SeanceCinema> listeFin = new ArrayList<>();
		
		Iterator<SeanceCinema> it = liste.iterator();
		while(it.hasNext()){
			SeanceCinema seance = it.next();
			if (seance.jour == jour){
				listeFin.add(seance);
			}
		}
		return listeFin;
	}
	
	public Collection<SeanceTheatre> recupererEnsembleSceance(PieceTheatre piece, int jour){
		Collection<SeanceTheatre> liste = recupererEnsembleSceance(piece);
		Collection<SeanceTheatre> listeFin = new ArrayList<>();
		
		Iterator<SeanceTheatre> it = liste.iterator();
		while(it.hasNext()){
			SeanceTheatre seance = it.next();
			if (seance.jour == jour){
				listeFin.add(seance);
			}
		}
		return listeFin;
	}
	
	public void suprimmerFilm(Film film){
		Collection<SeanceCinema> liste = recupererEnsembleSceance(film);
		Iterator<SeanceCinema> it = liste.iterator();
		while(it.hasNext()){
			listeSeancesCinema.remove(it.next(), film);
		}
	}
	
	public void suprimmerPiece(PieceTheatre piece){
		Collection<SeanceTheatre> liste = recupererEnsembleSceance(piece);
		Iterator<SeanceTheatre> it = liste.iterator();
		while(it.hasNext()){
			ListeSeancesTheatre.remove(it.next(), piece);
		}
	}
	
	public Collection<Film> recupererEnsembleFilm(){
		Collection<Film> seance = new ArrayList<>();
		
		Iterator<Map.Entry<SeanceCinema, Film>> it = listeSeancesCinema.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			SeanceCinema key = (SeanceCinema) entry.getKey();
			Film value = (Film) entry.getValue();
			if(!(seance.contains(value))){
				seance.add(value);
			}
		}
		return seance;
	}
	
	public Collection<PieceTheatre> recupererEnsemblePiece(){
		Collection<PieceTheatre> seance = new ArrayList<>();
		
		Iterator<Map.Entry<SeanceTheatre, PieceTheatre>> it = ListeSeancesTheatre.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			SeanceTheatre key = (SeanceTheatre) entry.getKey();
			PieceTheatre value = (PieceTheatre) entry.getValue();
			if(!(seance.contains(value))){
				seance.add(value);
			}
		}
		return seance;
	}
	
	public int nbFilmProgrammes(){
		return recupererEnsembleFilm().size();
	}
	
	public int nbPieceProgrammes(){
		return recupererEnsemblePiece().size();
	}
	
	public boolean estProgramme(Film film){
		return recupererEnsembleFilm().contains(film);
	}
	
	public boolean estProgramme(PieceTheatre piece){
		return recupererEnsemblePiece().contains(piece);
	}
	
	public boolean suprimmerSeance(Seance seance, Film film){
		return listeSeancesCinema.remove(seance,film);
	}
	
	public boolean suprimmerSeance(Seance seance, PieceTheatre piece){
		return ListeSeancesTheatre.remove(seance,piece);
	}
	
	
	public String consulterSceance(Film film, int jour, Heure horaire) {
		Collection<SeanceCinema> liste = recupererEnsembleSceance(film, jour);
		
		Iterator<SeanceCinema> it = liste.iterator();
		while(it.hasNext()){
			SeanceCinema next = it.next();
			if(next.horaire.equals(horaire))
				return next.toString();
		}
		return "";
	}
	
	public String consulterSceance(PieceTheatre piece, int jour, Heure horaire) {
		Collection<SeanceTheatre> liste = recupererEnsembleSceance(piece, jour);
		
		Iterator<SeanceTheatre> it = liste.iterator();
		while(it.hasNext()){
			SeanceTheatre next = it.next();
			if(next.horaire.equals(horaire))
				return next.toString();
		}
		return "";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProgrammationSemaine other = (ProgrammationSemaine) obj;
		if (ListeSeancesTheatre == null) {
			if (other.ListeSeancesTheatre != null)
				return false;
		} else if (!ListeSeancesTheatre.equals(other.ListeSeancesTheatre))
			return false;
		if (listeSeancesCinema == null) {
			if (other.listeSeancesCinema != null)
				return false;
		} else if (!listeSeancesCinema.equals(other.listeSeancesCinema))
			return false;
		if (semaine != other.semaine)
			return false;
		return true;
	}


}