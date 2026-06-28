package dsa.String2;

public class MinimumWindowSubstring {
    public static int sliding(String s,int k){
        int count=0;
        //int maxcount= 0;
        //ya loop first window ka h
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }
        int maxcount=count;
        //next window
        for(int i=k;i<s.length();i++){
            //remove left character
            char ch=s.charAt(i-k);
            if(isVowel(ch)){
              count--;
            }

            //add character
            if(isVowel(s.charAt(i))){
                count++;
            }

            maxcount=Math.max(count,maxcount);
        }
return maxcount;

    }
    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public static void main(String[] args){
   String s="abciiijl";
   int k=4;
        System.out.println(sliding(s,k));
    }
}
