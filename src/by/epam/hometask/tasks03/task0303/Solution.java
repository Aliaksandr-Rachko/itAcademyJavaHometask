package by.epam.hometask.tasks03.task0303;

/*
 * 3. Пользователь вводит имя и возраст. Вывести сообщение,
 *    приветствующее пользователя. - форматирование (String.format)
 *    через спецификаторы
 */
public class Solution {
    public static void main(String[] args) {
        greets();
    }

    /**
     * Greets user.
     */
    public static void greets(){
        ConsoleHelper.writeMessage("Write your name...");
        String userName = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("Write your age...");
        int age = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage(getWelcomeString(userName, age));
    }

    /**
     * Returns greeting string.
     * @param userName the user's name
     * @param userAge the user's age
     * @return the greeting string
     */
    public static String getWelcomeString(String userName, int userAge){
        return String.format("Hello %s, %d years old!", userName, userAge);
    }
}
