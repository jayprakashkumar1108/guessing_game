import java.util.Random;
import java.util.Scanner;

public class guessingGame1 {
    public static void guess(){
        int answer, guess;
        final int MAX=100;

        Scanner sc=new Scanner(System.in);
        Random rand =new Random();

        answer = rand.nextInt(MAX)+1;

        System.out.print("Guess a number between 0 to 100: ");
        guess=sc.nextInt();

        if(guess==answer){
            System.out.println("you guess is correct and that is "+answer);
            System.out.println("you are a nice player. play again!");
            guess();
            System.out.print("Guess a number between 0 to 100: ");
            guess=sc.nextInt();
        }else if( guess+10>answer){
            System.out.println("you guesses too high and your guess is wrong!  answer is "+answer);
            System.out.println("please try again!");
            guess();
            System.out.print("Guess a number between 0 to 100: ");
            guess=sc.nextInt();
        }else if( guess>answer && answer>guess+10){
            System.out.println("you guesses is too near but your guess is wrong!  answer is "+answer);
            System.out.println("please try again!");
            guess();
            System.out.print("Guess a number between 0 to 100: ");
            guess=sc.nextInt();
        }
        else if( guess<answer) {
            System.out.println("you guesses too low and your guess is wrong!  answer is " + answer);
            System.out.println("please try again!");
            guess();
            System.out.print("Guess a number between 0 to 100: ");
            guess = sc.nextInt();
        }else if( guess<answer && answer<guess+10){
            System.out.println("you guesses is too near but your guess is wrong!  answer is "+answer);
            System.out.println("please try again!");
            guess();
            System.out.print("Guess a number between 0 to 100: ");
            guess=sc.nextInt();
        }else if(guess>100){
            System.out.println("enter a valid guess between 0 and 100");
            guess();
        }
    }
    public static void main(String args[]){
        guess();
    }

}