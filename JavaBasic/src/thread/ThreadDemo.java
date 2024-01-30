package thread;

class Counter {
	private int threadNo;

	public Counter(int threadNo) {
		this.threadNo = threadNo;
	}

	public void countNum() {
		for (int i = 1; i <= 9; i++) {
			System.out.println("thred no : "+threadNo+" and iteration no : "+i);
		}
	}

}

public class ThreadDemo {
	public static void main(String[] args) {
		Counter c1=new Counter(1);
		Counter c2=new Counter(2);
		c1.countNum();
		System.out.println("===================");
		c2.countNum();
		

	}
}
