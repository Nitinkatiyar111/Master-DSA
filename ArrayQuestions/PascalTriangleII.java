package ArrayQuestions;

import java.util.Arrays;

public class PascalTriangleII {

    public static int[] pascalTriangleII(int r){
        int[] ans = new int[r];

        ans[0] = 1;

        for(int i = 1; i < r; i++){
            ans[i] = (ans[i-1] * (r - i)) / i;
        }
        return ans;
    }

    public static void main(String[] args){

        int r = 5;

        int[] result = pascalTriangleII(r);

        System.out.print(Arrays.toString(result));
    }
    
}
