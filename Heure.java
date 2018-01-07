package projet;

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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Heure other = (Heure) obj;
		if (heures != other.heures)
			return false;
		if (minutes != other.minutes)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Heure [heures=" + heures + ", minutes=" + minutes + "]";
	}
}