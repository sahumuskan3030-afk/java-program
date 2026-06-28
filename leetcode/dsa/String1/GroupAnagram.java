package dsa.String1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static List<List<String>> anagram(String[] strs){
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(anagram(strs));
    }
}
