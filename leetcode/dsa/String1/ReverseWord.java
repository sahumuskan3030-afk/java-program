package dsa.String1;

public class ReverseWord {
    public static String ReverseString(String str){
        //string immutable hoti h isleye array m convert karna hoga
        char[] arr=str.toCharArray();
        int l=0,r=0;
        while(r<arr.length){
            if(arr[r]==' '){
               reverse(arr,l,r-1);
               l=r+1;
            }
            r++;
        }
        reverse(arr,l,r-1);
        return new String(arr);
    }
   public static void reverse(char[] arr,int l,int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;

        }
    }
    public static void main(String[] args){
        String str="Welcome to the World";
        System.out.println(ReverseString(str));
    }
}
