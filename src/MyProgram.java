import java.util.ArrayList;
import java.util.logging.*;
import java.io.IOException;

public class MyProgram{
	
	public static void main(String[] args){
	
		Logger logger = Logger.getLogger("myLogger");
		logger.setLevel(Level.CONFIG);
		ConsoleHandler cHandler = new ConsoleHandler();
		logger.addHandler(cHandler);
		
		try{
			//filename, filesize, # of files, appendable
			FileHandler fHandler = new FileHandler("c:\\Temp\\myapp-log.%u.%g.txt", 1024 * 1024, 10, true);
			logger.addHandler(fHandler);
			
		} catch (IOException e){
			e.printStackTrace();
		}
		logger.log(Level.SEVERE, "Hello logging");
		logger.log(Level.WARNING, "Hello logging");
		logger.log(Level.INFO, "Hello logging");
		logger.log(Level.CONFIG, "Hello logging");
		
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