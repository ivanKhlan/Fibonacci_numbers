/**
 * complexity	recursive
 * time	         O(2^n)
 * space	     O(n)
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
