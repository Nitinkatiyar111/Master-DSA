package BasicMaths;

public class PerfectNumber {

    public static boolean isPerfect(int n) {
        int sum = 0;

        // Iterate only up to n/2 (divisors cannot be greater than half of n)
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 6;
        boolean result = isPerfect(n);
        System.out.println(result); // Prints false for 123
    }
}
