package BasicString;

public class ValidAnagram {

    public static boolean validAnagram(String s,String t){

        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (char c : s.toCharArray()) count[c - 'a']++;

        for (char c : t.toCharArray()) count[c - 'a']--;

        for (int i : count){
            if (i != 0) return false;
        }
            return true;
    }

    public static void main(String[] args){

        String s = "anagram";
        String t = "nagaram";


        if(validAnagram(s,t)){
             System.out.println("Strings are anagram");
        }
        else {
            System.out.println("Strings are not anagram");
        }
    }

    
}
