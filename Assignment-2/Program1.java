/*Write an application that executes three threads. One thread displays "Hello" every 1000 milliseconds and second thread displays "Hi " every 3000 milliseconds and third thread displays “How are You?”. Create the threads by implementing the Runnable interface.*/
class Thread1 implements Runnable{
	public void run() {
		int i=0;
		while(i<3) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			}
			catch(Exception a) {
				System.out.println("Sleep");
			}
			i++;
		}
		
	}
}
class Thread2 implements Runnable{
	public void run() {
		int i=0;
		while(i<3) {
			System.out.println("Hi");
			try {
				Thread.sleep(3000);
			}
			catch(Exception a) {
				System.out.println("Sleep");
			}
			i++;
		}
		
	}
}
class Thread3 implements Runnable{
	public void run() {
		int i=0;
		while(i<3) {
			System.out.println("How Are You?");
			i++;
		}
		
	}
}
public class Program1 {
	public static void main(String[] args) {
		Thread t1  = new Thread(new Thread1());
		Thread t2  = new Thread(new Thread2());
		Thread t3  = new Thread(new Thread3());
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}
