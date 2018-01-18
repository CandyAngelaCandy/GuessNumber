package GuessNumber;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by 22935 on 2018/1/17.
 */
public class GuessTest {
    @Test
    public void testResultIntegrationOfAnswerGeneratorAndCompareNumber() {
        Guess guessClassInstance = new Guess();
        String result = guessClassInstance.guess("1234");

        String pattern = "^([0-4]A0B)|([0-2]A1B)|([0-2]A2B)|([0-1]A3B)|(0A4B)$";

        boolean isMatchPattern = result.matches(pattern);

        assertThat(isMatchPattern, is(true));
    }
}
