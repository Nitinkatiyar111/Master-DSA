package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int a[]){

        // pick a element and place it at its correct place

        int n = a.length;

        for (int i = 0; i < n; i++){
          
            int j = i;

          while ( j > 0  && a[j-1] > a[ j]){
            int temp  = a[j-1];
               a[j-1] = a[j];
               a[j] = temp;

               j--;
          }
        }
        return a;

    }


    public static void main(String[] args){
        int a[] = {8,4,5,6,2,3};

      int result[]  = insertionSort(a);

      System.out.print(Arrays.toString(insertionSort(result)));
    }
    
}
