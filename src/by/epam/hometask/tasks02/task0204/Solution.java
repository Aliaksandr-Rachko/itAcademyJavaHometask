package by.epam.hometask.tasks02.task0204;

/*
 * 4. (3 балла). Пользователь вводит число в небольшом диапазоне (от 0 до 100).
 *    Программа должна угадать, что это за число и продемонстрировать количество попыток,
 *    которое потребовалось для угадывания.
 */
public class Solution {
    // You can use implementation two implement The Guess Number:  RandomGuessNumber or YesOrNoGuessingNumber
    public static final GuessingNumbers GUESS_NUMBER = new RandomGuessNumber();

    public static void main(String[] args) {
        ConsoleHelper.writeMessage("Write number from '0' to '100'");
        int number = ConsoleHelper.readInt();

        if (GUESS_NUMBER.getPlannedNumber(0, 100) == number) {
            ConsoleHelper.writeMessage("This program guess number!");
        } else {
            ConsoleHelper.writeMessage("Someone ui lying!\n Computers never lies");
        }
    }

}
