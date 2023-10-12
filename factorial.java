public class Factorial {
    public static void main(String[] args) {
        int n = 5; // Change this to calculate factorial of a different number
        int factorial = calculateFactorial(n);

        System.out.println(n + "! = " + factorial);
    }

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
