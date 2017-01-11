/*
EVERY class extends Object, the ultimate All-Father.
Commonly overridden methods:
1. toString: returns String representation of object. This is used by System.out.print to print object.
2. equals: overloaded equality comparison operator.
3. hashCode: for hashing.
4. clone: permits making a copy (shallow copy by default).
To permit cloning:
public class List implements Cloneable {
    private Object items[]; // A pointer field!
}
If you do not implements Cloneable, an attempt to clone will throw exception CloneNotSupportedException.

To do a deep copy, example for List:
*/

public class List implements Cloneable {
    private Object items[];
    public Object clone() {
	try {
	    List tmp = (List) super.clone(); // Cast to List after calling Cloneable's clone.
	    tmp.items = (Object[]) items.clone(); // Cast to Object array the clone of items.
	    return tmp;
	} catch (CloneNotSupportedException ex) {
	    throw new InternalError(ex.toString());
	}
    }
}

/*
Clone method is overridden, including changing its access to public instead of protected. So that users of List
class can clone Lists.
Every clone should first call super.clone() to create the right kind of object and copy its fields.
Return type of clone is Object. This needs casting to List to permit assignment into tmp.
super.clone() only does a SHALLOW copy of the items field.
Basically the new shallow copy has a pointer to the SAME ARRAY that the old object is pointing to!
So you want to make a completely new copy. Clone the items array, that makes a NEW heap-allocated array of the
same items.

OK now consider the following program:
*/

class Point {
    private int x, y;
    public String toString() {
	return "(" + x + ", " + y + ")";
    }
    public void SetPoint(int a, int b) {
        x = a; y = b;
    }
    public static void main(String[] args) {
	Point p1 = new Point();
	p1.SetPoint(10, 20);
	Point p2 = p1;
	p1.SetPoint(20, 30);
	System.out.println(p2);
    }
}

/*
Q1: What is printed? p2 is a SHALLOW copy of p1, so p2 basically points to p1. Prints (20, 30).
Q2: Write new version using cloning to copy. What would be printed? (10, 20).
Q3: What if the x and y are in an array of size 2? How to write deep copy?
*/

class Point implements Cloneable {
    private int x, y;
    public String toString() {
	return "(" + x + ", " + y + ")";
    }
    public void SetPoint(int a, int b) {
        x = a; y = b;
    }
    public static void main(String[] args) {
	Point p1 = new Point();
	p1.SetPoint(10, 20);
	Point p2 = p1;
	p1.SetPoint(20, 30);
	System.out.println(p2);
    }
    public Object clone() {
	try {
	} catch (CloneNotSupportedException ex) {
	}
    }
    // To assign p2 = p1, you need to do p2 = (Point) p1.clone(). This is to cast Object to Point.
}
