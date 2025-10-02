package ArrayQuestions;

import java.util.Arrays;

public class MoveZero {

    public static int[] moveZero(int nums[],int n){

        int j = 0;

        for (int i = 0; i < n; i++){
            if (nums[i] != 0){
                    
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
          
        }
          return nums;
    }

    public static void main(String[] args){

        int nums[] = {0,1,4,0,5,2};

        int n = nums.length;

       int[] result =  moveZero(nums,n);

       System.out.print(Arrays.toString(result));
    }
    
}
