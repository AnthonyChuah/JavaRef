/*
Java classes contain fields and methods. A field is like a C++ data member, and a method is like a C++ member function.
Each field and method has an access level:
private: accessible only in this class
(package): accessible only in this package
protected: accessible only in this package and in all subclasses of this class
public: accessible everywhere this class is available
Similarly, each class has one of two possible access levels:
(package): class objects can only be declared and manipulated by code in this package
public: class objects can be declared and manipulated by code in any package
Note: for both fields and classes, package access is the default, and is used when no access is specified.
*/

class List {
    // Fields.
    private Object [] items; // Stores ANY object in an array of objects.
    private int nitems; // Number of items in the list.
    // Methods.
    public List() {
	items = new Object[10];
	nitems = 0;
    }
    public void append(Object _add) {
	// Code to append to the end of a list.
    }
}
