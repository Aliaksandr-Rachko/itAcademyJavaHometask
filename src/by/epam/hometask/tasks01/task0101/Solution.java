package by.epam.hometask.tasks01.task0101;

import java.time.DayOfWeek;
import java.util.Random;

public class Solution {
    private static final int COUNT_OF_TESTS = 10;

    public static void main(String[] args) {
        testGetDayOfWeek();
    }

    /**
     * Returns string of the day-of-week to represent, or 'Not exist'.
     * Better using {@link DayOfWeek#of(int)}.
     * @param dayOfWeek the day-of-week to represent, from 1 (Monday) to 7 (Sunday)
     * @return the name of day-of-week
     */
    public static String getDayOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Not exist";
        }
    }

    private static final Random random = new Random();

    /**
     * Tests method {@link Solution#getDayOfWeek(int)}, prints processed to console.
     */
    private static void testGetDayOfWeek(){
        for (int i = 0; i < Solution.COUNT_OF_TESTS; i++){
            int randomNumber = random.nextInt(14);
            System.out.printf("Day of week '%d' is %s\n",
                    randomNumber,
                    getDayOfWeek(randomNumber));
        }
    }
}