package BasicHashing;

import java.util.HashMap;
import java.util.Map;

public class OccurancesInArray {

    public static int maxFrequentElement(int[] num){

        int n = num.length;

        int maxFreq = 0;

        int maxEle = 0;

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for (int i = 0 ; i < n ; i++){
            hmap.put(num[i],hmap.getOrDefault(num[i],0)+1);
        }
       
        //Iterate on the map

        for (Map.Entry<Integer,Integer> it : hmap.entrySet()){
               int freq = it.getValue();
               int ele = it.getKey();

               if (freq > maxFreq){
                maxFreq = freq;
                maxEle = ele;
               }
               else if ( freq == maxFreq){
                maxEle = Math.min(maxEle,ele);
               }
        }
        return maxEle;
    }

    public static void main(String[] args){

        int num[] = {1,2,2,2,3,3,3};

      int ans = maxFrequentElement(num);  
      
      System.out.println(ans);
      
    }
    
}
