
public class Injury {

	private String injury_type;
	private int severity;
	private Person person;
	private Vitals new_vitals;
	
	public Injury(Person p, int s){
		this.severity = s;
		this.person = p;
		this.new_vitals = p.getCurrentVitals();
	}
	
	private void alterVitals(){
		
		switch(this.severity){
		
			//Minimal Injury
			case 0:
				//increase or decrease
				
			//Severe Injury
			case 5:
				//increase or decrease
		}
	}
	
	private boolean causeDeath(){
		return true;
	}
	
}
