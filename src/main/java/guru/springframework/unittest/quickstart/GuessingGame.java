package guru.springframework.unittest.quickstart;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GuessingGame {

    public double InitializeTarget(int min, int max) {
        double target =Math.floor(Math.random()*((max - min) + 1) + min);
        return target;
    }


    public static void main(String[] args) throws Exception{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        GuessingGame NewGame=new GuessingGame();

        double target=NewGame.InitializeTarget(1,20);
        double guessed;
        do{
            try {
                System.out.println("Guess a number between 1-20");
                guessed = Double.parseDouble(br.readLine());
                if (target == guessed) {
                    System.out.println("Number guessed matches the original number");
                    break;
                } else if (target > guessed) {
                    System.out.println("Number guessed is less than original number");
                } else {
                    System.out.println("Number guessed is more than original number");
                }
            }catch(Exception e){
                System.out.println("Enter only integer values ");
            }

        }while(true);

    }
}
