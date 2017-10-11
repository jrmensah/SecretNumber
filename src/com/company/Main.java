/*
* Jerilyn Mensah
* October 11,2017
* This application will prompt the user to guess a secret number and will
* continue on a loop, indicating whether the number is too low or high until
* the number entered is equal to the secret number.
*/

package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	//Set the value of the secret number from 1 to 10

        Random r = new Random();
        int x = 1 + r.nextInt(10);

        long from = 1;
        long to = 10;
        int randomNumber;
            randomNumber = r.nextInt((int) ((to-from +1) + from));

    //Set the starting value of the guessed number at zero
    int guessedNumber = 0;

    //The random number is between 1 and 10
        System.out.printf("The number is between %d and %d. \n", from,to);

    //Ask the user to enter a number to see if it's too high or too low. This
    //will continue to prompt for a number until the secret number is guessed
    //correctly

    do{
        System.out.print("Guess what the secret number is");
        guessedNumber = scan.nextInt();
        if (guessedNumber > randomNumber)
            System.out.println("Your guess is too high!");
        else if(guessedNumber < randomNumber)
            System.out.println("Your guess is too low");
        else
            System.out.println("You got it!");
    }while (guessedNumber !=randomNumber);

    }
}
