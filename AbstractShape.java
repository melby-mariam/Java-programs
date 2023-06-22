package lab22;

abstract class Shape {
	
	abstract void numberOfSides();
	abstract void SumOfAngle();
}

class Rectangle extends Shape {
	int side;
	Rectangle(int side) {
		this.side=side;
	}
	void numberOfSides() {
	System.out.println("I am Rectangle, I have "+side+" sides");
	}
	void SumOfAngle() {
	System.out.println("Sum of angle of Rectangle: "+(side-2)*180);
	}
}
    
class Triangle extends Shape {
	int side;
	Triangle(int side) {
		this.side=side;
	}
	void numberOfSides() {
	System.out.println("I am Triangle, I have "+side+" sides");
	}
	void SumOfAngle() {
	System.out.println("Sum of angle of Triangle: "+(side-2)*180);
	}
}

 class Hexagon extends Shape {
	int side;
	Hexagon(int side) {
		this.side=side;
	}
	void numberOfSides() {
	System.out.println("I am Hexagon, I have "+side+" sides");
	}
	void SumOfAngle() {
	System.out.println("Sum of angle of Hexagon: "+(side-2)*180);
	}
 }

public class AbstractShape {

	public static void main(String[] args) {
		Rectangle obj1=new Rectangle(4);
		Triangle obj2=new Triangle(3);
		Hexagon obj3=new Hexagon(6);
		
		obj1.numberOfSides();
		obj1.SumOfAngle();
		obj2.numberOfSides();
		obj2.SumOfAngle();
		obj3.numberOfSides();
		obj3.SumOfAngle();
		
	}
}

