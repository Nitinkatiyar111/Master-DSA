package CodeForces;

import java.util.Scanner;

public class Watermalon{

    public static String solve(int w){

        if (w % 2 == 0 && w > 2 ){
            return "YES";
        }
        else return "NO";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int w = sc.nextInt();
      String result = solve(w);
        System.out.println(result);

    }
}
