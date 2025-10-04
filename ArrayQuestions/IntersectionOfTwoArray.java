package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArray {

    public static int[] intersectionOfTwoArray(int nums1[],int nums2[]){
        List <Integer> ans = new ArrayList<>();
        int i = 0; 
        int j = 0;

        while ( i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                i++;
            }
            else if (nums2[j] < nums1[i]){
                j++;
            }
            else {
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result1 = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            result1[k] = ans.get(k);
      
    }
     return result1;

        
    }


    public static void main(String[] args){

        int nums1[] = {1, 2, 2, 3, 5};
        int nums2[] = {1,2,7};

        int result[] = intersectionOfTwoArray(nums1,nums2);

        System.out.print(Arrays.toString(result));
    }
    
}
