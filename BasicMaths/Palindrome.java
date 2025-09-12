package BasicMaths;

public class Palindrome{

    public static void palindrome(int n){

        int res = 0;
        int temp = n;

        while ( n != 0){
           int rem = n % 10;
           res = (res * 10) + rem;
              n = n / 10;    

    }
    if (res == temp)
        System.out.println("number is a palindrome number");
    else
       System.out.println("number is not a palindrome number");
}

    public static void main(String[] args){

        int n = 121;

      palindrome(n);


    }

}