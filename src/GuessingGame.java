import com.sun.source.tree.WhileLoopTree;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numLow = 0;
        int numHigh = 0;
        double guess = 0.5;
        int guesses = 0;

        while (numLow >= numHigh){
            System.out.print("Choose the lower bound number:");
            numLow = in.nextInt();
            System.out.print("Choose the upper bound number:");
            numHigh = in.nextInt();
        }
        double[] numberList = new double[numHigh-numLow];
        double randomNumber = Math.round(Math.random()*(numHigh-numLow) + numLow);

        while (guess !=randomNumber) {
            System.out.print("Guess an Integer: ");
            guess = in.nextDouble();
            if (guess > randomNumber) {
                System.out.println("Too High!");
                boolean check = false;
                for (int i = 0; i < numberList.length; i++) {
                    if (randomNumber == numberList[i]) {
                        check = true;
                    }
                }
                if (!check) {
                    numberList[guesses] = randomNumber;
                    guesses++;
                }
            }else if (guess < randomNumber) {
                System.out.println("Too Low!");
                boolean check = false;
                for (int i = 0; i < numberList.length; i++) {
                    if (randomNumber == numberList[i]) {
                        check = true;
                    }
                }
                if (!check) {
                    numberList[guesses] = randomNumber;
                    guesses++;
                    System.out.println(numberList);
                }
            } else {
                System.out.println("Great job! You guessed the number! Number: " + randomNumber);
                System.out.println("That took you " +  guesses +  " guesses!");
            }
        }


    }
}
