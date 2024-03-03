package dataStructors;

import java.util.Scanner;
public class mathClass {
	
	public static void main(String[] args) {
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y);
		System.out.println(z);
		
		z = Math.abs(y);
		System.out.println(z);
		
		z = Math.sqrt(10);
		System.out.println(z);
		
		z = Math.round(10);
		System.out.println(z);
		
		z = Math.floor(x);
		System.out.println(z);
		
		z = Math.ceil(x);
		System.out.println(z);
		
		double l1;
		double l2;
		double hip;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		l1 = scanner.nextDouble();
		
		System.out.println("Enter side y: ");
		l2 = scanner.nextDouble();
		
		hip = Math.sqrt((l1*l1) + (l2*l2));
		
		System.out.println("Hypotenuse: "+hip);
		scanner.close();
	}
}
