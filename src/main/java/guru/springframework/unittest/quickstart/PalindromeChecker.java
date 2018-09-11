package guru.springframework.unittest.quickstart;

public class PalindromeChecker {

    public String CheckPalindrome(String str){

        String output=new PalindromeChecker().getReverse(str);

        if((output.toLowerCase()).equals(str.toLowerCase())){
            return "The string is a Palindrome";

        }else{
            return "The string is not a Palindrome";
        }

    }
    public  String getReverse(String str){
        String output ="";
        for(int i=str.length()-1;i>=0;i--){
            output+=str.charAt(i);
        }
        return output;
    }



}
