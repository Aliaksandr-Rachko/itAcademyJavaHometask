package by.epam.hometask.tasks02.task0202;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Locale;

/*
 * 2. (2 балла). Пользователь вводит месяц и день (числа).
 *    Вывести, есть ли такой день в этом месяце.
 */
public class Solution {
    public static void main(String[] args) {
        mainProcess();
    }

    /**
     * Time zone for Minsk, Belarus.
     */
    private static final ZoneId ZONE_ID = ZoneId.of("GMT+3");

    /**
     * Returns {@link LocalDate} for giving month and day.
     * @param month month of year
     * @param day day of month
     * @return {@link LocalDate} by giving month and day
     * @throws DateTimeException if the value of any field is out of range,
     * or if the day-of-month is invalid for the month-year
     */
    public static LocalDate getLocalDateCurrentYear(int month, int day){
        LocalDate currentDate = LocalDate.now(ZONE_ID);
        return LocalDate.of(currentDate.getYear(), month, day);
    }

    /**
     * Main process. Ask user about: month of year and day of month,
     * and answer 'exists' or 'doesn't exist' day.
     */
    public static void mainProcess(){
        ConsoleHelper.writeMessage("Write number of month, please...");
        int month = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("Write day of month, please...");
        int day = ConsoleHelper.readInt();

        try {
            Locale.setDefault(Locale.ENGLISH);
            LocalDate localDate = getLocalDateCurrentYear(month, day);
            ConsoleHelper.writeMessage(String.format("Writing date is: '%1$tA %1$td %1$tB %1$tY'.", localDate));
        } catch (DateTimeException e){
            ConsoleHelper.writeMessage("Wrong data!");
        }
    }
}
