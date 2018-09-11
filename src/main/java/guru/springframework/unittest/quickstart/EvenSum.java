package guru.springframework.unittest.quickstart;

import static java.lang.System.exit;

public class EvenSum {

    public String GetEvenSum(String str) {

        int sum = 0;

        try {
            int Check = Integer.parseInt(str);
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isDigit(ch)) {
                    int temp = Character.digit(ch, 10);
                    if (temp % 2 == 0) {
                        sum += temp;
                    }
                }
            }
        }catch (NumberFormatException e) {
            System.out.println("Illegal value encountered");
            exit(0);
        }

        if(sum >25)

        {
            System.out.println("sum of even is greater than 25");
            return new String("Greater than 25");
        } else

        {
            System.out.println("sum of even is less than 25");
            return new String("Less than 25");
        }

    }
}
