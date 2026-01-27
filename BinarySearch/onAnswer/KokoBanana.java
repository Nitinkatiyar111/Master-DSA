package BinarySearch.onAnswer;

public class KokoBanana {

    public static int findMax(int a[]){
        int maxi = Integer.MIN_VALUE;
        int n = a.length;

        for (int i = 0; i < n ; i++){
            maxi = Math.max(maxi,a[i]);
        }
        return maxi;
    }

    public static int calculateTotalHours(int[] a,int hourly){
        int totalH = 0;
        int n = a.length;
        
        for (int i = 0; i < n; i++){
            totalH += Math.ceil((double)a[i] / (double)hourly); 
        }
        return totalH;

    }

    public static int minimumRateToEatBananas(int a[],int h){
        int low = 1;
        int high = findMax(a);

        while (low <= high){
            int mid = low + (high - low) / 2;
            long totalTakenH = calculateTotalHours(a,mid);

            if (totalTakenH <= h){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
          return low;
    }

    public static void main(String[] args){
        int a[] = {7,15,6,3};
        int h = 8;
        
        int ans = minimumRateToEatBananas(a,h);

        System.out.println(ans);
    }
    
}
