package LabPractiseQues;

import java.util.Scanner;

	class ComputeAverage {
		double n1,n2,n3,average;
			
			void average() {
				average=(n1+n2+n3)/3;
				System.out.println("The average is: "+average);
			}
		}

		public class ComputeAverageDemo {
			
			public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				
				ComputeAverage obj=new ComputeAverage();
				
				System.out.println("Enter the three numbers: ");
				obj.n1=s.nextDouble();
				obj.n2=s.nextDouble();
				obj.n3=s.nextDouble();
				
				obj.average();
				
				s.close();
			}
		}

	


