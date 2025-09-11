package patterns;

/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

 */

public class Pattern19 {

    public static void print(int n){

        int iniSpace = 0;

        for (int i = 0; i < n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            // space
            for(int j = 0; j < iniSpace; j++){
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            iniSpace += 2;

            System.out.println("");
        }
        iniSpace = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            // Printing the stars in the row.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Printing the spaces in the row.
            for (int j = 0; j < iniSpace; j++) {
                System.out.print(" ");
            }
            
            // Printing the stars in the row.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            iniSpace -= 2;
            
            System.out.println();

    }
}

    public static void main(String[] args){

        int n = 5;

        print(n);
    }
    
}
