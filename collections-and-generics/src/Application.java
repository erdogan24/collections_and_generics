import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		
		
		ArrayList<String> words = new ArrayList <String>();
		words.add("Hello");
		words.add("there");
	    words.add("0");
	    words.add("10");
		
		String item1 = words.get(0);
		String item2 = words.get(1);
	    System.out.println(item1+" " +item2);
	    
	    LinkedList<Integer> numbers = new LinkedList<Integer>();
	
	    numbers.add(23242);
	    numbers.add(343);
	    numbers.add(65345);
	    
	    for(int number : numbers) {
	    	System.out.println(number);
	    }
	}

}
