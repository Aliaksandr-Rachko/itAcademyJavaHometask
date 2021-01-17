package by.epam.hometask.tasks02.task0203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 3. (3 балла). Задать пользователю любой вопрос и дать ограниченное количество попыток для верного ответа.
 *    Предусмотреть возможность сдаться.
 */
public class Solution {
    public static void main(String[] args) {
        askMainQuestion();
    }

    public static final String MAIN_QUESTION = "What is a seance of life?";
    private static final String ANSWER = "42";

    public static final int NUMBER_OF_ATTEMPTS = 3;

    /**
     * Asks main question, writing it in console.
     * Then reading answer from console and prints result in console
     */
    public static void askMainQuestion(){
        System.out.println(MAIN_QUESTION);
        System.out.printf("\tYou have %d attempts.\n\tWrite your answer or 'surrender'...\n",
                NUMBER_OF_ATTEMPTS );

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String usersAnswer;
            int counter = 0;
            while (!(usersAnswer = br.readLine()).equals("surrender") && ++counter < NUMBER_OF_ATTEMPTS){
                if (usersAnswer.equals(ANSWER)) {
                    System.out.println("You win :)");
                    return;
                }
            }
            System.out.println("You lose :(");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
