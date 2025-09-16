package BasicArrays;

public class OddNumberInArray {

    public static int oddCount(int a[]){

        int len = a.length;

        int count = 0;

        for (int i = 0 ; i < len ; i++){

            if ( i % 2 == 0){
                count ++;
            }
        }
        return count;

    }

    public static void main(String[] args){

        int a[] = {1,2,3,4,5,6,7,8};

       int result = oddCount(a);

       System.out.println(result);
    }
    
}
