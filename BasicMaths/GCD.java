package BasicMaths;

public class GCD {

    public static int gcd(int n1,int n2){

        int gcd  = 1;

        for (int i = 1; i <= Math.min(n1, n2); i++ ){

            if( n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }


        return gcd;
    }

    public static void main(String[] args){

        int n1 = 4;
        int n2 = 6;

        int result = gcd(n1,n2);
        
        System.out.println(result);
    }
    
}
