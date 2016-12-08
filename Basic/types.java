/*
 In Java, there are two "categories" of types: primitive types and reference types:

        Primitive Types
    boolean 	same as bool in C++
    char 	holds one character
    byte 	8-bit signed integer
    short 	16-bit signed integer
    int 	32-bit signed integer
    long 	64-bit signed integer
    float 	floating-point number
    double 	double precision floating-point number

        Reference Types
        arrays
        classes

Notes:

    no struct, union, enum, unsigned, typedef
    arrays and classes are really pointers!!


    In C++, when you declare an array, storage for the array is allocated. In Java, when you declare an array, you are really only declaring a pointer to an array; storage for the array itself is not allocated until you use "new":

                   C++                              

        int A[10];  // A is an array of length 10	    
        A[0] = 5;   // set the 1st element of array A
                                            

                  JAVA

        int [] A;          // A is a pointer to an array
        A = new int [10];  // now A points to an array of length 10
        A[0] = 5;          // set the 1st element of the array pointed to by A

    In both C++ and Java you can initialize an array using values in curly braces. Here's example Java code:

        int [] A = {1, 222, 0};  // A points to an array of length 3
                                 // containing the values 1, 222, and 0

    In Java, a default initial value is assigned to each element of a newly allocated array if no initial value is specified. The default value depends on the type of the array element:
    Type 	Value
    boolean 	false
    char 	'\u0000'
    byte, int, short, int, long, float, double 	0
    any pointer 	null

    In Java, an out-of-bounds array index always causes a runtime error.

    In Java, you can determine the current length of an array (at runtime) using ".length":

        int [] A = new int[10];
            ...  A.length ...        // this expression evaluates to 10
            A = new int[20];
            ...  A.length ...        // now it evaluates to 20


*/
