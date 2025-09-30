package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int a[]){

        int n = a.length;

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n - i - 1; j++){

                if (a[j] > a[ j + 1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j + 1] = temp;
                }
            }
        }
      
        return a;

    }

     public static void main(String[] args){

        int a[] = {8,4,5,6,2,3};

      int result[]  = bubbleSort(a);

      System.out.print(Arrays.toString(bubbleSort(result)));
    }
    
}
    
