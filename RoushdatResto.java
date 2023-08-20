package assignment;
import java.util.Scanner;

interface Food {
	public void setType(String type);
	public double calculatePrice();
}

class Pizza implements Food {
	private String size;
	private String type;
	
	public void setSize(String size) {
		this.size=size;
	}
	
	public void setType(String type) {
		this.type=type;
		type=type.toUpperCase();
	}
	
	public double calculatePrice() {
		double price=0;
		if(size.equals("small")) {
			if(type.equals("veg"))
				price=80;
			else if(type.equals("nonveg"))
			price=125;
			else
				System.out.println("..Order not found..");
		} else if (size.equals("medium")) {
			if (type.equals("veg"))
				price = 175;
			else if (type.equals("nonveg"))
				price = 225;
			else
				System.out.println("..Order not found..");
		} else if (size.equals("large")) {
			if (type.equals("veg"))
				price = 250;
			else if (type.equals("nonveg"))
				price = 275;
			else
				System.out.println("..Order not found..");
		}
		return price;
	}
}

class Lasagne implements Food {
	private String type;
	
	public void setType(String type) {
		this.type=type;
		type=type.toUpperCase();
	}
	
	public double calculatePrice() {
		double price=0;
		if(type.equals("veg"))
			price=200;
		else if(type.equals("nonveg"))
			price=300;
		else
			System.out.println("..Order not found..");
	
		return price;
	}
}

public class RoushdatResto {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String size,typeP,typeL;
		
		System.out.println("..Welcome to Roushdat Resto..");
		
		Pizza P=new Pizza();
		Lasagne L=new Lasagne();
		
		System.out.println("Enter the size of the Pizza: ");
		size=s.next();
		System.out.println("Enter the type of the Pizza: ");
		typeP=s.next();
		System.out.println("Enter the type of Lasagne: ");
		typeL=s.next();
		
		P.setSize(size);
		P.setType(typeP);
		System.out.println("Price of Pizza: "+P.calculatePrice());
		
		L.setType(typeL);
		System.out.println("Prize of Lasagne: "+L.calculatePrice());
		
		 double Total=P.calculatePrice()+L.calculatePrice();
		 System.out.println("The Total Price is: "+Total);
		 
		 System.out.println("..Thankyou..");
		
	}

}
