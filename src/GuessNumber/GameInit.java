package GuessNumber;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 22935 on 2018/1/17.
 */
public class GameInit {
    public static ArrayList<String> userInputList = new ArrayList();
    public static ArrayList<String> allResultList = new ArrayList();
    public static int userChanceNumber = 0;

    public static void main(String args[]) {
        startGame();
    }

    public static void startGame() {
        System.out.println("Welcome!");
        System.out.println("Please input your number(6): ");

        AnswerGenerator ansGenerator = new AnswerGenerator();
        String generatedFourDigits = ansGenerator.answerGenerator();

        CompareNumber compareNum = new CompareNumber();

        while (userChanceNumber < 6) {
            Scanner sc = new Scanner(System.in);
            String userInputString = sc.nextLine();
            userChanceNumber++;

            if (isUserInputDuplicate(userInputString)) {
                printInputDuplicateInformation(userInputString);
                continue;
            }

            userInputList.add(userInputString);
            String result = compareNum.compareNumber(generatedFourDigits, userInputString);
            allResultList.add(result);

            if (isGuessRight(result)) {
                System.out.println("Congratulations!");
                break;
            }

            if (isGameOver(result)) {
                System.out.println("Game Over");
                break;
            }

            System.out.println(result);

            if (userChanceNumber < 6) {
                System.out.println();
                System.out.println("Please input your number(x): ");
            }

        }

    }


    public static boolean isUserInputDuplicate(String userInputString) {
        if (userChanceNumber != 0 && userInputList.contains(userInputString)) {
            return true;
        }
        return false;
    }

    public static boolean isGuessRight(String finalResult) {
        if (finalResult.equals("4A0B")) {
            return true;
        }
        return false;
    }

    public static boolean isGameOver(String finalResult) {
        if (userChanceNumber == 6 && !allResultList.contains("4A0B")) {
            return true;
        }
        return false;
    }


    public static void printInputDuplicateInformation(String userInputString) {

        System.out.println("Cannot input duplicate numbers!");
        if (userChanceNumber == 6) {
            System.out.println("Game Over");
        } else {
            System.out.println();
            System.out.println("Please input your number(x): ");
            userInputList.add(userInputString);
        }


    }

}
