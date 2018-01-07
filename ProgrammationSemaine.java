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
		while(it.hasnext()){
			ListSeanceCinema.putIsAbsent(it.next(), film);
		}
	}
	
	public Collection<SeanceCinema> recupererEnsembleSceance(Film film){
		Collection<SeanceCinema> seance = new List<>();
		
		Iterator<Map.Entry<SeanceCinema, Film>> it = listeSeanceCinema.entrySet().iterator();
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
	
	public Collection<SeanceCinema> recupererEnsembleSceance(Film film, int jour){
		Collection<SeanceCinema> liste = recupererEnsembleSceance(film);
		Collection<SeanceCinema> listeFin = new List<>();
		
		Iterator<SeanceCinema> it = liste.iterator();
		while(it.hasNext()){
			SeanceCinema seance = it.next();
			if (seance.jour == jour){
				listeFin.add(seance);
			}
		}
		return listeFin;
	}
	
	public void supprimerFilm(Film film){
		Collection<SeanceCinema> liste = recupererEnsembleSceance(film);
		Iterator<SeanceCinema> it = liste.iterator();
		while(it.hasNext()){
			listeSeancesCinema.remove(it.next(), film);
		}
	}
	
	public Collection<Film> recupererEnsembleFilm(){
		Collection<SeanceCinema> seance = new List<>();
		
		Iterator<Map.Entry<SeanceCinema, Film>> it = listeSeanceCinema.entrySet().iterator();
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
}
