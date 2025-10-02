package ArrayQuestions;

import java.util.Arrays;

public class LeftRotateByK{

    public static int[] leftRotateByK(int[] a,int n,int k){
        
        // if k is greater than or equals to n
           k = k % n; 
           if (k == 0) {
            return a ;
           }
           int temp[] = new int[k];

           for (int i = 0 ; i < k; i++){
                temp[i] = a[i];
           }
           for (int i = k; i < n; i++) {
            a[i - k] = a[i];
        }

         for (int i = 0; i < k; i++) {
            a[n - k + i] = temp[i];
        }
        return a;

    }

    public static void main(String[] args){
      
        int a[] = {1, 2, 3, 4, 5, 6};
        int n = a.length;
        int k = 0;

       int[] result =  leftRotateByK(a,n,k);
        
       System.out.println(Arrays.toString(result));



    }
}