package by.epam.hometask.tasks03.task0302;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.epam.hometask.tasks03.task0301.Solution.numbersRandomStringGeneratorOne;

/*
 * 2. В сформированной в 1-ой задаче строке заменить все двузначные числа на -1.
 *    - RegEx - регулярные выражения
 */
public class Solution {
    public static void main(String[] args) {
        String randomStringGeneratorOne = numbersRandomStringGeneratorOne();
        System.out.println(replaceTwoDigitNumbersToMinusOne(randomStringGeneratorOne));
    }

    public static final Pattern TWO_DIGIT_NUMBER =
            Pattern.compile("\\b\\d{2}\\b");

    /**
     * Replaces in the giving string all two-digit numbers to minus one.
     * @param string a string
     * @return a modified string
     */
    public static String replaceTwoDigitNumbersToMinusOne(String string){
        Matcher matcher = TWO_DIGIT_NUMBER.matcher(string);
        return matcher.replaceAll("-1");
    }

}
