class Test {
    public static void main() {
	/*
	  Use these "wrapper" classes when you need an Object. For example, think about the List class. Suppose you try this:

         List L = new List();
	 L.AddToEnd( 10 );
	 Instead you must use:
	*/
	List L = new List();
	L.AddToEnd( new Integer(10) );
	// An object version exists for Boolean, Integer, and Double.
	L.firstElement();
	Integer K = (Integer) L.nextElement(); // Cast the Object returned to Integer.
	int x = K.intValue(); // To extract the primitive.
	Boolean B = new Boolean(true);
	boolean b = B.boolValue();
	int maxValue = K.MAX_VALUE; // Gives you the INT_MAX.
    }
}
