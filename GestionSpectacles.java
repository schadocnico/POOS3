package poo;

import java.io.*;
import java.util.*;

public class GestionSpectacles {

	public static void main(String[] args){
		Collection<Salle> sallesCinemas = new TreeSet<Salle>();
		try {
			 File file = new File("SallesCinema.csv");
			 FileReader fr = new FileReader(file);
			 BufferedReader bfr = new BufferedReader(fr);
			 String line = null;
			  
			 bfr.readLine();
			 while((line = bfr.readLine()) != null) {
				 Scanner s = new Scanner(line).useDelimiter(";");
				 String nom = s.next();
				 int capacite = s.nextInt();
				 double prix = s.nextDouble();
				 s.close();
				 Salle salle = new Salle(nom, capacite, prix);
				 sallesCinemas.add(salle);
				 
			 }
			  
			 //close the file
			 bfr.close();
			 } catch(Exception e) {
			    e.printStackTrace();
			 }
		Collection<SalleTheatre> sallesTheatre = new TreeSet<SalleTheatre>();
		try {
			 File file = new File("SallesTheatre.csv");
			 FileReader fr = new FileReader(file);
			 BufferedReader bfr = new BufferedReader(fr);
			 String line = null;
			  
			 bfr.readLine();
			 while((line = bfr.readLine()) != null) {
				 Scanner s = new Scanner(line).useDelimiter(";");
				 String nom = s.next();
				 int capacite = s.nextInt();
				 double prix = s.nextDouble();
				 int capacite2 = s.nextInt();
				 double prix2 = s.nextDouble();
				 s.close();
				 SalleTheatre salle = new SalleTheatre(nom, capacite, prix, capacite2, prix2);
				 sallesCinemas.add(salle);
				 
			 }
			  
			 //close the file
			 bfr.close();
			 } catch(Exception e) {
			    e.printStackTrace();
			 }


	}

}
