package patterns;

/* 

12345
1234
123
12
1

*/


public class Pattern6 {

    public static void print(int n){

        for (int i = 0; i < n ; i++){
            for (int j = 0 ; j < n-i ; j++){

                System.out.print(j+1);

            }
            System.out.println("");
        }
    }

    public static void main(String[] args){

        int n = 5;

        print(n);
    }
    
}
