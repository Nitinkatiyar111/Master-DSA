package BasicRecursion;

public class PrimeNumber {

    public static boolean primeNumber(int n){

        // base case
        if (n == 0 || n == 1)
             return false;

        return prime(n,2);

    }
    public static boolean prime(int num,int x){
        if (x > Math.sqrt(num)){
            return true;
        }
        if (num % x == 0){
            return false;
        }
        return prime(num,x + 1);
    }

    public static void main(String[] args){
        
        int n = 4;

        System.out.println(primeNumber(n));
    }
    
}
