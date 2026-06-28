package dsa.String1;

public class StringCompression {
    public static  int compress(char[] chars){
        int idx=0;
        for(int i=0;i<chars.length;){
            int count=0;
           char ch=chars[i];
            while(i<chars.length&&ch==chars[i]) {
                count++;
                i++;
            }
            if(count==1){
                chars[idx++]=ch;
            }else{
                chars[idx++]=ch;
                String str=String.valueOf(count);
                for(char digit:str.toCharArray()){
                    chars[idx++]=digit;
                }
            }
            }
        return idx;
    }
    public static void main(String[] args){
        char[] chars={'a','a','b','a','b','b'};
        System.out.println(compress(chars));
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]+"");
        }
    }
}
