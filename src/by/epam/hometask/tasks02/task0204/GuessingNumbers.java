package by.epam.hometask.tasks02.task0204;

public abstract class GuessingNumbers {

    /**
     * Returns planned number
     * @param from the first element (inclusive) to be guessing
     * @param to the last element (inclusive) to be guessing
     * @return planned number
     */
    public abstract int getPlannedNumber(int from, int to);

    /**
     * Checks 'Is planned number'.
     * @param number a number for checking
     * @return {@code true} if {@code number} is planned number
     */
    protected boolean check(int number) {
        ConsoleHelper.writeMessage("This is '" + number + "' ?");
        return askYesOrNo();
    }

    /**
     * Asks 'yes' or 'no'.
     * @return {@code true} if user write 'y', {@code false} if user write 'n'
     */
    protected boolean askYesOrNo() {
        ConsoleHelper.writeMessage("Write 'y' - yes, or 'n' - no ...");

        String data = ConsoleHelper.readString().trim();
        if (data.equals("y")) {
            return true;
        }
        if (data.equals("n")) {
            return false;
        }
        ConsoleHelper.writeMessage("Try again...");
        return askYesOrNo();
    }

    /**
     * Asks 'Is this number more then planned number'.
     * @param number a number for checking
     * @return {@code true} if {@code number} is more then planned number
     */
    protected boolean isMore(int number){
        ConsoleHelper.writeMessage("This number is more then '" + number + "' ?");
        return askYesOrNo();
    }
}