class Point {
    protected int x, y;
    public Point() {
	x = y = 0;
    }
    public Point(int a, int b) {
	x = a;
	y = b;
    }
}

class ColorPoint extends Point {
    protected String color;
    public ColorPoint() {
	// No need to explicitly calll parent class constructor.
	color = "red";
    }
    public ColorPoint(int a, int b) {
	super(a, b);
	color = "red";
	// Could also use this(a, b, "red").
    }
    public ColorPoint(int a, int b, String clr) {
	super(a, b);
	color = clr;
    }
}
