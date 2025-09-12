package BasicMaths;

public class ArmstrongNumber {

    public static boolean armstrongNumber(int n) {
        int count = countDigit(n);
        int sum = 0;

        int temp = n;

        while (n > 0) {
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit, count);
            n = n / 10;
        }

        return sum == temp;
    }

    private static int countDigit(int n) {
        if (n == 0) 
            return 1;
        return (int) Math.floor(Math.log10(n)) + 1;
    }

    public static void main(String[] args) {
        int n = 153;
        boolean result = armstrongNumber(n);
        System.out.println(result);
    }
}
