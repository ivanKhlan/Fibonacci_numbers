/**
 * complexity	iterative	recursive	dynamic programming
 * time	          O(n)	    O(2^n)	        O(n)
 * space	      O(1)	    O(n)	        O(n)
 */
public class RecursiveProgramming {
    public static long fibonacci(int n) {


        if (n <= 1) {
            
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        long result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
