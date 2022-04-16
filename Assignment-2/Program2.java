/*Write a program to create two threads, one thread will print odd numbers and second thread will print even numbers between 1 to 100 numbers.*/
class Threadodd extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
			for(int i=1;i<=100;i++) {
				if(i%2!=0) {
					System.out.println("Thread1: "+i);
				}
			}
		}
		catch(Exception a) {
			//System.out.println("Sleep");
		}
		
	}
}
class Threadeven extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
			for(int i=1;i<=100;i++) {
				if(i%2==0) {
					System.out.println("Thread2: "+i);
				}
			}
		}
		catch(Exception a) {
			//System.out.println("Sleep");
		}
		
	}
}
public class Program2 {
	public static void main(String[] args) {
		Threadodd t1 = new Threadodd();
		Threadeven t2 = new Threadeven();
		t1.start();
		t2.start();
	}
}
