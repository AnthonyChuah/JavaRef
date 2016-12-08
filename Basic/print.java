// Java scripts to demonstrate use of print and println and printing to stdout.

// Source code files: .java
// Byte code files: .class
// Compile .java to .class: javac print.java
//   This creates a bytecode file Test.class
// Interpret .class: java Test

class Test {
    public static void main (String [] args)
    {
	System.out.println("Hello world!");
	System.out.print("Hello ");
	System.out.print("world!\n");
	int x = 10;
	int y = 15;
	System.out.println("x: " + x + "\ny: " + y);
	System.out.println("x + y: " + (x + y));
    }
}
