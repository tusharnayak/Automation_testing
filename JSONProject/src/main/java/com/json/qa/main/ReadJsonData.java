package com.json.qa.main;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonData {
	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonParser=new JSONParser();
		FileReader reader=new FileReader("/home/admin1/Desktop/Automation/JSONProject/JsonFiles/Employee.json");
		Object obj=jsonParser.parse(reader);
		JSONObject empJsonObj=(JSONObject)obj;
		String fName=(String) empJsonObj.get("firstName");
		String lName=(String) empJsonObj.get("lastName");
		
		
		System.out.println("First name:"+fName);
		System.out.println("Last name:"+lName);
		
		JSONArray array=(JSONArray) empJsonObj.get("address");
		for(int i=0;i<array.size();i++) {
			JSONObject address=(JSONObject) array.get(i);
			String cross=(String) address.get("cross");
			String lane=(String) address.get("lane");
			String city=(String) address.get("city");
			String state=(String) address.get("state");
			
			
			System.out.println("address of "+i+" is.......");
			System.out.println("cross: "+cross);
			System.out.println("lane: "+lane);
			System.out.println("city: "+city);
			System.out.println("state: "+state);



		}

	}
}











