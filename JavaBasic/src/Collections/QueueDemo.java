package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<String> fruits=new LinkedList<String>();
		
		fruits.add("Apple");
		fruits.add("orange");
		fruits.add("kivi");
		fruits.add("papaya");
		fruits.add("mango");
		
		System.out.println("first one "+fruits.peek());
		
		String del =fruits.poll();
		System.out.println("taken first "+del );
	}
	
}
