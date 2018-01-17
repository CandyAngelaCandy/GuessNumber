package GuessNumber;

/**
 * Created by 22935 on 2018/1/17.
 */
public class CompareNumber {
    public static String compareNumber(String answer,String userInputString){
          String[]  userInputArray = userInputString.split("");
          int aNumber = 0,bNumber = 0;

          for(int i = 0;i < userInputArray.length;i++){
              int userCharIndexInAnswer = answer.indexOf(userInputArray[i]);

              if(userCharIndexInAnswer!=-1 && userCharIndexInAnswer == i){
                  aNumber++;
              }

              if(userCharIndexInAnswer!=-1 && userCharIndexInAnswer != i){
                  bNumber++;
              }
          }

          String result = aNumber+"A"+bNumber+"B";
          return result;
    }

}
