package GuessNumber;

import java.util.Random;

/**
 * Created by 22935 on 2018/1/17.
 */
public class AnswerGenerator {
    public static String answerGenerator() {
        String fourDigits = "";
        int[] tags = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Random r = new Random();

        int temp ;
        while (fourDigits.length() != 4) {

            temp = r.nextInt(10);//随机获取0~9的数字
            if (tags[temp] == 0) {
                fourDigits += temp;
                tags[temp] = 1;
            }

        }
        return fourDigits;
    }
}
