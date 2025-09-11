package patterns;

/* 

ABCDE
ABCD
ABC
AB
A

*/


public class Pattern15 {

    public static void print(int n){
         for (int i = 0; i < n; i++){

            for (char ch = 'A'; ch <= 'A'+(n-i-1); ch++){
                System.out.print(ch);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){

        int n = 5;

        print(n);

    }
    
}
