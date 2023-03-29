
import java.util.Random;

import java.util.Scanner;

class Game{

    int number, input, guess = 1;

    Scanner sc = new Scanner(System.in);

    Game(){

        Random rand = new Random();

        number = rand.nextInt(1,100);

        System.out.println("Guess the Random Number between 1 - 100 : ");

    }

    public void takeUserInput(){

        input = sc.nextInt();

    }

    public void setGuess(){

        guess++;

    }

    public int getGuess(){

        return guess;

    }

    public void isCorrectNumber(){

        if (input==number){

            System.out.println("You Guess the Right Number!");

        }

    }

}

public class GuessNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Game g = new Game();

        g.takeUserInput();

        while (g.number != g.input){

            if (g.input < g.number){

                System.out.println("Give Big number than this.");

            }

            else {

                System.out.println("Give Small number than this.");

            }

            System.out.println("try again...");

            g.setGuess(); // this is for incrementing the guess number

            g.takeUserInput();

        }

        g.isCorrectNumber();

        System.out.print("Number of Guess : "+ g.getGuess());

    }

}
