class Test {
    public static void main(String[] args) {
	// Constructing new Strings.
	// String S1 = "hello",
	    // S2 = new String("bye"),
	    // S3 = new String(S1);
	// Concatenates strings.
	String S1 = "hello" + "bye",
	    S2 = S1 + "!",
	    S3 = S1 + 10; // int 10 will be coerced to String because other operand is String
	System.out.println(S1);
	System.out.println(S2);
	System.out.println(S3);

	int S1len = S1.length();
	char S1charAt3 = S1.charAt(3);
	int compareS2S3 = S2.compareTo(S3);
	boolean equalS2S3 = S2.equals(S3);
	System.out.println("S1 length is " + S1len);
	System.out.println("S2 char at index 3 is " + S1charAt3);
	System.out.println("compareS2S3 is " + compareS2S3);
	System.out.println("equalS2S3 is " + equalS2S3);
    }
}
