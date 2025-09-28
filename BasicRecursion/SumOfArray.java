package BasicRecursion;

public class SumOfArray {

    public static int sumOfNum(int a[]){

        return sum(a,0);
    }
    public static int sum(int[] a,int left){

        // Base case
        if (left >= a.length){
            return 0;
        }
        return a[left] + sum(a,left + 1);
    }

    public static void main(String[] args){

        int a[] = {2,3,4,5,6,7};

          int result = sumOfNum(a);

          System.out.println(result);
    }
    
}
