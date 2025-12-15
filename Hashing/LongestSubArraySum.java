package Hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArraySum {

    public static int longestSubArraySum(int[] a,int k){

        int n = a.length;

        Map<Integer,Integer> hmap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++){
            sum += a[i];

            if (sum == k){
                maxLen = Math.max(maxLen, i+1);
            }
            int rem = sum - k;

            if (hmap.containsKey(rem)){
                int len = i - hmap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
             if (!hmap.containsKey(sum)) {
                hmap.put(sum, i);
        }
    }
    return maxLen;
}

    public static void main(String[] args){

        int a[] = {10, 5, 2, 7, 1, 9};
        int k = 15;

       int result =  longestSubArraySum(a,k);

       System.out.println(result);
    }
    
}
