package BinarySearch;

import javax.swing.*;

public class SearchInRotatedArray {

    public static int search(int nums[],int k){

        int low = 0;
        int n = nums.length;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if mid points to the target
            if (nums[mid] == k) return mid;

            // Check if the left part is sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= k && k <= nums[mid]) {
                    // Target exists in the left sorted part
                    high = mid - 1;
                } else {
                    // Target does not exist in the left sorted part
                    low = mid + 1;
                }
            } else {
                // Check if the right part is sorted
                if (nums[mid] <= k && k <= nums[high]) {
                    // Target exists in the right sorted part
                    low = mid + 1;
                } else {
                    // Target does not exist in the right sorted part
                    high = mid - 1;
                }
            }
        }
        // If target is not found
        return -1;

    }
    public static void main(String[] args){

        int nums[] = {4,5,6,7,0,1,2};
        int k = 0;

      int result = search(nums,k);
        System.out.println(result);

      if (result == -1)
          System.out.println("Target is not present.");
      else
          System.out.println("Target is present");
      }
    }
