package projet;

import java.util.*;

/**
 * ProgrammationSemaine permet de créer une programmation pour une semaine passée en paramètre
 * 
 * @author 
 * @version 
 */
public class ProgrammationSemaine {
	
	/**
    * entier semaine
	*/	
	int semaine;
	
	/**
    * listeSeancesCinema est une SortedMap qui a pour clé des séances de cinema de type SeanceCinema
    * et pour valeurs des films de type Film
	*/
	SortedMap<SeanceCinema, Film> listeSeancesCinema;
	
	/**
    * listeSeancesTheatre est une SortedMap qui a pour clé des séances de theatre de type SeanceTheatre
    * et pour valeurs des pieces de theatre de type PieceTheatre
	*/
	SortedMap<SeanceTheatre, PieceTheatre> ListeSeancesTheatre;
	
	
	/**
    * Constructeur ProgrammationSemaine.
    * @param semaine est de type entier.
	*/	
	public ProgrammationSemaine(int semaine){
		this.semaine = semaine;
	}
	
	
	/**
    * Obtenir associer un ensemble de seance à un film.
    * @param c est un ensemble de séance.
    * @param film est de type Film.
	*/	
	public void associerEnsembleSeanceAUnFilm(Collection<SeanceCinema> c, Film film){
		Iterator<SeanceCinema> it = c.iterator();
		while(it.hasNext()){
			listeSeancesCinema.putIfAbsent(it.next(), film);
		}
	}
	
	
	/**
   	* associer un ensemble de seance à une piece de theatre.
    * @param c est un ensemble de séance.
    * @param piece est de type PieceTheatre.
	*/
	public void associerEnsembleSeanceAUnePiece(Collection<SeanceTheatre> c, PieceTheatre piece){
		Iterator<SeanceTheatre> it = c.iterator();
		while(it.hasNext()){
			ListeSeancesTheatre.putIfAbsent(it.next(), piece);
		}
	}
	
	/**
    * recuperer l'ensemble des séances associées à un film.
    * @param film est de type Film.
    * @return La valeur est un ensemble de séance.
	*/
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
	
	/**
    * recuperer l'ensemble des séances associées à une piece de théatre.
    * @param piece est de type PieceTheatre.
    * @return La valeur est un ensemble de séance.
	*/
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
	
	/**
    * recuperer l'ensemble des séances associées à un film à un jour donné.
    * @param film est de type Film.
    * @param jour est de type int.
    * @return La valeur est un ensemble de séance.
	*/
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
	
	/**
    * recuperer l'ensemble des séances associées à une piece de theatre à un jour donné.
    * @param piece est de type PieceTheatre.
    * @param jour est de type int.
    * @return La valeur est un ensemble de séance.
	*/
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
	
	/**
    * supprime un film de la liste listeSeancesCinema
    * @param film est type Film.
	*/
	public void suprimmerFilm(Film film){
		Collection<SeanceCinema> liste = recupererEnsembleSceance(film);
		Iterator<SeanceCinema> it = liste.iterator();
		while(it.hasNext()){
			listeSeancesCinema.remove(it.next(), film);
		}
	}
	
	/**
    * supprime une piece de theatre de la liste ListeSeancesTheatre
    * @param piece est type PieceTheatre.
	*/
	public void suprimmerPiece(PieceTheatre piece){
		Collection<SeanceTheatre> liste = recupererEnsembleSceance(piece);
		Iterator<SeanceTheatre> it = liste.iterator();
		while(it.hasNext()){
			ListeSeancesTheatre.remove(it.next(), piece);
		}
	}
	
	/**
    * recupere tout les films de listeSeancesCinema
    * @return est un ensemble de film.
	*/
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
	
	/**
    * recupere toutes les pieces de theatre de ListeSeancesTheatre
    * @return est un ensemble de piece de theatre.
	*/
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
	
	/**
    * recupère le nombre de film de l'ensemble retourné par la methode recupererEnsembleFilm()
    * @return est un entier.
	*/
	public int nbFilmProgrammes(){
		return recupererEnsembleFilm().size();
	}
	
	/**
    * recupère le nombre de piece de theatre de l'ensemble retourné par la methode recupererEnsemblePiece()
    * @return est un entier.
	*/
	public int nbPieceProgrammes(){
		return recupererEnsemblePiece().size();
	}
	
	/**
    * verifie si un film se trouve dans l'ensemble retourné par la methode recupererEnsembleFilm()
    * @return est un boolean.
	*/
	public boolean estProgramme(Film film){
		return recupererEnsembleFilm().contains(film);
	}
	
	/**
    * verifie si une piece de theatre se trouve dans l'ensemble retourné par la methode recupererEnsemblePiece()
    * @return est un boolean.
	*/
	public boolean estProgramme(PieceTheatre piece){
		return recupererEnsemblePiece().contains(piece);
	}
	
	/**
    * supprime une séance pour un film
   	* @param seance est de type Seance
   	* @param film est de type Film
    * @return est de type boolean
	*/
	public boolean suprimmerSeance(Seance seance, Film film){
		return listeSeancesCinema.remove(seance,film);
	}
	
	/**
	* supprime une séance pour un piece de theatre
	* @param seance est de type Seance
	* @param piece est de type PieceTheatre
	* @return est de type boolean
	*/
	public boolean suprimmerSeance(Seance seance, PieceTheatre piece){
		return ListeSeancesTheatre.remove(seance,piece);
	}
	
	/**
	* permet de consulter les séances pour un film en fonction du jour et de l'heure
	* @param film est de type Film
	* @param jour est de type entier
	* @param horaire est de type Heure
	* @return on retourne un String
	*/
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
	
	/**
	* permet de consulter les séances pour une piece de theatre en fonction du jour et de l'heure
	* @param piece est de type PieceTheatre
	* @param jour est de type entier
	* @param horaire est de type Heure
	* @return on retourne un String
	*/
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


	/**
	* indique si l'objet passé en parametre est égal à celui ci
	*/
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