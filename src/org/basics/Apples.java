package org.basics;

public class Apples {
	
	public static int totalnoofApples(double danielApples, double amberApples) {
		 return (int) (danielApples+amberApples);

	}
	public static void main(String[] args) {
		
		System.out.println("Total number of apples = " + totalnoofApples(3, 2));
		System.out.println("Total number of apples = " + totalnoofApples(3.5, 2.5));
	}
}
	
	
	
	
	
	/*public static void main(String[] args) {
		int D = 3, A = 2, Total ;
		Total = D + A;
		System.out.println("Total number of apples = " + Total);
		
		double d = 3.5, a = 2.5, total;
		total = d + a;
		System.out.println("Total number of apples together = " + total);
	}
}*/
