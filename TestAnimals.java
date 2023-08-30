package feb;

import java.util.Scanner;

abstract class Animal1 {
	protected int legs;
	protected Animal1(int legs) {
		this.legs=legs;
	}
	public void  walk() {
		
	}
	public void eat() {
		
	}
}
interface Pet1 {
	
	public String getName();
	public void setName(String name);
	public void play();
}

class Spider1 extends Animal1 {
	
	public Spider1() {
		super(8);
	}
	public void eat() {
		System.out.println("Spider eats insects");
	}
	public void walk() {
		System.out.println("This animal walk by "+legs+" legs");
	}
}

class Cat1 extends Animal1 implements Pet1 {
	String name;
	
	public Cat1(String name) {
		super(4);
		this.name=name;
	}
	public Cat1() {
		super(4);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void walk() {
		System.out.println("This animal walk by "+legs+" legs");
	}
	public void play() {
		System.out.println("Cat play with rats");
	}
	public void eat() {
		System.out.println("Cat eat fishes");
	}
}
	
class Fish1 extends Animal1 implements Pet1 {
		String name;
		
		public Fish1() {
			super(0);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public void eat() {
			System.out.println("Fish eat plants");
		}
		public void walk() {
			System.out.println("Fish has no legs");
		}
		public void play() {
			
		}
	}
	 
public class TestAnimals {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("\nFISH");
		Fish1 d=new Fish1();
		d.setName("Mimi");
		System.out.println("This Fish's name is "+d.getName());
		d.eat();
		d.walk();
		d.setName("Momo");
		System.out.println("This Fish's name is "+d.getName());
		
		System.out.println("\nCAT");
		Cat1 c=new Cat1("Fluffy");
		System.out.println("This cat's name is "+c.getName());
		c.walk();
		c.play();
		c.eat();
		c.setName("Moose");
		System.out.println("This cat's name is "+c.getName());
		
		System.out.println("\nSPIDER");
		Spider1 sp=new Spider1();
		sp.eat();
		sp.walk();
	}
}


