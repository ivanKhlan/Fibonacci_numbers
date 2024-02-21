public class IterativeProgramming {

    public static long fibonacci(int n) {

        if (n >= 1) {
            int first = 0, second = 1;

            for (int i = 2; i <= n; i++) {
                int next = first + second;

                first = second;
                second = next;
            }

            return second;
        }
        return 1;
    }

    public static void main(String[] args) {
        int n = 10;
        long result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
