package BasicRecursion;

public class ReverseArray {

     public static int[] reverseArray(int[] a){

        reverse(a,0,a.length - 1);

         return a;
            
        }

        public static void reverse(int[] a,int left,int right){

            if (left >= right){
                return ;
            }
            int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
        
        reverse(a, left + 1, right - 1); 
        }

    public static void main(String[] args){

        int a[] = {1,2,3,4,5};

        int[] result = reverseArray(a);
        for (int num : result){
            System.out.print(num + " ");
        }
    }
    
}
