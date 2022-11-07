package baseball.refree;

import java.util.Arrays;
import java.util.List;

public class Refree {

    private static int DEFAULT_ZERO = 0;
    private static String DEFAULT_BLANK = "";

    public void compareToUserInput(String randomNumber,String input){
        int strike = DEFAULT_ZERO;
        int ball = DEFAULT_ZERO;
        int nothing = DEFAULT_ZERO;

        String[] inputList = input.split(DEFAULT_BLANK);
        List<String> randomNumberList = Arrays.asList(randomNumber.split(DEFAULT_BLANK));
        for (int i = 0; i < inputList.length; i++) {
            if(randomNumber.contains(inputList[i]) && (randomNumberList.indexOf(inputList[i]) == i)){
                strike++;
            }
            else if(randomNumber.contains(inputList[i]) && (randomNumberList.indexOf(inputList[i]) != i)){
                ball++;
            }
            else{
                nothing++;
            }
        }
        System.out.println(strike + "스트라이크 " + ball + "볼 " + nothing +"낫띵");
    }
}
