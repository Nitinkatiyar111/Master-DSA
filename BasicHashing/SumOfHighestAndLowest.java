package BasicHashing;

import java.util.HashMap;

public class SumOfHighestAndLowest {

    public static int sumHighestAndLowestFrequency(int a[]){

        int n = a.length;
        int maxFreq = 0, minFreq = n; 

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // Updating hashmap 
            mpp.put(a[i], mpp.getOrDefault(a[i], 0) + 1);
        }
            
        // Iterate on the map
        for (int freq : mpp.values()) {
            /* Update maximum and 
            minimum frequencies */ 
            maxFreq = Math.max(maxFreq, freq);
            minFreq = Math.min(minFreq, freq);
        }
        
        // Return the required sum
        return maxFreq + minFreq;
    }


    public static void main(String[] args){

        int a[] =  {1,2,2,3,3,3};

        int ans = sumHighestAndLowestFrequency(a);

        System.out.print(ans);
    }
    
}
