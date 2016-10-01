package com.koderunner;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {
	
	public static void main(String[] args) {
		
		//Find methods inside object class
		try {
			Class testClass = Class.forName("java.lang.Object");
			System.out.println(testClass.getClassLoader());
			Method[] methods= testClass.getMethods();
			for(Method method:methods){
				System.out.println(Modifier.toString(method.getModifiers()) + " " + method.getName() + "()");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
