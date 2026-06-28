package dsa.String1;

import java.util.Arrays;
import java.util.HashMap;

public class isomorphic {
    public static boolean morphic(String str1,String str2) {
        //using hashmap because it have an unigue key and value
        HashMap<Character, Character> map = new HashMap<>();
        //base case
        if(str1.length()!=str2.length()){
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            char st = str2.charAt(i);
            if (!map.containsKey(ch)) {
                if (!map.containsValue(st))
                    map.put(ch, st);
                else
                    return false;
            } else {
                char mapped = map.get(ch);
                if (mapped != st)
                    return false;
            }
            }
            return true;
        }
    public static void main(String[] args){
        String str1="letter";
        String str2="petter";
        System.out.println(morphic(str1,str2));
    }
}
