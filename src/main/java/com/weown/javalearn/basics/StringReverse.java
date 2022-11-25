package com.weown.javalearn.basics;

import java.util.Arrays;
import java.util.List;

public class StringReverse {
	
	
	
	
	public static void main(String[] args) {
		
		
//		Person pers=new Person();
//		
//		Person person=new Person("ds",34,"wetty");
//		
//		System.out.println(pers);
//		System.out.println(person);
		
		
		String name="Erode";
		
		String stringReverse="";
		for (int stringIndex = name.length()-1; stringIndex >=0; stringIndex--) {
			stringReverse=stringReverse+name.charAt(stringIndex);
		}
		System.out.println(stringReverse);
		
//		String splitValues[]=name.split("");
//		System.out.println(splitValues.length);
//		
//		List<String> ls=Arrays.asList(splitValues);
//		System.out.println(ls);
//		
//		for (String string : splitValues) {
//			System.out.println(string);
//		}
//		
//		System.out.println(name.length());
		
		
		char[] letters=name.toCharArray();
		
		String reverse="";
		for (int i = letters.length-1; i >=0; i--) {
			reverse=reverse+letters[i];
		}
		
		System.out.println(reverse);
		
		
		
		
		
		
	}

}
