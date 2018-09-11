package guru.springframework.unittest.quickstart;

public class Adder {

    public int InputAdder(String str){

        String[] arr=str.split("\\s");
        int sum=0;
        for(String temp:arr){
            try{
                int a=Integer.parseInt(temp);
                sum=sum+a;
            }catch(Exception e){
                System.out.println("Invalid input type encountered:Not an integer");
            }
        }

        System.out.println(sum);
        return sum;
    }
}
