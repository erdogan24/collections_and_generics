package lesson2;
import java.util.ArrayList;
import java.util.List;



public class Application {

	public static void main(String[] args) {
		
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("cat");
		animals.add("dog");
		animals.add("bird");
		
		for (int i = 0; i < animals.size(); i++) {

			System.out.println(animals.get(i));
		}

		for (String value : animals) {
			System.out.println(value);
		}
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		Vehicle vehicle2 = new Vehicle("Toyota","Camery",1300,false);
		
		vehicles.add(new Vehicle("Honda","accord",1200,false));
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Jeep","Wrangler",2500,true));
		
		for(Vehicle car : vehicles) {
			System.out.println(car);
			
		}
		printElement(vehicles);
		printElement(animals);
	
	}
	public static void printElement(List someList) {
		for(int i =0; i < someList.size();i++) {
			
			System.out.println(someList.get(i));
				
		}
}
	}
