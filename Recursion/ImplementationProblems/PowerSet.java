package Recursion.ImplementationProblems;

import java.util.*;

public class PowerSet {

    public static void backTrack(int index, int n, int nums[], List<Integer> current, List<List<Integer>> ans){

        // Base case

        if (index == n){
            ans.add(new ArrayList<>(current));
            return;
        }

        // Exclude the current element

        backTrack( index + 1, n, nums, current, ans);

        // Include the current element

        current.add(nums[index]);
        backTrack(index + 1, n, nums, current, ans);

        current.remove(current.size() - 1);

    }

    public static List<List<Integer>> powerSet(int[] nums){

        List<List<Integer>> ans = new ArrayList<>(); 
        List<Integer> current = new ArrayList<>();

        backTrack(0,nums.length,nums,current,ans);
        return ans;
    }

    public static void main(String[] args){

        int nums[] = {1,2,3};

        List<List<Integer>> result = powerSet(nums);

        for (List<Integer> subset : result){
            System.out.println(subset);
        }

    }
    
}
