package ArrayQuestions;

public class CountInversion {

    public static int merge(int nums[],int low,int mid,int high){

        int temp[] = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int index = 0;

        int count = 0;

        while (left <= mid && right <= high){
            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            } else {
                temp[index++] = nums[right++];
                
                // Count inversions
                count += (mid - left + 1);
            }
        }
        while (left <= mid) {
            temp[index++] = nums[left++];
        }

        // Copy remaining elements of right half
        while (right <= high) {
            temp[index++] = nums[right++];
        }

        /* Copy elements from temp 
        array back to original array */
        System.arraycopy(temp, 0, nums, low, high - low + 1);
        
        // Return the count of inversions
        return count;


    }

    public static int mergeSort(int nums[],int low,int high){
        int count = 0;

        if ( low < high){
            int mid = low + (high - low) / 2;

            count += mergeSort(nums, low, mid);
            count += mergeSort(nums, mid + 1, high);

            count += merge(nums,low,mid,high);
        }
        return count;
    }


    public static int numberOfInversion(int[] nums){

        int n = nums.length;

        return mergeSort(nums,0,n-1);

    }

    public static void main(String[] args){

        int nums[] = {2, 3, 7, 1, 3, 5};

      int result =   numberOfInversion(nums);

      System.out.print(result);

    }
    
}
