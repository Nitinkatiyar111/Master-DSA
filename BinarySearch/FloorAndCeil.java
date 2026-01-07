package BinarySearch;

import java.util.Arrays;

public class FloorAndCeil {

    public static int[] getFloorAndCeil(int nums[],int x){

        int len = nums.length;

        int floor = findFloor(nums,len,x);

        int ceil = findCeil(nums,len,x);

        return new int[] {floor,ceil};
    }

    public static int findFloor(int[] nums,int n,int x){
        int low = 0, high = n - 1;

        int ans = -1;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if (nums[mid] <= x){
                ans = nums[mid];
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int findCeil(int[] nums,int n,int x){
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if (nums[mid] >= x){
                ans = nums[mid];
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int nums[] = {3, 4, 4, 7, 8, 10};
        int x = 5;

      int ans[] = getFloorAndCeil(nums,x);

        System.out.println(Arrays.toString(ans));
    }
}
