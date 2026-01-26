package BinarySearch;

public class MinInRotatedArray {

    public static int minInRotateArray(int nums[]){
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high){
            int mid = low + ( high - low) / 2;

            if ( nums[low] <= nums[mid]){

                ans = Math.min(ans,nums[low]);
                low = mid + 1;
            }
            else {
                ans = Math.min(ans,nums[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){

        int nums[] = {4, 5, 6, 7, -7, 1, 2, 3};

       int min =  minInRotateArray(nums);

        System.out.println(min);

    }
}
