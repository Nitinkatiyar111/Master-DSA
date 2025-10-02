package ArrayQuestions;

public class LargestEelement {

    public static int largestElement(int n,int nums[]){

        int largest = Integer.MIN_VALUE;
        
        for (int i = 0; i < n ; i++){
            if (nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args){

        int nums[] = {3,3,6,1};
        
        int n = nums.length;

      int result = largestElement(n,nums);

      System.out.println(result);

    }
    
}
