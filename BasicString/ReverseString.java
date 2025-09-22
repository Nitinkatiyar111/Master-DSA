package BasicString;

public class ReverseString {

    public static void reverse(String s){

        char[] chars = s.toCharArray();
     
        int start = 0;
        int end = chars.length - 1;

        while (start < end){

            char temp = chars[start];
            chars[start]  = chars[end];
            chars[end]  = temp;

            start++;
            end--;


        }
         
        System.out.println("Reversed string: " + reversed);

    }

    public static void main(String[] args){

        String s = "Raman";

        reverse(s);
    }
    
}
