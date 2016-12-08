// Loops are exactly the same as in C/C++.

class Test {
    public static void main (String [] args) {
	int sum = 0;
	for (int i = 1; i <= 10; i++) {
	    sum += i;
	}
	System.out.println("sum from 1 to 10: " + sum);
    }
}
