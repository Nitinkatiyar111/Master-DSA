package BasicArrays;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverse(int a[]){

        int len = a.length;
        
        for (int i = 0; i < len / 2; i++){

            int temp = a[i];
            a[i] = a[ len - 1 - i];
            a[len - 1 - i] = temp;
        }
        return a;
    }

    public static void main(String[] args){

        int a[] = {2,3,4,5,6,7,8};

     int result[] = reverse(a);

     System.out.println(Arrays.toString(result));

    }
    
}
