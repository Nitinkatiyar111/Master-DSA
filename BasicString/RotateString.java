package BasicString;


public class RotateString {

    public static boolean rotate(String s, String t){

        if (s.length() != t.length())
            return false;
        
         String doubleS = s + s;
         return doubleS.contains(t);   

    }

    public static void main(String[] args){

        String s = "abcde";
        String t = "cdeab";

      if (rotate(s,t)){
          
        System.out.println("Rotated string is same s and t");
      }
      else{
        System.out.println("Rotated string is not same s and t");
      }
    }
    
}
