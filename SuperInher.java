package feb;

import java.util.Scanner;

class Employee2 {
	
double salary,DA,HRA,salary1;
	void display() {
		System.out.println(".....Employee.....");
}
	void calcSalary() {
		salary1=salary+((DA/100)*salary)+((HRA/100)*salary);
		System.out.println("Gross salary of Employee is:"+salary1);
	}
}
class Engineer extends Employee2 {
	Engineer(double salary,double DA,double HRA) {
		this.salary=salary;
		this.DA=DA;
		this.HRA=HRA;
	}
	void display() {
		super.display();
		super.calcSalary();
		System.out.println("......Enginner.....");
	}
	void calcSalary() {
		System.out.println("Gross salary of Engineer is:"+salary1*2);
	}
}

public class SuperInher {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Basic Salary of Employee:");
		double salary=s.nextDouble();
		System.out.println("Enter the DA% of Employee:");
		double DA=s.nextDouble();
		System.out.println("Enter the HRA% of Employee:");
		double HRA=s.nextDouble();
		
		Engineer obj1=new Engineer(salary,DA,HRA);
		obj1.display();
		obj1.calcSalary();

	}

}
