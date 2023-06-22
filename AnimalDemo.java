package lab22;

abstract class Animal {
	protected int legs;
	protected Animal(int legs){
		this.legs=legs;
	}
	public void walk() {


	}
	public abstract void eat();
	}

interface Pet {

	public String getName();

	public void setName(String name);

	public void play();
	}

class Spider extends Animal {
	Spider() {
		super(8);
	}
	public void eat() {
		System.out.println("Spider eat insects");
	}
	public void walk() {
		System.out.println("This animal walk by "+legs+" legs.");
	}
}

class Cat extends Animal implements Pet {
	String name;

	Cat(String name) {
		super(4);
		this.name=name;
	}
	public void walk() {
		System.out.println("This animal walk by "+legs+" legs.");
	}

	Cat() {
		this("");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public void play() {
		System.out.println("Cat plays with rats");
	}

	public void eat() {
		System.out.println("Cat eat fishes");
	}
}

class Fish extends Animal implements Pet {
	String name;

	Fish() {
		super(0);
	}

	public void eat() {
		System.out.println("Fish eat plants");
	}

	public void walk() {
		System.out.println("Fish has no legs.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name=name;
	}

	public void play() {

	}
}

public class AnimalDemo {

	public static void main(String[] args) {
		Fish d=new Fish();
		System.out.println("\nFISH");
		d.setName("Mimi");
		System.out.println("This Fish's name is "+d.getName());
		d.eat();
		d.walk();
		d.setName("Momo");
		System.out.println("This Fish's name is "+d.getName());

		Cat c=new Cat("Fluffy");
		System.out.println("\nCAT");
		System.out.println("This cat's name is "+c.getName());
		c.walk();
		c.play();
		c.eat();
		c.setName("Moose");
		System.out.println("This cat's name is "+c.getName());

		Spider s=new Spider();
		System.out.println("\nSPIDER");
		s.eat();
		s.walk();

	}

}




