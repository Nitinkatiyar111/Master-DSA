package ArrayQuestions;

public class MaximumConsectiveOne{

    public static int maximumConsectiveOne(int[]a ,int n){
             
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < n ; i++){

            if (a[i] == 1){
                count++;
                if (count > maxCount){
                    maxCount = count;
                }
            }
            else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args){

        int a[] = {1, 1, 0, 0, 1, 1, 1, 0};
        int n = a.length;

      int result = maximumConsectiveOne(a,n);

      System.out.println(result);
    }
}