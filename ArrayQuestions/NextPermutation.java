package ArrayQuestions;

import java.util.Arrays;

public class NextPermutation {

    public static void  nextPermutation(int[] nums){

        int n = nums.length;

        int ind = -1;

        for (int i = n - 2; i >= 0; i--){
            if (nums[i] < nums[i + 1]){
                ind = i;
                break;
            }
        }
           if (ind == -1){
             reverse(nums,0,n-1);
             return;
           }

           for (int i = n - 1; i > ind; i-- ){
            if (nums[i] > nums[ind]){
                swap(nums,i,ind);
                break;
            }
           }
           reverse(nums, ind + 1, n - 1);
                return;

    }

    private static void swap(int[] nums,int i,int j){
          int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums,int start, int end){
         while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
    }
}

    public static void main(String[] args){

        int nums[] = {1,2,3};

        nextPermutation(nums);

        for (int x : nums){
            System.out.print(x + " ");
                }

    }
}