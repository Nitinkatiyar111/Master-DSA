package patterns;

/* 

    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

*/


public class Pattern17 {

    public static void print(int n){

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++){
                System.out.print(ch);
                if (j <= breakpoint)
                     ch++;
                     else
                     ch--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        int n = 5;

        print(n);


    }
    
}
