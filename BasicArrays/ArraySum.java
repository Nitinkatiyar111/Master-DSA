package BasicArrays;

public class ArraySum {

    public static int sum(int a[]){

        int len = a.length;
         int sum = 0;

        for (int i = 0; i < len; i++){

            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args){

        int a[] = {1,2,3,4,5};

       int result = sum(a);

       System.out.println(result);
    }
    
}
