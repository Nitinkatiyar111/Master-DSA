package BasicString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortFrequency {

    public static Character[] sortFrequency(String s){

        // count frequency of char
        Map<Character,Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }

        List<Character> chars = new ArrayList<>(freqMap.keySet());

        Collections.sort(chars,(a,b)->{
            int freqCompare = freqMap.get(b).compareTo(freqMap.get(a));
            if (freqCompare == 0){
                return a.compareTo(b);
            }
            return freqCompare;
        });
        return chars.toArray(new Character[0]);
    }

    public static void main(String[] args){

        String s = "tree";

        Character[] result = sortFrequency(s);
        System.out.println(Arrays.toString(result));
    }
    
}
