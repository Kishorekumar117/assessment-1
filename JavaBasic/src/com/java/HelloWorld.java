package com.java;

import java.util.function.IntPredicate;

public class HelloWorld {
	public static void main(String[] args) {
		IntPredicate div4=year -> year % 4 == 0;
		IntPredicate div100=year -> year % 100 != 0;
		IntPredicate div400=year -> year % 400 == 0;
		
		System.out.println(((div4).and((div100).or(div400))).test(2000));
	}
}
