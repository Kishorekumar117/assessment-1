package thread;

interface Lamda{
	public void line();
}

interface Operation{
	public void add(int a,int b);
}


public class LamdaFunction {
	public static void main(String[] args) {
		Lamda l=(()->System.out.println("------------------------------"));
		l.line();
		
		Operation o=((x,y)->System.out.println(x+y));
		o.add(25, 3);
	}
}
