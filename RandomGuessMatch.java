import java.util.Scanner;

public class RandomGuessMatch {
    public static void main(String[] args) {
        int MIN = 1;
        int MAX = 5;
        int random = MIN + (int)(Math.random() * (MAX - MIN + 1));

        Scanner input = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 5: ");
        int userGuess = input.nextInt();

        int difference = Math.abs(random - userGuess);
        boolean isMatch = (userGuess == random);

        System.out.println("Difference between the random number and your guess: " + difference);
        System.out.println("Random number was: " + random);
        System.out.println("Did you guess correctly? " + isMatch);

        input.close();
    }
}
