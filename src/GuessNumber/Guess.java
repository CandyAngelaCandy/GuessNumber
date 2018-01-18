package GuessNumber;

/**
 * Created by 22935 on 2018/1/17.
 */
public class Guess {
    public static String guess(String userInputString) {
        AnswerGenerator ansGenerator = new AnswerGenerator();
        String generatedFourDigits = ansGenerator.answerGenerator();

        CompareNumber compareNum = new CompareNumber();
        String result = compareNum.compareNumber(generatedFourDigits, userInputString);

        return result;
    }
}
