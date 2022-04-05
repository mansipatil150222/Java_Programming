abstract class Animal{
	abstract void deliver();
}
interface Transport{
	void deliver();
}
class Tiger extends Animal{
	public void deliver() {}
}
class Camel extends Animal implements Transport{
	public void deliver() {
		System.out.println("deliver method called from Camel class.");
	}
	Camel(){
		System.out.println("Camel class called.");
	}
}
class Deer extends Animal{
	public void deliver() {}
}
class Donkey extends Animal implements Transport{
	public void deliver() {
		System.out.println("deliver method called from Donkey class.");
	}
	Donkey(){
		System.out.println("Donkey class called.");
	}
}
public class Program4 {
	public static void main(String[] args){
		Transport[] t=new Transport[4];
		t[1]=new Camel();
		t[1].deliver();
		t[2]=new Donkey();
		t[2].deliver();
	}
}
