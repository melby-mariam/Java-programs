package LabPractiseQues;
import java.util.Scanner;

class EmployeeInfo{
	String name,address;
	int year,salary;

	void display(){
	System.out.println("Name:"+name+"\tYear of joining:"+year+"\tSalary:"+salary+"\tAddress:"+address+"\n");
	
	}
}
	
public class EmployInfoDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		EmployeeInfo obj1=new EmployeeInfo();
		System.out.println("Enter the name: ");
		obj1.name=s.next();
		System.out.println("Enter the year of joining: ");
		obj1.year=s.nextInt();
		System.out.println("Enter the salary: ");
		obj1.salary=s.nextInt();
		System.out.println("Enter the address: ");
		obj1.address=s.next();
		
		EmployeeInfo obj2=new EmployeeInfo();
		System.out.println("Enter the name: ");
		obj2.name=s.next();
		System.out.println("Enter the year of joining: ");
		obj2.year=s.nextInt();
		System.out.println("Enter the salary: ");
		obj2.salary=s.nextInt();
		System.out.println("Enter the address: ");
		obj2.address=s.next();
		
		obj1.display();
		obj2.display();
		
		s.close();
	}	
}

		
		
		

	


