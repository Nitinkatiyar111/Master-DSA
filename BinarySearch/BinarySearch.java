package BinarySearch;

public class BinarySearch{

    public static int search(int a[],int target) {

        int n = a.length;

        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == target)
                return mid;
            else if (target > a[mid])
                low = mid + 1;
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a = {-1,0,3,5,9,12};
        int target = 9;

       int result = search(a,target);

        System.out.println(result);
    }
}