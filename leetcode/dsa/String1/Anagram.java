package dsa.String1;

import java.util.Arrays;

public class Anagram {
    public static boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] s1=str1.toLowerCase().toCharArray();
        char[] s2=str2.toLowerCase().toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String str1="Liste";
        String str2="silet";
        System.out.println(anagram(str1,str2));
    }
}
