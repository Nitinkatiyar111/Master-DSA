package BasicMaths;

public class LCM {

    public static int lcm(int n1,int n2){

        int lcm;
        
        int n = Math.max(n1,n2);
        int i  = 1;

        while (true){
            int mul = n * i;

            if (mul % n1 == 0 && mul % n2 == 0){
                lcm = mul;
                break;
            }
            i++;
        }
        return lcm;
    
    }

    public static void main(String[] args){

        int n1 = 4;
        int n2 = 6;

       int result =  lcm(n1,n2);

       System.out.println(result);
    }
    
}
