package test;

import java.lang.reflect.Field;

public class B {

//	public static void main(String[] args) {
//
//		System.out.println("abc");
//		System.out.println("master: 2");
//		System.out.println("master: 4");
//		System.out.println("dev4: 1");
//		
//		
//	}
	
	public static void main(String args[]) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		String s1 = "Hello World";  
		String s2 = new String("Hello World") ;
		System.out.println(s1); // Hello World  
		System.out.println(s2); // Hello World  
		Field field = String.class.getDeclaredField("value");  
		field.setAccessible(true);  
		char[] value = (char[])field.get(s1);  
		value[6] = 'J';  
		value[7] = 'a';  
		value[8] = 'v';  
		value[9] = 'a';  
		value[10] = '!';  
		System.out.println(s1); 
		System.out.println(s2); 
	}

}
