package Internal;

import java.util.Scanner;

class Employee1 {
	double salary,DA,HRA,salary1;

void display() {
	System.out.println(".....Employee....");
}
void calcSalary() {
	 salary1=salary+((DA/100)*salary)+((HRA/100)*salary);
	 System.out.println("gross salary of the empoyee is :" +salary1);
}}
class Engineer extends Employee1 {
	Engineer(double salary,double DA,double HRA){
		this.salary=salary;
		this.DA=DA;
		this.HRA=HRA;
		
	}
	void display() {
		super.display();
		super.calcSalary();
		System.out.println("....Engineer....");
		
	}
	void calcSalary() {
		System.out.println("gross salary of the engineer is :" +salary1*2);
	}
	
}

public class SuperDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Basic Salary of the Employee:");
		double salary=s.nextDouble();
		System.out.println("Enter the DA% of Employee:");
		double DA=s.nextDouble();
		System.out.println("Enter the HRA% of Employee:");
		double HRA=s.nextDouble();

		Engineer e1=new Engineer(salary,DA,HRA); 
			e1.display();
			e1.calcSalary();
		
	}}


