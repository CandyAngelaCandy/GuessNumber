package GuessNumber;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by 22935 on 2018/1/17.
 */
public class AnswerGeneratorTest {
    @Test
    public void testIsFourDigit() {
        AnswerGenerator ansGenerator = new AnswerGenerator();
        String generatedFourDigits = ansGenerator.answerGenerator();

        Boolean isValid = false;

        if (generatedFourDigits.length() == 4) {
            isValid = true;
        }
        assertThat(isValid, is(true));

    }

    @Test
    public void testEachDigitIsNum() {
        AnswerGenerator ansGenerator = new AnswerGenerator();
        String generatedFourDigits = ansGenerator.answerGenerator();

        Pattern pattern = Pattern.compile("[0-9]{4}");
        Boolean isEachDigitNum = pattern.matcher(generatedFourDigits).matches();

        assertThat(isEachDigitNum, is(true));
    }

    @Test
    public void testEachDigitIsDifferentNum() {
        AnswerGenerator ansGenerator = new AnswerGenerator();
        String generatedFourDigits = ansGenerator.answerGenerator();

        String[] generatedFourDigitsArray = generatedFourDigits.split("");

        int[] tags = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        Boolean isEachDigitDifferentNum = true;

        for (int i = 0; i < generatedFourDigitsArray.length; i++) {
            int currentNum = Integer.parseInt(generatedFourDigitsArray[i]);
            if (tags[currentNum] == 0) {
                tags[currentNum] = 1;
            } else {
                isEachDigitDifferentNum = false;
                break;
            }
        }

        assertThat(isEachDigitDifferentNum, is(true));
    }
}
