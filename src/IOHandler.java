import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

/**
*This class defines a Person
*
*@author Matt McCormick
*/
public class IOHandler{

	private JSONObject obj;
	/**
	*Create a IOHandler with default values
	*/
	public IOHandler(){
	
		obj = new JSONObject();
		obj.put("name","foo");
		obj.put("num",new Integer(100));
		obj.put("balance",new Double(1000.21));
		obj.put("is_vip",new Boolean(true));
		obj.put("nickname",null);
		System.out.print(obj);
		
	}
	
	public void printToScreen(){
		System.out.print(this.obj);
	}
	
	public void writeToFile(){
		
		try{
			FileWriter file = new FileWriter("c:/Temp/test.json");
			file.write(this.obj.toJSONString());
			System.out.println(this.obj.toJSONString());
			file.flush();
			file.close();
			
		} catch (IOException e){
			e.printStackTrace();
		} 
	}
	
	public void readFromFile(){
		
		JSONParser parser = new JSONParser();
		try{
			FileReader file = new FileReader("C:/Temp/test2.json");
			try{
				Object obj2 = parser.parse(file);
				this.obj = (JSONObject) obj2;
			} catch(ParseException e){
				e.printStackTrace();
			}
			
		} catch(IOException e){
			e.printStackTrace();
			
		}
		
	}


}