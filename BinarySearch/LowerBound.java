package BinarySearch;

public class LowerBound {

    public static int lowerBound(int nums[], int x) {

        int len = nums.length;
        int low = 0, high = len - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] < x) {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args){

        int nums[] = {1,2,2,3};
        int x  = 2;

       int result =  lowerBound(nums,x);

        System.out.println(result);
    }
}
