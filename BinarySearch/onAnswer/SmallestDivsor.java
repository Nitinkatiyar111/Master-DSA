package BinarySearch.onAnswer;

public class SmallestDivsor {

    public static int sumByD(int[] a,int limit){
        int n = a.length;
        int sum = 0;

        for (int i = 0; i < n; i++){
            sum += Math.ceil((double)a[i]/ (double)limit);
        }
        return sum;
    }



    public static int smallestDivisor(int a[],int limit){

        int n = a.length;
        if ( n > limit) return -1;

        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            maxi = Math.max(maxi, a[i]);
        } 
         int low = 1, high = maxi;

         // Apply binary search

         while ( low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(a,mid) <= limit){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return low;

    }

    public static void main(String[] args){

        int a[]  ={1, 2, 3, 4, 5};
        int limit = 8;

       int result =  smallestDivisor(a, limit);

       System.out.println("This minimum divisor is: "+result);

    }
    
}
