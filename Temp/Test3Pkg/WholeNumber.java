package Test3Pkg;

public class WholeNumber implements Expression {
    private int value;
    public WholeNumber(int _v) {
	value = _v;
    }
    public int evaluate() { return this.value; }
    // The @Override keyword tells the compiler that this function will override parent.
    // If it somehow is NOT an override, the compiler will catch your error! Nice.
    @Override
    public boolean equals(Object ob) {
        boolean toReturn;
	if (ob == null) { return false; }
	if (ob instanceof WholeNumber) {
	    WholeNumber that = (WholeNumber) ob;
	    toReturn = (this.value == that.value);
	} else {
	    toReturn = false;
	}
	return toReturn;
    }

    @Override
    public String toString() {
	Integer temp = new Integer(value);
	return (temp.toString());
    }
    public String toString1() {
	return String.valueOf(this.value);
    }
}
