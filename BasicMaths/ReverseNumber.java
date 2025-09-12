package BasicMaths;

public class ReverseNumber {

    public static int reverseNumber(int n){

        int res = 0;

        while ( n != 0){
           int rem = n % 10;
           res = (res * 10) + rem;
              n = n / 10;    
        }
        return res;

    }

    public static void main(String[] args){

        int n = 13487;

      int result = reverseNumber(n);

      System.out.println(result);

    }
    
}
