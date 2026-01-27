package Recursion;
import java.util.*;
public class GeneratePara {

    public static void generate(int open,int close,int n,String current,List<String> result){
     
        // Base case
        if (open == close && open + close == 2 * n){
            result.add(current);
            return;
        }
        if (open < n) {
            generate(open + 1, close, n, current + '(', result);
        }
        if (close < open){
            generate(open, close + 1, n, current + ')', result);
        }

    }

    public static List<String> generatePara(int n){

        List<String> result = new ArrayList<>();
        generate(0,0,n,"",result);
        return result;
    }

    public static void main(String[] args){

        int n = 3;
        
        List<String> result = generatePara(n);

        System.out.println("All the combination of balanced para for n = " + n + " are:");

        for (String combination : result){
            System.out.println(combination);
        }
    }
    
}
