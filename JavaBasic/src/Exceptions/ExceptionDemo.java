package Exceptions;
import java.util.Scanner;
public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num =sc.nextInt();
			int div=num/0;
			
			String myString = null;

			int length = myString.length(); 
			
			
			System.out.println("inside the try working");
		}
		catch(Exception e){
			System.out.println("error handel by excep : "+e.getMessage());
		}
		
//		catch(NullPointerException e){
//			System.out.println("error handel by Nullpoint : "+e.getMessage());
//		}
//		
//		catch(RuntimeException e){
//			System.out.println("error handel by runtime : "+e.getMessage());
//		}
		
	}
}
