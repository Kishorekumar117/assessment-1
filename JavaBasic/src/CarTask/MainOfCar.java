package CarTask;

import java.util.Scanner;

public class MainOfCar {
	public static void main(String[] args) {
//    	Car carDetails = new Car();
//        carDetails.displayCarList();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your choice (1-3): ");
//        int choice = scanner.nextInt();
//
//        carDetails.getCarEngine(choice);
// 
//        scanner.close();

//		DEmoCon d1 = new DEmoCon();
//		System.out.println(d1.run());
		
		
		Truck t1=new Truck("v4",4,2,11,"double","yes","Large","no","12/6");
		System.out.println(t1.getEngine());
		System.out.println(t1.getSteering());
		System.out.println(t1.getContainer());
		System.out.println(t1.getAbs());
	}
}
