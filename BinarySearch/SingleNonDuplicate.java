package BinarySearch;

public class SingleNonDuplicate {

    public static int singleNonDuplicate(int nums[]){
        int low = 0;
        int len = nums.length;
        int high = len - 1;

        if (len == 1)
            return nums[low];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[len-1] != nums[len-2])
            return nums[len - 1];
        while(low <= high){
            int mid = low + (high - low) / 2;

            if (nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1])
            || (mid % 2 == 0 && nums[mid] == nums[mid + 1])){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }

        }
        return -1;

    }
    public static void main(String[] args){

        int nums[] = {1,1,2,2,3,3,4,5,5,6,6};

      int result = singleNonDuplicate(nums);

      System.out.println(result);
    }
}
