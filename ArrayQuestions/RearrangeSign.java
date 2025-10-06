package ArrayQuestions;

import java.util.Arrays;

public class RearrangeSign {


    public static int[] rearrangeSign(int a[],int n){

        int[] ans = new int[n];

        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < n; i++){
            if (a[i] < 0){
                ans[negIndex] = a[i];

                negIndex += 2;
            }
            else{
                ans[posIndex] = a[i];

                posIndex += 2;
            }
        }
        return a;
    }

    public static void main(String[] args){

        int[] a = {2, 4, 5, -1, -3, -4};
        int n = a.length;

        int result[] = rearrangeSign(a,n);

        System.out.print(Arrays.toString(result));
    }


    
}
