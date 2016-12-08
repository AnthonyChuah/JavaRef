class ArrayTest {
    public static void main (String [] args) {
	int [] test1 = {1, 5, 2, 0, 3, 0, 6};
	int [] test2;
	test2 = new int [3];
	test2[0] = 2;
	test2[2] = 1;
	System.out.println("First array test1 {1, 5, 2, 0, 3, 0, 6} length: " + test1.length);
	System.out.println("Second array test2 length: " + test2.length);
	// I can now re-allocate new test2 of different size!
	test2 = new int [5];
	test2[0] = 1;
	System.out.println("Reallocated array test2 to new length of 5, verify: " + test2.length);
	// Now test the NonZeros function.
	int [] strip1 = NonZeros(test1);
	int [] strip2 = NonZeros(test2);
	// After stripping zeroes, we should have lengths of 5 and 1.
	System.out.println("Lengths should be 5 and 1, verify: " + strip1.length + " " + strip2.length);
	// Now demonstrate copying of arrays.
	int [] X, Y;
	X = new int [10];
	X[0] = 5; X[3] = 3; X[6] = 10; X[8] = 19;
	Y = new int [5];
	System.arraycopy(A, 0, B, 0, 5); // Copies first 5 values from A to B.
	System.arraycopy(A, 9, B, 4, 1); // Copies last element from A into last element of B.
	// An array declaration is really making a POINTER. So when you assign raw arrays you are
	// really doing a pointer assignment. Example:
	int [] A1 = new int [3];
	int [] B1 = new int [2];
	A[0] = 5; // A --> {5, 0, 0}
	B = A; // A AND B --> {5, 0, 0}
	B[0] = 2; // Means that now A[0] is also 2! Exactly like a pointer.
	// In Java, all parameters are passed by value, but for arrays and classes, actually it is
	// passing a pointer.
	// Copying objects in C++ requires copy constructor. In Java, you use clone.
    }
    public static int[] NonZeros (int [] A) {
	int count_nonzero = 0;
	for (int i = 0; i < A.length; i++) {
	    if (A[i] != 0) {
		count_nonzero++;
	    }
	}
	int [] result;
	result = new int [count_nonzero];
	int j = 0;
	for (int i = 0; i < A.length; i++) {
	    if (A[i] != 0) {
		result[j] = A[i];
		j++;
	    }
	}
	return result;
    }
}
