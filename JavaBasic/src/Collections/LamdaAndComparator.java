package Collections;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;


class Data{

	String name;

	public Data(String name) {

		super();

		this.name = name;

	}

public String getName() {

		return name;

	}

	@Override
	public String toString() {

		return "ComparatorDemo [name=" + name + "]";

	}
		
}

public class LamdaAndComparator {
	public static void main(String[] args) {

		List<Data>list= new ArrayList<>();

		

		list.add(new Data("John"));

		list.add(new Data("Ram"));

		list.add(new Data("Shyam"));

		list.add(new Data("Vinod"));

		list.add(new Data("Shorey"));

		list.add(new Data("Akashkumar"));
		

//		Collections.sort(list,(o1,o2)->o1.getName().compareTo(o2.getName()));	
//		
//		for(Data a:list) {
//			System.out.println(a);
//		}
		
		Collections.sort(list,(o1,o2)->{
			if(o1.getName().length()<o2.getName().length()) {
				return -1;
			}else if(o1.getName().length()>o2.getName().length()) {
				return 1;
			}
			return 0;
		});
		
		for(Data a:list) {
			System.out.println(a);
		}
		
		
}
}