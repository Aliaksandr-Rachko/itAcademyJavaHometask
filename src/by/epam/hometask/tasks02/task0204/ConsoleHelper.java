package by.epam.hometask.tasks02.task0204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class for output the message and reading of number.
 * I can change this class and go the message everywhere.
 */
public class ConsoleHelper {
    private ConsoleHelper() { }

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String text = null;
        try {
            text = READER.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text != null ? text : "null";
    }

    public static int readInt() {
        String text = readString();
        try {
            return Integer.parseInt(text.trim());
        } catch (NumberFormatException e){
            System.out.println("It's not number. Try again...");
            return readInt();
        }
    }
}
