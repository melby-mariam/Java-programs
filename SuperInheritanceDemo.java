package lab22;

import java.util.Scanner;

	class Employee02 {
		double salary,DA,HRA,salary1;
		
		void display() {
		System.out.println(".....Employee....");
		}
		void calcSalary() {
		salary1=salary+((DA/100)*salary)+((HRA/100)*salary);
		System.out.println("Gross Salary of Employee is : "+salary1);
		}
	}
	class Engineer extends Employee02 {

		Engineer(double salary,double DA,double HRA) {
			this.salary=salary;
			this.DA=DA;
			this.HRA=HRA;
		}
		void display() {
			super.display();
			super.calcSalary();
			System.out.println(".....Engineer.....");
		}
		void calcSalary() {
			System.out.println("Gross Salary of Engineer is : "+salary1*2);
		}
	}

	public class SuperInheritanceDemo {

		public static void main(String[] args) {
			//Author:Melby Mariam Chandy
			//S3 CSE-A
			//Roll no:36
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Basic Salary of the Employee : ");
			double salary=s.nextDouble();
			System.out.println("Enter the DA % of the Employee : ");
			double DA=s.nextDouble();
			System.out.println("Enter the HRA % of th Employee : ");
			double HRA=s.nextDouble();
			
			Engineer obj1=new Engineer(salary,DA,HRA);
			
			obj1.display();
			obj1.calcSalary();
			
			s.close();

		}
	}
	