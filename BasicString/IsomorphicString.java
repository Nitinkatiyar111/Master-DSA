package BasicString;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString{

    public static boolean isomorphicString(String s,String t){

           if (s.length() != t.length()){
                return false;
           }
           Map<Character,Character> map1 = new HashMap<>();
           int i = 0;

           while (i < s.length()){
              if (map1.containsKey(s.charAt(i))){
                if (map1.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
              }
              else if(map1.containsValue(t.charAt(i))){
                  return false;
              }
              else{
                map1.put(s.charAt(i),t.charAt(i));
              }
              i++;
           }
           return true;

    }

    public static void main(String[] args){

        String s = "egg";
        String t = "add";

       if (isomorphicString(s,t)){
            
           System.out.println("Strings are isomorphic");

        }else {
            System.out.println("Strings are not isomorphic");
        }

    }
}