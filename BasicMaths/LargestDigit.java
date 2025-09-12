package BasicMaths;

public class LargestDigit {

    public static int largestDigit(int n){

        int largestDigit = 0;

        while (n > 0){
            int lastDigit = n % 10;

             if ( lastDigit > largestDigit){
                largestDigit = lastDigit;

             }
             n = n / 10;
        }
         return largestDigit;
    }

    public static void main(String[] args){
          
        int n = 42348;

       int result =  largestDigit(n);

       System.out.println(result);


    }
    
}
