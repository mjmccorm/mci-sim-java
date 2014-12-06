public class Vitals{

	private int systolic_bp;
	private int diastolic_bp;
	private int heart_rate;
	
	private boolean alive;
	
	public Vitals(){
	
		//randomly set alive
		alive = true;
		
		if(alive){
			systolic_bp = 120;
			diastolic_bp = 80;
			heart_rate = 70;
		}else{
			systolic_bp = -1;
			diastolic_bp = -1;
			heart_rate = -1;
		}
	
	}
	
	public Vitals(int age, int weight, int condition){
		
		//create vitals based on age, weight, and medical conditions
	}
	
	public boolean isAlive(){
		return alive;
	}
	
	//Systolic Blood Pressure
	private int getSystolicBP(){
		return this.systolic_bp;
	}
	private void increaseSystolicBP(int delta){
		this.systolic_bp += delta;
	}
	private void decreaseSystolicBP(int delta){
		this.systolic_bp -= delta;
	}
	
	//Diastolic Blood Pressure
	private int getDiastolicBP(){
		return this.diastolic_bp;
	}
	private void increaseDiastolicBP(int delta){
		this.diastolic_bp += delta;
	}
	private void decreaseDiastolicBP(int delta){
		this.diastolic_bp += delta;
	}
	
	//Heart Rate
	private int getHeartRate(){
		return this.heart_rate;
	}
	private void increaseHeartRate(int delta){
		this.heart_rate += delta;
	}
	private void decreaseHeartRate(int delta){
		this.heart_rate -= delta;
	}
	
}