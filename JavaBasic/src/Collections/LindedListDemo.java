package Collections;

import java.util.Comparator;
import java.util.LinkedList;

public class LindedListDemo {
	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("java");
		l1.add("python");
		l1.add("django");
		l1.add("react");
		l1.add("angular");
		l1.add("C++");
		
		l1.set(3,"ram");
		
		l1.remove(1);
		
		
		if(l1.contains("C++")){
			System.out.println("C++ is avalible"
					+ "\n");
		}
		l1.sort(null);
		
		for(String str:l1) {
			System.out.println(str);
		}
		System.out.println();
		l1.sort(Comparator.reverseOrder());
		for(String str:l1) {
			System.out.println(str);
		}
		
	}
}
