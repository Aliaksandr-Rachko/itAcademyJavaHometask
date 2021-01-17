package by.epam.hometask.tasks01.task0102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2. Даны два целых числа, задающие три диапазона чисел.
 *    Определить, какому диапазону принадлежит введенное пользователем число.
 */
public class Solution {
    public static void main(String[] args) {
        printIntervalForUsersNumber(47, 58);
    }

    /**
     * Returns the string describes interval for givens number.
     * It's main method this task.
     * @param firstNumber an argument
     * @param secondNumber another argument
     * @param usersNumber givens number
     * @return the string describes interval
     */
    public static String getInterval(int firstNumber, int secondNumber, int usersNumber){
        String result;
        if (usersNumber <= firstNumber){
            result = "(-infinity, " + firstNumber + "]";
        } else if (usersNumber >= secondNumber) {
            result = "[" + secondNumber + ", +infinity)";
        } else {
            result = "(" + firstNumber + ", " + secondNumber + ")";
        }
        return result;
    }

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Reads the number from console.
     * @return the int number
     */
    private static int getInteger(){
        try {
            return Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println("It don't number!");
            return getInteger();
        } catch (IOException e) {
            e.printStackTrace();
            return getInteger();
        }
    }

    public static void printIntervalForUsersNumber(int firstNumber, int secondNumber){
        System.out.println("Write number, and press 'enter'...");
        int usersNumber = getInteger();
        System.out.println("Number = '" + usersNumber + "' in the interval " +
                getInterval(firstNumber, secondNumber, usersNumber));
    }
}