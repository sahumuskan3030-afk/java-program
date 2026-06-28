public class LongestPalindrome {
    public static String palindrome(String s){
        if(s.length()<=1){
            return s;
        }
        //for newstring store new char
        String LPS="";
        for(int i=1;i<s.length();i++){
            int low=i;
            int high=i;
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
                if(low==-1||s.length()==high){
                    break;
                }
            }
            String palindrome=s.substring(low+1,high);
            if(palindrome.length()>LPS.length()){
                LPS=palindrome;
            }

            //consider for even
            low=i-1;
            high=i;
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
                if(low==-1||s.length()==high){
                    break;
                }
            }
            palindrome=s.substring(low+1,high);
            if(palindrome.length()>LPS.length()){
                LPS=palindrome;
            }

        }
       return LPS;
    }
    public static void main(String[] args){
        String s="abrabadaadab";
        System.out.println(palindrome(s));
    }
}
