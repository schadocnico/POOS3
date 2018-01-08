import java.util.*;
public class GestionSpectacles {

	public static void main(String[] args){
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File("SallesCinema.csv"));
		    bis = new BufferedInputStream(fis);
		    String chaine;

		    while((chaine = bis.read()) != -1){
		    	System.out.println(chaine);
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }

	}

}
