public class Test {
}
class Utils {
}

/*
File 1 (List.java) can access List, ListNode, NoNextItemException because in the same package.
File 2 (NoNextItemException.java) can access the same things for the same reason.
File 3 (Test.java) can access everything: ListPkg stuff, Test, Utils, and Test2.
File 4 (4.java) can also access the same as File 3.
*/

/*
You should have an import: import ListPkg.*;
Now suppose you try to use the thing inside the ListPkg.
The thing is not defined in your main file, in your main class.
So it looks for it in the ListPkg subdirectory.
Suppose that subdir contains List.java and ListNode.java, both part of the ListPkg package.
Assume that List.java uses ListNode.java class. If you compile just ListPkg/List.java, you get error.
Compiler will try to find ListNode.java in a ListPkg subdir of current dir, rather than looking at current dir.
Solutions:
1. Always compile package from parent directory.
2. Always compile all files in a package at the same time.
3. Make a circular link from package subdir to itself ???
*/
