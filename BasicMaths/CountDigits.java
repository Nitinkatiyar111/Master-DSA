package BasicMaths;

public class CountDigits {

    public static int countDigit(int n){
        int count = 0;
        while (n > 0){

            count++;
            
            n = n / 10;
        }

            return count;
    }

    public static void main(String[] args){

        int n = 101;

       int result =  countDigit(n);

       System.out.println(result);
    }
    
}
