package feb;

import java.util.Scanner;

class Area {
	double triHeight,triBase,trapLength,trapBase,trapHeight,radius;
	float recWidth,recLength;
	
	void Calculatearea(double triBase,double triHeight) {
		System.out.println("area of triangle is:"+(0.5*triHeight*triBase));
	}
	void Calculatearea(float recWidth,float recLength) {
		System.out.println("area of rectangle is:"+(recWidth*recLength));
	}
	void Calculatearea(double radius) {
		System.out.println("area of circle is:"+(3.14*radius*radius));
	}
	void Calculatearea(double trapLength,double trapBase,double trapHeight) {
		System.out.println("area of trapezium is:"+(0.5*trapHeight*(trapLength+trapBase)));
	}
}

public class overload {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Area shape=new Area();
		System.out.println("enter the base,height of triangle:");
		shape.triBase=s.nextDouble();
		shape.triHeight=s.nextDouble();
		
		System.out.println("enter the width,length of rectangle::");
		shape.recWidth=s.nextFloat();
		shape.recLength=s.nextFloat();
		
		System.out.println("enter the radius of circle:");
		shape.radius=s.nextDouble();
		
		System.out.println("enter the length,base,height of trapezium:");
		shape.trapLength=s.nextDouble();
		shape.trapBase=s.nextDouble();
		shape.trapHeight=s.nextDouble();
		
		shape.Calculatearea(shape.triBase,shape.triHeight);
		shape.Calculatearea(shape.recWidth,shape.recLength);
		shape.Calculatearea(shape.radius);
		shape.Calculatearea(shape.trapLength,shape.trapBase,shape.trapHeight);
	}
}
