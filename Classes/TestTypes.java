class Test {
    static void Swap(Integer j, Integer k) {
	int tmp = k.intValue();
	k = new Integer(j.intValue());
	j = new Integer(tmp);
    }
    static String Reverse(String S) {
	String newS = "";
	for (int i = 0; i < S.length(); i++) {
	    newS = S.charAt(i) + newS;
	}
	return newS;
    }
    public static void main(String[] args) {
	Integer n = new Integer(5), m = new Integer(6);
	Swap(n, m);
	System.out.println("n = " + n + "; m = " + m);
	String S = "hello";
	S = Reverse(S);
	System.out.println(S);
    }
}

/*
The person who wrote this program expected the output to be: n = 6; m = 5. However, the actual output is: n = 5; m = 6. Explain why.
When function call Swap(5, 6) happens, inside the function scope k is created on the heap using the Integer
constructor with the VALUE of 5.
j gets a new Integer on the heap using the value 6.
j and k are passed by value, not by reference.
*/
