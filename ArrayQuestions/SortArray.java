package ArrayQuestions;

import java.util.Arrays;

public class SortArray {

    public static int[] sortArray(int nums[],int n){

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high){
            if (nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if (nums[mid] == 1){
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        return nums;
    }

    public static void main(String[] args){

        int nums[] = {1, 0, 2, 1, 0};
        int n = nums.length;

      int result[] = sortArray(nums,n);

      System.out.print(Arrays.toString(result));

    }
    
}
