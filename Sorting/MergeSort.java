package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class MergeSort {

    public static void mergeSortHelper(int a[],int low,int high){
    
    if ( low >= high){
        return;
    }

     int mid = (low + high) / 2;

     mergeSortHelper(a, low, mid);
     mergeSortHelper(a, mid+1, high);
     merge(a,low,mid,high);

}
   public static void merge(int a[],int low,int mid,int high){

    List<Integer> temp = new ArrayList<>();

    int left = low;
    int right = mid + 1;

    while (left <= mid && right <= high){

        if (a[left] <= a[right]){
            temp.add(a[left]);
            left++;
        }
        else {
            temp.add(a[right]);
            right++;
        }
    }
    while (left <= mid) {
            temp.add(a[left]);
            left++;
        }

        // Adding the remaining elements of right half
        while (right <= high) {
            temp.add(a[right]);
            right++;
        }
      for (int i = low; i <= high;i++){
        a[i] = temp.get(i - low);
      }
   }

    public static int[] mergeSort(int[]a){

        int n = a.length;

        mergeSortHelper(a,0,n-1);

        return a;
    }

     public static void main(String[] args){

        int a[] = {8,4,5,6,2,3};

      int result[]  = mergeSort(a);

      System.out.print(Arrays.toString(mergeSort(result)));
    }
    
}
