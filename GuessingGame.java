
//
// Name: Lin, Max
// Project: 2
// Due: 9/26/2023
// Course: cs-1400-02-f23
//
// Description:
// Create the random number guess game.This project can allow us to understand the checking condition(s) while using the if/else statement.
//

import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();   
        if(args.length > 0)
        {
            rand.setSeed(Long.valueOf(args[0]));
        }
        int secretNumber = rand.nextInt(100) + 1;

        //int secretNumber = 53;

        final int QUIT = 0;
        int guessCounter = 1; 
        int userGuess;

        System.out.println("Guess My Number Game by M. Lin");
        System.out.println();
        System.out.println("A sercet number between 1-100 has been generated...");
        System.out.println("Enter guess " + QUIT + " to quit.");
        System.out.println();
        System.out.print("Enter your guess? ");
        userGuess = keyboard.nextInt();
        //System.out.println(); 

        while(userGuess != secretNumber && userGuess != QUIT)
        {   
            guessCounter++;

            if(userGuess < secretNumber){
                System.out.println("Guess is low, try again.");
                System.out.print("Enter your guess? ");
                userGuess = keyboard.nextInt();
                //System.out.println();                         
            }else if(userGuess > secretNumber){
                System.out.println("Guess is high, try again.");  
                System.out.print("Enter your guess? ");
                userGuess = keyboard.nextInt();
                //System.out.println();   
            }
        }

        if(userGuess == secretNumber){
            if(guessCounter == 1){
                    System.out.println();
                    System.out.println("Congratulations, you got it in 1 guess!");
            }else{
                    System.out.println();
                    System.out.println("Correct in " + guessCounter + " guesses.");
            }
        }else{
            System.out.println();
            System.out.println("The secret number is " + secretNumber + ".");
        }
    }
}