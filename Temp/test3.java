import Test3Pkg.*;
import java.util.Arrays;

class Test3 {
    public static final int SIZE = 16;
    public static void main(String[] args) {
	WholeNumber[] a1 = new WholeNumber[SIZE];
	WholeNumber specimen = new WholeNumber(0);
	for (int i = 0; i < SIZE; ++i) {
	    a1[i] = specimen;
	}
	System.out.printf("New array is %s\n", java.util.Arrays.toString(a1));
    }
    // An interface is like a class (but abstract): see Test3Pkg/Expression.java.
    // A child class of an abstract class must do IMPLEMENTS instead of EXTENDS.
    // Interfaces are usually a list of unimplemented methods.
    // You can have Multiple Inheritance from interfaces, but NOT from classes.
    // They can contain constants, static methods, and default methods.
    // You CANNOT instantiate interfaces.
    // ChildClass implements Interface1, Interface2, Interface3, ... {}
}
