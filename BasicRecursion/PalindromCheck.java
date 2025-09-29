package BasicRecursion;

public class PalindromCheck {

    public static boolean palindromCheck(String str){

      return isPanlindromeCheck(str,0,str.length() - 1);
    }

     public static boolean isPanlindromeCheck(String str,int left,int right){
        
               // base case

            if (left >= right)
            return true;

            if (str.charAt(left) != str.charAt(right)){
                return false;
            }

            return isPanlindromeCheck(str, left + 1, right - 1);

     }

    public static void main(String[] args){

        String str = "nitin";

        System.out.println(palindromCheck(str));
    }
    
}
