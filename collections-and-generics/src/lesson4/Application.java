package lesson4;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(76);
		list1.add(43);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(10);
		
		list1.addAll(newList);
		
		System.out.println(list1);
	}

}
