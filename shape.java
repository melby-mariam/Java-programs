package feb;

abstract class Shape1 {
	abstract void noOfSides();
	abstract void sumOfAngles();
}
class Rectangle extends Shape1 {
	int side;
	Rectangle(int side) {
		this.side=side;
	}
	void noOfSides() {
		System.out.println("I am rectangle,I have "+side+" sides");
	}
	void sumOfAngles() {
		System.out.println("sum of angle is "+(side-2)*180);
	}
}
class Triangle extends Shape1 {
	int side;
	Triangle(int side) {
		this.side=side;
	}
	void noOfSides() {
		System.out.println("I am Triangle,I have "+side+" sides");
	}
	void sumOfAngles() {
		System.out.println("sum of angle is "+(side-2)*180);
	}
}
class Hexagon extends Shape1 {
	int side;
	Hexagon(int side) {
		this.side=side;
	}
	void noOfSides() {
		System.out.println("I am Hexagon,I have "+side+" sides");
	}
	void sumOfAngles() {
		System.out.println("sum of angle is "+(side-2)*180);
	}
}
public class shape {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(4);
		r.noOfSides();
		r.sumOfAngles();
		
		Triangle t=new Triangle(3);
		t.noOfSides();
		t.sumOfAngles();
		
		Hexagon h=new Hexagon(6);
		h.noOfSides();
		h.sumOfAngles();
	}
}
