import java.util.ArrayList;

public class MyProgram{
	
	public static void main(String[] args){
	
		ArrayList people = new ArrayList();
		
		Person matt = new Person();
		System.out.println(matt.getID() + ":" + matt.getGender() + ":" + matt.getRace() + ":" + matt.getBirthdate() + ":" + matt.getAge());
		people.add(matt);
		
		Person p2 = new Person(10, 25, "Female", "Mexican");
		System.out.println(p2.getID() + ":" + p2.getGender() + ":" + p2.getRace() + ":" + p2.getBirthdate() + ":" + p2.getAge() );
		people.add(matt);
		
		IOHandler myIO = new IOHandler();
		myIO.writeToFile();
		myIO.readFromFile();
		myIO.printToScreen();
		System.out.println(" ");
		System.out.println(people.size());
		
		IncidentTimer ex = new IncidentTimer();
		
	}

}