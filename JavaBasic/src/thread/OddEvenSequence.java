package thread;

class ThreadSequence implements Runnable{
	String remainder;
	static int number =3;
	int LIMIT =8;
	static Object lock = new Object();
	
public ThreadSequence (String remainder) {
	this.remainder = remainder;
}

@Override

public void run() {

	while (number < LIMIT ) {

		synchronized (lock) {

			while( remainder.equals("]") ) 

			{
				try {

					lock.wait();
				}

				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}

//			while( remainder.equals("[")) 
//
//			{
//				try {
//
//					lock.wait();
//				}
//
//				catch(InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
			System.out.println(Thread.currentThread().getName()+" "+"]");

			number++;

			lock.notifyAll();

		}

		}

	}	

}

public class OddEvenSequence {

	public static void main(String[] args) {

		ThreadSequence odd_sequence = new ThreadSequence("[");

		ThreadSequence even_sequence = new ThreadSequence("]");

		

		System.out.println("odd-even Number sequence using thread");

		

		Thread odd_thread = new Thread(odd_sequence,"[");

		Thread even_thread = new Thread(even_sequence,"]");

		

		odd_thread.start();

		even_thread.start();

	}



}