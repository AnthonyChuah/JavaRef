import java.util.Arrays;

class TestArrays {
    public static void main(String[] args) {
	int[] a1 = new int[8];
	System.out.printf("New array is %s\n", java.util.Arrays.toString(a1));
	// BOUNDS CHECKING of arrays is done at run-time, EVEN IF both indices and size are known at compile-time.
    }
}
