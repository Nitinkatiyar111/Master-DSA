package patterns;

/*
E 
D E 
C D E 
B C D E 
A B C D E
 */

public class Pattern18 {

    public static void print(int n){
        for (int i = 0 ; i < n; i++){
            for (char ch = (char)(('A'+n-1)-i);ch <= ('A' + n-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args){
           
        int n = 5;
        
        print(n);


    }
    
}
