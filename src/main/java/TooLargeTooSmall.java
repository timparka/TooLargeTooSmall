//program makes user enter number and see if its close or far away from the number chosen
import java.util.Scanner;
import java.util.Random;
public class TooLargeTooSmall {

        public static void main(String[] args) {
                Random rand = new Random();

                Integer upper = 100;
                Integer compRand = rand.nextInt(upper);
                Integer maxGuesses = 7;

                Integer prevNum = 0;
                Integer currentNum = 0;


                System.out.println("Enter number between 1 ~ 100: ");
                Scanner scanner = new Scanner(System.in);
                Integer userInput = scanner.nextInt();
                while (userInput < 1 || userInput > 100) {
                        System.out.println("Number is invalid, please try again: ");
                        userInput = scanner.nextInt();
                }

        for(Integer i = 1; i <= maxGuesses; i++) {
                if (i == maxGuesses) {
                        System.out.println("You ran out of guesses, better luck next time!");
                } else {
                        prevNum = userInput;
                        if (userInput > compRand) {
                                System.out.println("You guessed higher than the number, guesses remaining " + (maxGuesses - i) + ": ");
                                userInput = scanner.nextInt();
                                currentNum = userInput;
                                while (prevNum == currentNum){
                                        System.out.println("Same input, please enter a different number: ");
                                        userInput = scanner.nextInt();
                                        if (userInput != currentNum) break;
                                }



                        } else if (userInput < compRand) {
                                System.out.println("You guessed lower than the number, guesses remaining " + (maxGuesses - i) + ": ");
                                userInput = scanner.nextInt();
                                currentNum = userInput;
                                while (prevNum == currentNum){
                                        System.out.println("Same input, please enter a different number: ");
                                        userInput = scanner.nextInt();
                                        if (userInput != currentNum) break;
                                }
                        } else if (userInput == compRand) {
                                System.out.println("You guessed the right number " + compRand + ", with " + i + " guesses!");
                                break;
                        }
                }
        }



        }

}