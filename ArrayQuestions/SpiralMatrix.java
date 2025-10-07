package ArrayQuestions;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralMatrix(int[][] a){

    List<Integer> result = new ArrayList<>();
     
    int n = a.length;
    int m = a[0].length;

    int top = 0;
    int left = 0;
    int bottom = n - 1;
    int right = m - 1;

    while (top <= bottom && left <= right){
        for (int i = left; i <= right; ++i){
         
            result.add(a[top][i]);
        }
        top++;

        for (int i = top; i <= bottom; ++i){
            result.add(a[i][right]);
        }
        right--;
        if (top <= bottom){
            for (int i = right; i >= left; --i){
                result.add(a[bottom][i]);
            }
            bottom--;
        }
        if (left <= right){
            for (int i = bottom; i >= top; --i){
                result.add(a[i][left]);
            }
            left++;
        }
    }
    return result;


    }
    

    public static void main(String[] args){

        int[][] a = {{1, 2, 3}, {4 ,5 ,6}, {7, 8, 9}};

        List<Integer> ans = spiralMatrix(a);

        for (int b : ans ){
            System.out.print(" "+b);
        }
    }
    
}
