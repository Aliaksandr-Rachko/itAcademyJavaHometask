package by.epam.hometask.tasks02.task0204;

/**
 * This class represent The Guess Number use users help ''yes' or 'no''.
 */
public class YesOrNoGuessingNumber extends GuessingNumbers{

    @Override
    public int getPlannedNumber(int from, int to) {
        int countOfAttempts = 0;
        int result;
        int low = from;
        int high = to;

        while (true){
            int mid = (low + high) / 2;
            result = mid;
            if (check(result)) {
                ConsoleHelper.writeMessage("Count of attempts: '" + countOfAttempts + "'.");
                return result;
            } else if (isMore(result)){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            countOfAttempts++;
        }
    }
}
