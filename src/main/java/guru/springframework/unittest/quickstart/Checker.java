package guru.springframework.unittest.quickstart;



import java.util.ArrayList;
import java.util.Arrays;

public class Checker{

    public String InputChecker(String str){
        try {
            int input = Integer.parseInt(str);
            if (input > 20 && input < 30) {
                if (input % 2 == 0) {
                    System.out.println("Jerry");

                    return new String("Jerry");
                } else {
                    System.out.println("Tom");

                    return new String("Tom");
                }

            }

        }catch(Exception e){
            e.getMessage();
            System.out.println("Input should be of integer type");
        }
        return null;

    }


    public ArrayList<String> VowelChecker(String str){
        ArrayList<String> ar =new ArrayList<String>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'|ch=='i'|ch=='o'|ch=='e'|ch=='u'){

                System.out.println(ch+"-is a vowel");
                ar.add("Is a vowel");
            }else{
                System.out.println(ch+"-is a consonant");
                ar.add("Is a consonant");
            }
        }

        return ar;

    }




    public String CharacterChecker(char ch){

        if(Character.isDigit(ch)){
            System.out.println("Digit");
            return "Digit";
        }
        else if(Character.isLetter(ch)){
            int temp=ch;
            if(temp>=65&&temp<=90) {
                System.out.println("Capital Letter");
                return "Capital Letter";
            }else if(temp>=97&&temp<=122){
                System.out.println("Lowercase Letter");
                return "Lowercase Letter";
            }
        }else{
            System.out.println("Special symbol");
            return "Special symbol";
        }
        return null;
    }


}

