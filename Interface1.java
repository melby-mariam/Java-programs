package feb;

import java.util.Scanner;

abstract class Animal {
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	public void walk() {
		
	}
	public void eat() {
		
	}
}
interface Pet {
	public String getName();
	public void setName(String name);
	public void play();
}
class Spider extends Animal {
	
	public Spider() {
		super(8);
}
	public void eat() {
		System.out.println("Spider eat insects");
	}
	public void walk() {
		System.out.println("This animal walk by "+legs+" legs");
	}
	
}
class Cat extends Animal implements Pet{
	String name;
	
	public Cat(String name) {
		super(4);
		this.name=name;
	}
	public Cat() {
		super(4);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void play() {
		System.out.println("Cat play with rats");
	}
	public void eat() {
		System.out.println("Cat eats fish");
		
	}public void walk() {
		System.out.println("This animal walk by "+legs+" legs");
	}

}
class Fish extends Animal implements Pet{
	String name;
	
	public Fish() {
		super(0);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void play() {
		System.out.println("Fish play with rats");
	}
	public void walk() {
		System.out.println("Fish has no legs");
	}
	public void eat() {
		System.out.println("Fish eats plants");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("\nFISH");
		Fish d=new Fish();
		d.setName("Mimi");
		System.out.println("This Fish's name is "+d.getName());
		d.eat();
		d.walk();
		d.setName("Momo");
		System.out.println("This Fish's name is "+d.getName());
		
		System.out.println("\nCAT");
		Cat c=new Cat("Fluffy");
		System.out.println("This cat's name is "+c.getName());
		c.walk();
		c.play();
		c.eat();
		c.setName("Moose");	
		System.out.println("This cat's name is "+c.getName());
		
		System.out.println("\nSPIDER");
		Spider sp=new Spider();
		sp.eat();
		sp.walk();
		
		}
}

