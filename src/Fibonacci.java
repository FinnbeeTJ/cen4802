/**
 * A class to demonstrate the Fibonacci sequence calculation.
 */
class Fibonacci {

    /**
     * Recursively calculates the nth term of the Fibonacci sequence.
     * The sequence starts with F(0) = 0 and F(1) = 1.
     *
     * @param n The term number to calculate (e.g., n=10 for the 10th term).
     * @return The nth term in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * The main method to run the Fibonacci calculation.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}