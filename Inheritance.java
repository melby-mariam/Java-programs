package Internal;

import java.util.Scanner;

class Employee {
	String name,salary;
	void display() {
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);
	}
	
}
class Manager extends Employee {
	String department;
	void depart() {
		System.out.println("department:"+department);
	}
}
class Officer extends Employee {
	String specialization;
	void special() {
		System.out.println("specialization:"+specialization);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Manager m=new Manager();
		Officer o=new Officer();
System.out.println("enter the name of manager:");
Scanner s=new Scanner(System.in);
m.name=s.next();
System.out.println("enter the salary:");
m.salary=s.next();
System.out.println("enter the department:");
m.department=s.next();

System.out.println("enter the name of Officer:");
o.name=s.next();
System.out.println("enter the salary:");
o.salary=s.next();
System.out.println("enter the specialization:");
o.specialization=s.next();

System.out.println("\nManager");
m.display();
m.depart();

System.out.println("\nofficer");
o.display();
o.special();


	}

}
