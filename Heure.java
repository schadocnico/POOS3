
public class Heure implements Comparable<Heure> {
	int heures;
	int minutes;
	
	public Heure(int heures, int minutes) {
		this.heures= heures;
		this.minutes = minutes;
	}
	
	public int compareTo(Heure h) {
		int res = this.heures - h.heures;
		if (res ==0){
			res = this.minutes - h.minutes;  
		}
		return res;
	}
}
