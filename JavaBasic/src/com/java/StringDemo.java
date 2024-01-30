package com.java;

public class StringDemo {
	public static void main(String[] args) {
		String type="JAVA Programs";
		String spc="Objest oriented language";
		
		System.out.println(type.concat(spc));
		
		System.out.println(type.equals(spc));
		System.out.println(type.equalsIgnoreCase("javA ProGRams"));
		
		System.out.println(type.length());
		
		System.out.println(String.join(" ",type,spc));
		
		System.out.println(type.substring(2,5));
		
		System.out.println(type.contains("Pro"));
		
		System.out.println(String.format("the %s is a %s",type,spc));
		
		System.out.println(type.indexOf("ogr"));
		}
}
