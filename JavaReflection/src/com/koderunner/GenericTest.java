package com.koderunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericTest {

	public static  List sortCollection(List<? extends Number> toBeSorted){
		
		Collections.sort((List)toBeSorted);
		return toBeSorted ;
		
	}
	
	
	public static  <T extends Comparable > T findMinimum(T u,T x, T y, T z){
		T min = u;
		if(x.compareTo(min)<0)
			min = x;
		if(y.compareTo(min)<0)
			min = y;
		if(z.compareTo(min)<0)
			min = z;
		return min;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> listOfNumber = new ArrayList<Integer>();
		listOfNumber.add(523);
		listOfNumber.add(234);
		
		ArrayList<String> listOfString = new ArrayList<>();
		listOfString.add("Sachin");
		listOfString.add("Dravid");
		listOfString.add("Saurav");
		listOfString.add("Dhoni");
		listOfString.add("Bravo");
		
		
		
		System.out.println(sortCollection(listOfNumber));
		
		System.out.println(findMinimum(8, 5, 2, 10));
		System.out.println(findMinimum(8.2,4.3,7.9,7.0));
		System.out.println(findMinimum("a", "z", "h", "abv"));
		
	}
	
}
