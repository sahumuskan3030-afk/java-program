package dsa.String1;

import java.util.ArrayList;
import java.util.*;
public class AllAnagramString {
    public static List<Integer> findAnagrams(String s,String p){
        int[] pcount=new int[26];
        int[] scount=new int[26];
        List<Integer> result=new ArrayList<>();

        //count frequency of character
        for(char ch:p.toCharArray()){
            pcount[ch-'a']++;
        }

        //count frequency of character
        for(int i=0;i<s.length();i++){
            scount[s.charAt(i)-'a']++;
            //remove element
            if(i>=p.length()){
                scount[s.charAt(i-p.length())-'a']--;
            }
            //compare
            if(Arrays.equals(pcount,scount)){
                result.add(i-p.length()+1);
            }

        }
     return result;
    }
    public static void main(String[] args){
        String s="cbaebabacd";
        String p="abc";
        System.out.println(findAnagrams(s,p));
    }
}
