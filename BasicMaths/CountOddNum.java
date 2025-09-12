package BasicMaths;

public class CountOddNum {

    public static int countOddDigits(int number){

        int count = 0;

        while ( number != 0){
           int rem = number % 10;

           if (rem % 2 != 0) count++;
              
               number = number / 10;
        }


        return count;
    }

    public static void main(String[] args){

        int number = 101;

       int result = countOddDigits(number);

       System.out.println(result);

    }
    
}
