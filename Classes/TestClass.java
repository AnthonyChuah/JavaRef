class Test {
    static int staticVar;
    int nonstaticVar;

    public Test(int n, int m) {
	staticVar = n;
	nonstaticVar = m;
    }

    public static void main(String[] args) {
	Test t1 = new Test(10, 20); // the staticVar should be 10, other is 20.
	Test t2 = new Test(30, 40);
	System.out.print(t1.staticVar + " ");
	System.out.print(t1.nonstaticVar + " ");
	System.out.print(t2.staticVar + " ");
	System.out.println(t2.nonstaticVar);
    }
}

/*
Question 1: Which of the following is true?
    A. This program must be in a file called Test.java.  Compiling will create one
       new file called Test.class.
 X  B. This program can be in any .java file.  Compiling will create one new file
       called Test.class.
    C. This program must be in a file called Test.java.  Compiling will create two
       new files called Test.class and main.class.
    D. This program can be in any .java file.  Compiling will create two new files
       called Test.class and main.class.
 Question 2: Which of the following correctly describes what happens when the program is compiled and run?
    A. There will be a compile-time error because there is no constructor with no
       arguments.
    B. There will be a run-time error because there is no constructor with no
       arguments.
    C. There will be no errors; the output will be: 10 20 30 40
 X  D. There will be no errors; the output will be: 30 20 30 40
    E. There will be no errors; the output will be: 30 40 30 40
*/
