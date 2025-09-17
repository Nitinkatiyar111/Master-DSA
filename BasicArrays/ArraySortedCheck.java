package BasicArrays;

public class ArraySortedCheck{

    public static boolean sortedCheck(int a[]){
         
             int len = a.length;

             for (int i = 0 ; i < len-1; i++){

                if (a[i] > a[i+1]) 
                   return false;

             }
             return true;
    }

    public static void main(String[] args){

        int a[] = {2,3,4,8,6};

       boolean result =  sortedCheck(a);

       System.out.println(result);
    }
}