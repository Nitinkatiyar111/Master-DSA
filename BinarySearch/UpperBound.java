package BinarySearch;

public class UpperBound {

    public static int upperBound(int nums[],int x){

        int low = 0, high = nums.length - 1;
        int ans = nums.length - 1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if (nums[mid] > x){
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }
    public static void main(String[] args){

           int nums[] = {1,2,2,3};
           int x = 2;

         int result = upperBound(nums,x);

         System.out.println(result);
    }
}
