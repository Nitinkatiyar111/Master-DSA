package ArrayQuestions;

public class SecondLargestElement {

    public static int seconLargestElement(int nums[],int n){

        int largest = Integer.MIN_VALUE;
        int secondLarget = Integer.MIN_VALUE;

        for (int i = 0; i < n ; i++){
            
            if (nums[i] > largest){
                secondLarget = largest;
                largest = nums[i];
            }
            else if ( nums[i] > secondLarget && nums[i] != largest){
                secondLarget = nums[i];
            }
        }
        return secondLarget;

    }

    public static void main(String[] args){

        int[] nums = {8,8,7,6,5};
        int n = nums.length;

        int result = seconLargestElement(nums,n);

        System.out.println(result);
    }
}