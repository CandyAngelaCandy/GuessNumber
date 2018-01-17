package GuessNumber;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by 22935 on 2018/1/17.
 */

public class CompareNumberTest {
    @Test
    public void test0A0B(){
        CompareNumber compareNum = new CompareNumber();
        String result = compareNum.compareNumber("1234","5678");
        assertThat(result,is("0A0B"));
    }

    @Test
    public void test1A0B(){
        CompareNumber compareNum = new CompareNumber();
        String result = compareNum.compareNumber("1234","1678");
        assertThat(result,is("1A0B"));
    }

    @Test
    public void test2A0B(){
        CompareNumber compareNum = new CompareNumber();
        String result = compareNum.compareNumber("1234","1278");
        assertThat(result,is("2A0B"));
    }

    @Test
    public void test3A0B(){
        CompareNumber compareNum = new CompareNumber();
        String result = compareNum.compareNumber("1234","1238");
        assertThat(result,is("3A0B"));
    }

    @Test
    public void test4A0B(){
        CompareNumber compareNum = new CompareNumber();
        String result = compareNum.compareNumber("1234","1234");
        assertThat(result,is("4A0B"));
    }

    @Test
    public void test0A1B(){
        CompareNumber compareNum = new CompareNumber();
        String result = compareNum.compareNumber("1234","6781");
        assertThat(result,is("0A1B"));
    }

    @Test
    public void test1A1B(){
        CompareNumber compareNum = new CompareNumber();
        String result = compareNum.compareNumber("1234","1782");
        assertThat(result,is("1A1B"));
    }

    @Test
    public void test2A1B(){
        CompareNumber compareNum = new CompareNumber();
        String result = compareNum.compareNumber("1234","1283");
        assertThat(result,is("2A1B"));
    }

    @Test
    public void test0A2B(){
        CompareNumber compareNum = new CompareNumber();
        String result = compareNum.compareNumber("1234","5612");
        assertThat(result,is("0A2B"));
    }

    @Test
    public void test1A2B(){
        CompareNumber compareNum = new CompareNumber();
        String result = compareNum.compareNumber("1234","1325");
        assertThat(result,is("1A2B"));
    }

    @Test
    public void test2A2B(){
        CompareNumber compareNum = new CompareNumber();
        String result = compareNum.compareNumber("1234","1243");
        assertThat(result,is("2A2B"));
    }

    @Test
    public void test0A3B(){
        CompareNumber compareNum = new CompareNumber();
        String result = compareNum.compareNumber("1234","2315");
        assertThat(result,is("0A3B"));
    }

    @Test
    public void test1A3B(){
        CompareNumber compareNum = new CompareNumber();
        String result = compareNum.compareNumber("1234","1342");
        assertThat(result,is("1A3B"));
    }

    @Test
    public void test0A4B(){
        CompareNumber compareNum = new CompareNumber();
        String result = compareNum.compareNumber("1234","4321");
        assertThat(result,is("0A4B"));
    }


}
