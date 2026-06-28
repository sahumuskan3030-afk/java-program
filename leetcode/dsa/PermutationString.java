package dsa;

import java.util.Arrays;

public class PermutationString {
    public static boolean permutation(String s1,String s2){
        int[] map1=new int[26];
        int[] map2=new int[26];
        //base case
        if(s2.length()<s1.length()){
            return false;
        }
        for(char ch:s1.toCharArray()){
            map1[ch-'a']++;

        }
        for(int i=0;i<s1.length();i++){
            map2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(map1,map2)){
            return true;
        }
        //sliding window
        for(int right=s1.length();right<s2.length();right++){
            map2[s2.charAt(right)-'a']++;
            map2[s2.charAt(right-s1.length())-'a']--;
            if(Arrays.equals(map1,map2)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String s1="ab";
        String s2="eidbaooo";
        System.out.println(permutation(s1,s2));
    }
}
