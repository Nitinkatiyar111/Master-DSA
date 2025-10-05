package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeaderInArray {

    public static List<Integer> leaderInArray(int a[],int n){

        List<Integer> ans  =  new ArrayList<>();

        if (n == 0){
            return ans;
        }
        
        int max = a[a.length - 1];
        ans.add(a[a.length - 1]);
      
        for (int i = a.length - 2; i >= 0; i--){
          
            if (a[i] > max) {
                ans.add(a[i]);
                max = a[i];
            }
        }
        Collections.reverse(ans);

        return ans;


    }
    public static void main(String[] args){

        int a[] = {1, 2, 5, 3, 1, 2};
        int n = a.length;

        List<Integer> result = leaderInArray(a,n);

        for (int leader : result){
            System.out.print(leader + " ");
        }
        System.out.println();
    }
    
}
