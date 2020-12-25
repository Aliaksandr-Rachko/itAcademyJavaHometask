package by.epam.hometask.tasks01.task0104;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isNear(10, 2)); // false
        System.out.println(isNear(100, 92)); // true
        System.out.println(isNear(100, 105)); // true
        System.out.println(isNear(-100, -105)); // true
        System.out.println(isNear(56, 53)); // true
        System.out.println(isNear(56, 42)); // false
    }

    /**
     * Checks is the number {@code b} near the number {@code a} in 10%.
     * @param a an argument
     * @param b another argument
     * @return <tt>true</tt> if the {@code b} is near the {@code a} in 10%, else <tt>false</tt>
     */
    public static boolean isNear(int a, int b){
        double k = (double) a / b;
        return 0.90 <= k && k <= 1.1;
    }
}
