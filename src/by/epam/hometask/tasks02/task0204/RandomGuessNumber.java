package by.epam.hometask.tasks02.task0204;

import java.util.Random;

/**
 * This class represent The Guess Number use {@link Math#random()}'.
 */
public class RandomGuessNumber extends GuessingNumbers{

    private static final Random RANDOM = new Random();

    @Override
    public int getPlannedNumber(int from, int to) {
        int countOfAttempts = 0;
        int result;
        while (true){
            result = RANDOM.nextInt(101);
            if (check(result)){
                ConsoleHelper.writeMessage("Count of attempts: '" + countOfAttempts + "'.");
                return result;
            }
            countOfAttempts++;
        }
    }
}