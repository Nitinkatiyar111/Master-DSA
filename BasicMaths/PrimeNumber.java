package BasicMaths;

public class PrimeNumber {

    public static boolean primeNumber(int n){

        // edge
        if (n < 2) return false;

        for (int i = 2; i < n; ++i){

            if (n % i == 0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args){

        int n  = 7;

       boolean result =  primeNumber(n);

       System.out.println(result);

    }
    
}
