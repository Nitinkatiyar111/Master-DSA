package Recursion.ImplementationProblems;


public class SumByK {

    public static boolean solve(int i,int n, int[]a, int k){

        if (k == 0){
            return true;
        }
        if (k < 0 ){
            return false;
        }
        if ( i == n){
            return k == 0;
        }
        return solve(i + 1,n ,a, k - a[i]) || solve(i + 1, n, a, k);
    }

    public static boolean checkSubsequenceSum(int[] nums, int target){
    int n = nums.length;
    return solve(0,n,nums,target);
}


    public static void main(String[] args){

        int[] nums = {1,2,3,4};
        int target = 5;
        
        System.out.println(checkSubsequenceSum(nums,target));
    }
    
}
