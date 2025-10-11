package ArrayQuestions;

public class KadaneAlgorithm {

    public static int kadaneAlgorithm(int nums[]){

        int sum = 0;
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            sum += nums[i];

            if (sum > maxSum){
                maxSum = sum;
            }

               if (sum < 0){
                sum = 0;
               }
        }
        return maxSum;

    }

    public static void main(String[] args){

        int nums[] = {2, 3, 5, -2, 7, -4};

        int result = kadaneAlgorithm(nums);

        System.out.print(result);
    }
    
}
