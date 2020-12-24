package by.epam.hometask.tasks01.task0101;

import java.time.DayOfWeek;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        testGetDayOfWeek(8);
    }

    /**
     * Returns string with the day-of-week to represent, or 'Not exist'.
     * @param dayOfWeek the day-of-week to represent, from 1 (Monday) to 7 (Sunday)
     * @return the name of day-of-week
     * @deprecated more better using {@link DayOfWeek#of(int)}
     */
    @Deprecated
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

    private static void testGetDayOfWeek(int countOfTests){
        for (int i = 0; i < countOfTests; i++){
            int randomNumber = random.nextInt(14);
            System.out.printf("Day of week '%d' is %s\n",
                    randomNumber,
                    getDayOfWeek(randomNumber));
        }
    }
}
