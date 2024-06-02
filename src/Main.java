import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess = 0;
        int counter = 0;
        int maxAttmpts = 10;
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");
        System.out.println("But you only have " + maxAttmpts + " attempts so guess carefully.");
        while (guess != number && counter < maxAttmpts) {
            System.out.print("Make a guess: ");
            guess = scanner.nextInt();
            counter = counter + 1;
            if (guess < number) {
                System.out.println("It's higher than that, guess again.");
            } else if (guess > number) {
                System.out.println("It's lower than that, guess again.");

            }
        }
        if (counter >= maxAttmpts) {

            System.out.println("\nGame Over");
            System.out.println("You ran out of tries");
            System.out.println("The correct number was "+ number + ".");
            scanner.close();
        }
        else {
            System.out.println("\nCorrect! You guessed my number.");
            System.out.println("It took you " + counter + " guesses.");
        }
        scanner.close();

    }

}