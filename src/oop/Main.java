package oop;

public class Main {
	public static void main (String[] argv) {
		Complex complex1 = new Complex();
		Complex complex2 = new Complex(3);
		Complex complex3 = new Complex(1, 2);
		
		// Print values
		System.out.println("1. Complex number 1: " + complex1);
		System.out.println("2. Complex number 2: " + complex2);
		System.out.println("3. Complex number 3: " + complex3);
		
		// Add and print
		complex1.add(13);
		System.out.println("4. line 1 added 13: " + complex1);
		complex2.add(complex3);
		System.out.println("5. line 2 added line 3: " + complex2);
		
		// Multiply and print
		complex1.multiply(2);
		System.out.println("6. line 4 multiplied by 2: " + complex1);
		complex2.multiply(complex3);
		System.out.println("7. line 5 multiplied by line 3: " + complex2);
		
		// Square and print
		complex1.square();
		System.out.println("8. line 6 squared: " + complex1);
		
		// Print norm
		System.out.println("Norm of line 8: " + complex1.norm());
	}
}