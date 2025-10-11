package ArrayQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int nums[],int target){
       
        Map<Integer,Integer> hmap = new HashMap<>();

            int n = nums.length;

            for (int i = 0; i < nums.length;i++){
                
                int num = nums[i];
                
                int moreNeeded = target - num;

                if (hmap.containsKey(moreNeeded)){
                    return new int[] {hmap.get(moreNeeded),i};
                }
                hmap.put(num,i);
            }
              return new int[] {-1,-1};
                }    

    public static void main(String[] args){

        int nums[] = {1,6,2,10,3};
        int target = 7;

      int[] result  =  twoSum(nums,target); 
      
      System.out.println(Arrays.toString(result));
    }
    
}
