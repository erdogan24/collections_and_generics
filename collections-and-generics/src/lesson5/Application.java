package lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Application {

	public static void main(String[] args) {
		HashMap<String,String> dictionary = new HashMap<String,String>();
		dictionary.put("Brave","ready to face and endure danger or pain showing courage");
		dictionary.put("Brillant","clever or talented");
		dictionary.put("Joy","feeling great");
		dictionary.put("Confidence","ready to face and endure danger or pain showing courage");
		
		for(String word: dictionary.values()) {
			System.out.println(dictionary.get(word));
		}
		
		
		for(Map.Entry<String, String> entry: dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}	
