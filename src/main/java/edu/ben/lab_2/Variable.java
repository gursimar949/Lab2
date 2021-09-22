package main.java.edu.ben.lab_2;

public class Variable {

	public static void main(String[] args) {
		
		System.out.println("Arguments in the reverse order:");
		System.out.println();
		for (int i = args.length - 1; i >= 0; i--) {
			System.out.println(args[i]);
		}

		String st = "This is a String example.";

		boolean b = true;
		byte by = 1;
		short sh = 2;
		int i = 3;
		long l = 4l;
		float f= 5.0f;
		double d = 6.0d;
		char c1 = 'A';
		char c2 = 64;
		System.out.println();
		System.out.println("String and Primitive Types:");
		System.out.println();
		System.out.println("String: "+st);
		System.out.println("boolean: "+b);
		System.out.println("byte: "+by);
		System.out.println("short: "+sh);
		System.out.println("int: "+i);
		System.out.println("long: "+l);
		System.out.println("float: "+f);
		System.out.println("double: "+d);
		System.out.println("char: "+c1);
		System.out.println("char using number: "+c2);
	}

}
