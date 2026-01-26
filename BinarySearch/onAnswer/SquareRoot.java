package BinarySearch.onAnswer;

public class SquareRoot {

    public static int findSquare(int n){
        int low = 0;
        int high = n;
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if ((long)mid * mid <= n){
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }

        }
        return ans;
    }
    public static void main(String[] args){

        int n = 36;

       int result = findSquare(n);

        System.out.println(result);
    }
}
