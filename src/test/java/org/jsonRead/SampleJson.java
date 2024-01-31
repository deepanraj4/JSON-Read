package org.jsonRead;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SampleJson {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader f = new FileReader("C:\\Users\\Deepanraj\\eclipse-workspace\\jsonRead\\src\\test\\resources\\task.json");
		JSONParser jsonparser = new JSONParser();
		Object parse = jsonparser.parse(f);
		// typecasting
		JSONObject jsonObject = (JSONObject) parse;
		System.out.println(jsonObject.get("id"));
		System.out.println(jsonObject.get("type"));
		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("ppu"));
		System.out.println(jsonObject.get("batters"));
		System.out.println(jsonObject.get("topping"));
		
	}


}
