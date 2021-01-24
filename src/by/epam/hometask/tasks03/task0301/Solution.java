package by.epam.hometask.tasks03.task0301;

import java.util.Random;

/*
 * 1. Сформировать строку, которая содержит 100 случайных значений от 0 до 1000,
 *    разделённых пробелами (2 способа - String и StringBuilder).
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(numbersRandomStringGeneratorOne());
    }

    public static final int COUNT_OF_NUMBERS = 100;
    public static final int MAX_RANDOM_VALUE = 1000;

    private static final Random RANDOM = new Random();

    /**
     * Generates random string containing {@code COUNT_OF_NUMBERS} values
     * from 0 to {@code MAX_RANDOM_VALUE}.
     * @return the generated random string
     */
    public static String numbersRandomStringGeneratorOne(){
        String result = "";
        for (int i = 0; i < COUNT_OF_NUMBERS; i++) {
            result += RANDOM.nextInt(MAX_RANDOM_VALUE) + " ";
        }
        return result;
    }

    /**
     * Generates random string containing {@code COUNT_OF_NUMBERS} values
     * from 0 to {@code MAX_RANDOM_VALUE}. Uses for concatenation
     * {@link StringBuilder#append(String)}
     * @return the generated random string
     */
    public static String numbersRandomStringGeneratorTwo(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < COUNT_OF_NUMBERS; i++) {
            sb.append(RANDOM.nextInt(MAX_RANDOM_VALUE)).append(" ");
        }
        return sb.toString();
    }

}
