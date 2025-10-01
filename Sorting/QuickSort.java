package Sorting;

public class QuickSort {

    public static int partition(int[] a,int low,int high){
      
        // selected first element as pivot

        int pivot  = a[low];

        int i = low;
        int j = high;

        while ( i < j) {
            while ( i < high && a[i] <= pivot){
                i++;
            }
            while (j > low && a[j] > pivot){
                j--;
            }
            if ( i < j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
        }
    }
    int temp = a[low];
        a[low] = a[j];
        a[j] = temp;
        return j;
        
    }


    public static void quickSortHelper(int[] a,int low,int high){
        if ( low < high) {
            int pIndex = partition(a,low,high);
            quickSortHelper(a, low, pIndex - 1);
            quickSortHelper(a, pIndex + 1, high);
        }
    }


    public static int[] quickSort(int[] a){
        quickSortHelper(a,0,a.length - 1);
        return a;
    }


    public static void main(String[] args){
        int[] a = {4, 6, 2, 5, 7, 9, 1, 3};

      int[] sortArr =  quickSort(a);

      System.out.println("After Sorting Array: ");
        for (int num : sortArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    }
    
