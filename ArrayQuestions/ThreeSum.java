package ArrayQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums){

        Set<List<Integer>> tripletSet = new HashSet<>();

        int n = nums.length;

        for (int i = 0 ; i < n; i++){

            Set<Integer> hashset = new HashSet<>();

            for (int j = i + 1; j < n; j++){
                int third = -(nums[i] + nums[j]);
            
                if (hashset.contains(third)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);

                    Collections.sort(temp);
                    tripletSet.add(temp);
                }

                hashset.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(tripletSet);

        return ans;

    }

    public static void main(String[] args){

        int[] nums = {2, -1, -1, 3, -1};

        List<List<Integer>> ans = threeSum(nums);

        for (List<Integer> triplet : ans) {
            System.out.print("[");
            for (int num : triplet) {
                System.out.print(num + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
    
}
