class TestConstants {
    public static void main(String[] args) {
	final int NUM_COUNT = 10; // final keyword cannot be changed, just like a const.
	int[] a1 = new int[NUM_COUNT];
	// Final method means it cannot be overriden by subclass.
	// Final parameters are like const parameters.
	// Often if you have a constant it would be a class member, so use static final.
    }
}
