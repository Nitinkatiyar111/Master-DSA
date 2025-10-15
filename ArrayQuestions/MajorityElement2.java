package ArrayQuestions;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {

    public static List<Integer> majorityElement(int[] nums){

        int n = nums.length;

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++){

            if (result.size() == 0 || result.get(0) != nums[i]){

                int count = 0;

                for (int j = 0; j < n; j++){
                    if (nums[j] == nums[i]){
                        count++;

                    }
                }
                if (count > (n / 3)){
                    result.add(nums[i]);
                }
            }
            if (result.size() == 2){
                break;
            }
        }
        return result;
        
    }

    public static void main(String[] args){

        int nums[] = {1, 2, 1, 1, 3, 2};

      List<Integer> ans = majorityElement(nums);

          for (int it : ans){
            System.out.print(it + " ");
          }
          System.out.println();
    }
       
}
