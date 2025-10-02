package ArrayQuestions;

public class MissingNumber {

    public static int missingNumber(int a[], int n){

         int sum1 = (n * (n + 1)) / 2;

         int sum2 = 0;

         for (int i : a){
              sum2 += i;
         }
          int missingNumber = sum1 - sum2;

          return missingNumber;
    }

    public static void main(String[] args){

        int[]a = {0, 2, 3, 1, 4};
        int n = a.length;

       int result =  missingNumber(a,n);
       
       System.out.println(result);
    }
    
}
