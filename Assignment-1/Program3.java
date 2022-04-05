abstract class Vegetable{
	public String clr;
}
class Potato extends Vegetable{
	public String toString() {
		clr = "white";
		return ("Veg: Potato, color->"+clr);
	}
}
class Brinjal extends Vegetable{
	public String toString() {
		clr = "Purple";
		return ("Veg: Brinjal, color->"+clr);
	}
}
class Tomato extends Vegetable{
	public String toString() {
		clr = "Red";
		return ("Veg: Tomato, color->"+clr);
	}
}
public class Program3 {
	public static void main(String[] args){
		Potato p=new Potato();
		Brinjal b=new Brinjal();
		Tomato t = new Tomato();
		
		System.out.println(p.toString());
		System.out.println(b.toString());
		System.out.println(t.toString());
	}
}
