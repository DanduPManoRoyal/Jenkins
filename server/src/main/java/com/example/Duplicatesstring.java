package com.example;


import java.util.LinkedHashSet;

public class Duplicatesstring {

	private static void remove(String str) {
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++)
			set.add(str.charAt(i));
			for(Character ch:set)
				//System.out.print(ch);
		
		System.out.println("Output value" +ch);
	}
	
	
	public static void main(String[] args) {
		String str="Manohar";
		remove(str);
	}


}