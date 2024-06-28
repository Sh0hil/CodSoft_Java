import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        
        
        System.out.println("-----------------------------------");
        System.out.println("            | START | ");
        Random r = new Random();

        int randomNumber = r.nextInt(100) + 1;
        //System.out.println("Random number is " + randomNumber);
       
        while(true) {  
        System.out.println("Enter your Guess (1-100) :- ");

        Scanner Sc = new Scanner(System.in);
        int playerGuess = Sc.nextInt();

        if (playerGuess == randomNumber) {
            System.out.println("Correct! You Win");
            break;
        } 
        else if (randomNumber > playerGuess) {
            System.out.println("Nope! your Guess is Smaller. Guess again.");
        }
        else {
            System.out.println("Nope! your Guess is Greater. Guess again.");
        }
             }
       
       System.out.println("      END! THANKS FOR PLAY ");      
       System.out.println("-----------------------------------");
    }
}