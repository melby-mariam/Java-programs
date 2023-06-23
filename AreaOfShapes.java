package lab22;
import java.util.Scanner;

class Area {
	double radius,triHeight,triBase,trapLength,trapHeight,trapBase;
	float recWidth,recHeight;
	
	void CalculateArea(double triBase,double triHeight) {
		System.out.println("\nArea of the triangle with base: "+triBase+" and height: "+triHeight+" is: "+(0.5*triBase*triHeight));
	}
	void CalculateArea(float recWidth,float recLength) {
		System.out.println("\nArea of the rectangle with width: "+recWidth+" and length: "+recHeight+" is: "+
				(recWidth*recLength));
	}
	void CalculateArea(double radius) {
		System.out.println("\nArea of the circle with radius: "+radius+" is: "+(3.14*radius*radius));
	}
	void CalculateArea(double trapLength,double trapBase,double trapHeight) {
		System.out.println("\nArea of Trapezium is: "+ ((trapBase+trapLength)*trapHeight)*0.5);
	}
}

public class AreaOfShapes {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		  
		  Area shape = new Area();
		  
		  System.out.println("Enter the Base of the Triangle :");
		  shape.triBase=s.nextDouble();
		  System.out.println("Enter the Height of the Triangle:");
		  shape.triHeight=s.nextDouble();
		  
		  System.out.println("Enter the width of the Rectangle:");
		  shape.recWidth=s.nextFloat();
		  System.out.println("Enter the Height of the Rectangle:");
		  shape.recHeight=s.nextFloat();
		  
		  
		  System.out.println("Enter the Radius of the Circle: ");
		  shape.radius=s.nextDouble();
		  
		  System.out.println("Enter the lengths of Parallel sides, height of the Trapezium: ");
		  shape.trapLength=s.nextDouble();
		  shape.trapBase=s.nextDouble();
		  shape.trapHeight=s.nextDouble();
		  
		   
		  shape.CalculateArea(shape.triBase,shape.triHeight);
		  shape.CalculateArea(shape.recHeight,shape.recWidth);
		  shape.CalculateArea(shape.radius);
		  shape.CalculateArea(shape.trapLength,shape.trapBase,shape.trapHeight);
		  
		  s.close();

	}

}
