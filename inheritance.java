package feb;

import java.util.Scanner;

class Employee {
	String name, address;
	int age;
	long phno;
	double salary;

	void printSalary() {
		System.out.println("salary of employee is " + salary);
	}
}

class Officer extends Employee {
	String Specialization;
}

class Manager extends Employee {
	String Department;
}

public class inheritance {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("officer details:");
		Officer o = new Officer();
		System.out.println("enter name:");
		o.name = s.next();
		System.out.println("enter address:");
		o.address = s.next();
		System.out.println("enter age:");
		o.age = s.nextInt();
		System.out.println("enter phno:");
		o.phno = s.nextLong();
		System.out.println("enter salary:");
		o.salary = s.nextDouble();
		System.out.println("enter specialization:");
		o.Specialization = s.next();

		Manager m = new Manager();
		System.out.println("Manager details:");
		System.out.println("enter name:");
		m.name = s.next();
		System.out.println("enter address:");
		m.address = s.next();
		System.out.println("enter age:");
		m.age = s.nextInt();
		System.out.println("enter phno:");
		m.phno = s.nextLong();
		System.out.println("enter salary:");
		m.salary = s.nextDouble();
		System.out.println("enter department:");
		m.Department = s.next();

		System.out.println("Officer Details is:");
		System.out.println("name is :" + o.name);
		System.out.println("address is:" + o.address);
		System.out.println("age is:" + o.age);
		System.out.println("phno is:" + o.phno);
		System.out.println("salary is:" + o.salary);
		System.out.println("specialisation is:" + o.Specialization);
		o.printSalary();

		System.out.println("\nManager Details is:");
		System.out.println("name is :" + m.name);
		System.out.println("address is:" + m.address);
		System.out.println("age is:" + m.age);
		System.out.println("phno is:" + m.phno);
		System.out.println("salary is:" + m.salary);
		System.out.println("department is:" + m.Department);
		m.printSalary();
	}
}
