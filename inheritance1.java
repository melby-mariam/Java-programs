package feb;

import java.util.Scanner;

class Employee1 {
	String name, address;
	int age;
	long phno;
	double salary;

	void printSalary() {
		System.out.println("salary:" + salary);
	}

	void display() {
		System.out.println("name:" + name + "\n" + "age:" + age + "\n" + "ph:" + phno + "\n" + "address:" + address);
	}
}

class Officer1 extends Employee1 {
	String Specialization;
}

class Manager1 extends Employee1 {
	String Department;
}

public class inheritance1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("officer details:");
		Officer1 o = new Officer1();
		System.out.println("Enter name:");
		o.name = s.next();
		System.out.println("Enter address:");
		o.address = s.next();
		System.out.println("Enter age:");
		o.age = s.nextInt();
		System.out.println("Enter phno:");
		o.phno = s.nextLong();
		System.out.println("Enter salary:");
		o.salary = s.nextDouble();
		System.out.println("Enter specialization:");
		o.Specialization = s.next();

		Manager1 m = new Manager1();
		System.out.println("\nManager details:");
		System.out.println("Enter name:");
		m.name = s.next();
		System.out.println("Enter address:");
		m.address = s.next();
		System.out.println("Enter age:");
		m.age = s.nextInt();
		System.out.println("Enter phno:");
		m.phno = s.nextLong();
		System.out.println("Enter salary:");
		m.salary = s.nextDouble();
		System.out.println("Enter department:");
		m.Department = s.next();

		System.out.println("\nOfficer Details is:");
		o.display();
		o.printSalary();
		System.out.println("Specialisation:" + o.Specialization);

		System.out.println("\nManager Details is:");
		m.display();
		m.printSalary();
		System.out.println("Department:" + m.Department);
	}
}
