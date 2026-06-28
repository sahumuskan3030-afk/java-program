package dsa.String2;

import java.util.Stack;

public class RemoveKthelement {
    public static String remove(String num, int k){
Stack<Integer> stack=new Stack<>();

for(char ch:num.toCharArray()) {
    while (!stack.isEmpty() && k > 0 && stack.peek() > ch) {
        stack.pop();
        k--;
    }
    stack.push((int) ch);
}
//if k is still left remove from the end
        while(k>0){
            stack.pop();
            k--;
        }

        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        //remove leading zero
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        //if nothing left
        if(sb.length()==0){
            return "0";
        }
        return sb.toString();
    }
    public static void main(String[] args){
        int String= Integer.parseInt("124321");
        int k=3;
        System.out.println();
    }
}
