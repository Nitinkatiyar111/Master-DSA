package ArrayQuestions;

import java.util.Arrays;

public class LeftRotateByOne{

    public static int[] leftRotateByOne(int[] a,int n){

        int temp = a[0];
        
        for (int i = 0; i < n-1; i++){
           
            a[i] = a[i+1];
        }
        a[n-1] = temp;

        return a;

    }

    public static void main(String[] args){

        int[] a = {1, 2, 3, 4, 5};

        int n = a.length;

      int[]  result = leftRotateByOne(a,n);

      System.out.println(Arrays.toString(result));

    }
}