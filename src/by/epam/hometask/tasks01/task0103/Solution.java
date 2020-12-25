package by.epam.hometask.tasks01.task0103;

public class Solution {
    public static void main(String[] args) {
        System.out.println(min(1,5,6)); // 1
        System.out.println(min(4,7,3)); // 3
        System.out.println(min(4,2,8)); // 2

        System.out.println(max(2,3,4)); // 4
        System.out.println(max(2,9,4)); // 9

        System.out.println(arithmeticsAverage(4,6,7)); // 5.66666666667
        System.out.println(arithmeticsAverage()); // 0
        System.out.println(arithmeticsAverage(56,83,775)); // 304.66666667
    }

    /**
     * Returns the greater of three int values.
     * @param a an argument
     * @param b another argument
     * @param c another argument
     * @return the larger of a, b and c
     */
    public static int min(int a, int b, int c) {
        return (a <= b && a <= c) ? a : (b <= a && b <= c) ? b : c;
    }

    /**
     * Returns the smaller of three int values.
     * @param a an argument
     * @param b another argument
     * @param c another argument
     * @return the smaller of a, b and c
     */
    public static int max(int a, int b, int c){
        return (a >= b && a >= c) ? a : (b >= a && b >= c) ? b : c;
    }

    /**
     * Counts the arithmetics average of givens numbers.
     * @param numbers numbers
     * @return the arithmetics average of givens numbers
     */
    public static double arithmeticsAverage(int ...numbers){
        if (numbers.length == 0) return 0;
        int result = 0;
        for (int n : numbers){
            result += n;
        }
        return (double) result / numbers.length;
    }
}
