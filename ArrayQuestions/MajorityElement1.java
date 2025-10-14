package ArrayQuestions;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement1 {

    public static int majorityElement(int[] nums){

        int n = nums.length;

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for (int num : nums){
            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : hmap.entrySet()){
            if (entry.getValue() > n / 2){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int nums[] = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int result =  majorityElement(nums);

        System.out.print(result);
    }
    
}
