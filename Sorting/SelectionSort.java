package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] a){

        for (int i = 0; i < a.length - 1; i++){
            int minIndex = i;

        for (int j = i + 1; j < a.length; j++){

            if (a[j] < a[minIndex]){
                minIndex = j;
            }

        }
        if (minIndex != i){
            int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
        }
        }
        return a;

    }

    public static void main(String[] args){

        int a[] = {8,4,5,6,2,3};

      int result[]  = selectionSort(a);

      System.out.print(Arrays.toString(selectionSort(result)));
    }
    
}
