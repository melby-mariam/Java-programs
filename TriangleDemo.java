package LabPractiseQues;

import java.util.Scanner;

class Triangle {
	double s,s1,s2,s3,area,perimeter;
	
	void area() {
		s=((s1+s2+s3)/2);
		area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("The area of Triangle is: "+area);
	}
        void perimeter() {
        	perimeter=s1+s2+s3;
        	System.out.println("The perimeter of Triangle is: "+perimeter);
        }
}

public class TriangleDemo {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		Triangle obj=new Triangle();
		System.out.println("Enter the three sides of Triangle: ");
		obj.s1=s.nextDouble();
		obj.s2=s.nextDouble();
		obj.s3=s.nextDouble();
		
		obj.perimeter();
		obj.area();
		
		s.close();
	}
}















