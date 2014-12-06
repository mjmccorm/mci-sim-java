import java.util.*;
/**
*This class defines a Person
*
*@author Matt McCormick
*/
public class Person{

	//Cannot change
	protected GregorianCalendar birthdate;
	protected String race;
	protected int id;
	
	//Can change
	private String gender;
	private int weight;
	private String weight_units;
	private int height;
	private String height_units;
	private Vitals current_vitals;
	private Vitals[] vital_history;
	
	/**
	*Create a Person with default values
	*/
	public Person(){
	
		this.id = -1;
		this.race = "Caucasian";
		this.gender = "Male";
		this.birthdate = new GregorianCalendar(1982,04,28);
		this.weight = 160;
		this.weight_units = "lbs";
		this.height = 70;
		this.height_units = "inches";
		this.current_vitals = new Vitals();
		//this.vital_history[0] = this.current_vitals;
	}
	
	/**
	*Create a Person with specified values
	*
	*@param id The id of the person
	*@param age  The age of the person
	*@param gender The gender of the person
	*@param race The race of the person
	*/
	public Person(int id, int age, String gender, String race){
	
		this.id = id;
		this.race = race;
		this.gender = gender;
		
		//this.birthdate = new GregorianCalendar(1982,04,28);
		this.birthdate = this.genBirthdate(age);
		this.weight = 160;
		this.weight_units = "lbs";
		this.height = 70;
		this.height_units = "inches";
		this.current_vitals = new Vitals();
	}
	
	public String getRace(){
		return this.race;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	public int getWeight(){
		return this.weight;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public String getWeightUnits(){
		return this.weight_units;
	}
	
	public String getHeightUnits(){
		return this.height_units;
	}
	
	public Vitals getCurrentVitals(){
		return this.current_vitals;
	}
	
	public int getID(){
		return this.id;
	}
	
	public String getBirthdate(){
		String bday = this.birthdate.get(Calendar.YEAR) + "/" + this.birthdate.get(Calendar.MONTH) + "/" + this.birthdate.get(Calendar.DAY_OF_MONTH);
		return bday;
	}
	
	public int getAge(){
	    GregorianCalendar today = new GregorianCalendar();
	    int age = today.get(Calendar.YEAR) - this.birthdate.get(Calendar.YEAR);
	    return age;
	}
	
	public GregorianCalendar genBirthdate(int age){
		
		GregorianCalendar today = new GregorianCalendar();
		int year = today.get(Calendar.YEAR) - age;
		int month = 1;
	    int day = 1;
	    GregorianCalendar newBday = new GregorianCalendar(year, month, day);
	    return newBday;
	}
}