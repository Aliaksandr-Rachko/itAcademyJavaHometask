package by.epam.hometask.tasks03.tasl0304;

/*
 * 4. Разбить строку на отдельные слова и посчитать количество вхождений
 *    для каждого слова. - через split - будет считать разделителем пробел
 */
public class Solution {
    public static final String TEST_STRING =
            "Three can keep a secret, if two of them are dead. Benjamin Franklin";

    public static void main(String[] args) {
        System.out.println(
                "Count of words in the TEST_STRING: " +
                getAmountOfWords(TEST_STRING));
    }

    /**
     * Returns count of words in the giving string
     * @param string a string
     * @return count of words in the giving string
     */
    public static int getAmountOfWords(String string){
        return string.split("[,.!]?\\s").length;
    }
}
