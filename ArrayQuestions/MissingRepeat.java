package ArrayQuestions;

import java.util.Arrays;

public class MissingRepeat {

    public static int[] findNumber(int[] nums){

        long n = nums.length;

        long SN = ( n * ( n + 1)) / 2;

        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        long sum = 0;
        long sum2 = 0;

        for (int i = 0; i < n; i++){

            sum += nums[i];
            sum2 += (long) nums[i] * (long) nums[i]; 
        }
        long val1 = sum - SN;

        long val2 = sum2 - S2N;

        val2  = val2 / val1;

         long x = (val1 + val2) / 2;
        long y = x - val1;

         return new int[]{(int) x, (int) y};
    }

    public static void main(String[] args){

        int nums[] = {3, 5, 4, 1, 1};

       int[] result =  findNumber(nums);

       System.out.println(Arrays.toString(result));
    }
    
}
