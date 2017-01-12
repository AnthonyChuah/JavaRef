package Test3Pkg;

public class ExpressionProg {
    public static void main(String[] args) {
	WholeNumber first = new WholeNumber(5);
	System.out.print("The first number is ");
	System.out.println(first);
	// This doesn't work.
	WholeNumber second = new WholeNumber(5);
	String equal = first == second ? "equal" : "not equal";
	System.out.printf("The first number is %s to the second.\n", equal);
	// Now this doesn't work too.
	// Both do not work because we haven't 'overloaded' the equality operator and toString method.
	equal = first.equals(second) ? "equal" : "not equal";
    }
}

/*
java.lang.Object
equals(Object): boolean
toString(): String
*/
