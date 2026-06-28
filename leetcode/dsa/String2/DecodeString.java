package dsa.String2;

import java.util.Stack;

public class DecodeString {
    public static String decode(String s){
        //create  a numstack
        Stack<Integer> countStack=new Stack<>();
        //create a stringstack
        Stack<String> StringStack=new Stack<>();
        String CurrString="";
        int k=0;

        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                k=k*10+(ch-'0');
            }
            else if(ch=='['){
                countStack.push(k);
                StringStack.push(CurrString);
                //reset the value
                k=0;
                CurrString="";
            } else if (ch == ']') {
                int count=countStack.pop();
                String preString=StringStack.pop();

                StringBuilder temp=new StringBuilder(preString);
                while(count-->0){
                    temp.append(CurrString);
                }
                CurrString=temp.toString();
            }else{
                CurrString+=ch;
            }
        }
        return CurrString;
    }
    public static void main(String[] args){
        String s="2[a3[x]]";
        System.out.println(decode(s));
    }
}
