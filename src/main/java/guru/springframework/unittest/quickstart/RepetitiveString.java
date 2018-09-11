package guru.springframework.unittest.quickstart;


public class RepetitiveString {

        public  String repeatString(String str,int n) {


            int length = str.length();
            String temp="";

            for (int i = 0; i < length - n; i++) {

                temp+=str.charAt(i);

            }

            int j = 0;
            while (j < n)

            {
                 for(int k=length-n;k<length;k++)
                {
                    temp+=str.charAt(k);
                }
                j++;
            }

            return temp;

    }
}
