interface GrandParent{
	void gp();
}
interface Parent1 extends GrandParent{
	void p1();
}
interface Parent2 extends GrandParent{
	void p2();
}
interface Child extends Parent1,Parent2{
	void c();
}
class Family implements Child {
	public void gp() {
		System.out.println("Method of GrandParent.");
	}
	public void p1() {
		System.out.println("Method of Parent1.");
	}
	public void p2() {
		System.out.println("Method of Parent2.");
	}
	public void c() {
		System.out.println("Method of Child.");
	}
}
public class Program2 {
	public static void main(String[] args) {
		Child f=new Family();
		f.gp();
		f.p1();
		f.p2();
		f.c();
	}
}