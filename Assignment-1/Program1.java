abstract class engineering{
	abstract void display();
}
interface programming{
	void coding();
}
interface drawing{
	void draw();
}
class computer extends engineering implements programming{
	public void coding() {
		System.out.println("Calling method from programming interface.");
	}
	void display() {
		System.out.println("Calling method from engineering class.");
	}
	
}
class mechanical extends engineering implements drawing{
	public void draw() {
		System.out.println("Calling method from drawing interface.");
	}
	void display() {
		System.out.println("Calling method from engineering class.");
	}
}

public class Program1 {
	public static void main(String[] args){
		engineering c=new computer();
		engineering m=new mechanical();
		computer c1=new computer();
		mechanical m1=new mechanical();
		c.display();
		c1.coding();
		c1.display();
		m.display();
		m1.draw();
		m1.display();
		
		
	}
}