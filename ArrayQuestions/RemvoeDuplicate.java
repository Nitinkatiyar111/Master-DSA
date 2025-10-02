package ArrayQuestions;

public class RemvoeDuplicate {

    public static int removeDuplicate(int nums[],int n){

            if (nums.length == 0 ){
                return 0;
            }
            int i = 0;

            for (int j = 1; j < nums.length; j++){
                if (nums[i] != nums[j]){
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i + 1;
    }

    public static void main(String[] args){

        int nums[] = {0, 0, 3, 3, 5, 6};
        int n = nums.length;

        int result = removeDuplicate(nums,n);

        System.out.println(result);
    }
    
}
