package dsa.String1;

public class CountSay {
    public static String say(int n){
       //base case
       if(n==1){
           return "1";
       }

       String says=say(n-1);
       String result="";

        int count=1;
       for(int i=0;i<says.length();i++){
//           int count=1;
           char ch=says.charAt(i);
          while(i<says.length()-1&&says.charAt(i)==says.charAt(i+1)){
              count++;
              i++;
          }
          result+=count+String.valueOf(ch);
       }
       return result;
    }
    public static void main(String[] args){
       int n=5;
        System.out.println(say(n));
    }
}
