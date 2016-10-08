package com.koderunner;

public class IntegerCaching {

	public static void main(String[] args) {

		Integer i1=100;
		Integer i2=100;
		Integer i3=100;
		System.out.println(i1==i3); //returns true
		
		Integer s1=1000;
		Integer s2=1000;
		System.out.println(s1==s2); //returns false
	}

}
