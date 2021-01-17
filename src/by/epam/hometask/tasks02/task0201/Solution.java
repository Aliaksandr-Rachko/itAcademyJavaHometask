package by.epam.hometask.tasks02.task0201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 1*. Вывести пирамиду из цифр. Размер вводится пользователем. Пирамида - фигура такого вида:
 *     1 1 1 1 1
 *     1 2 2 2 1
 *     1 2 3 2 1
 *     1 2 2 2 1
 *     1 1 1 1 1
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Write pyramid's size, please...");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int[][] pyramid = getPyramid(size);

        printMatrix(pyramid);
    }

    /**
     * Returns filling pyramid giving size.
     *
     * <p>Example:
     * <p> 1 1 1 1 1
     * <p> 1 2 2 2 1
     * <p> 1 2 3 2 1
     * <p> 1 2 2 2 1
     * <p> 1 1 1 1 1
     *
     * @param size size of pyramid
     * @return an array of array
     */
    public static int[][] getPyramid(int size){
        int[][] pyramid = new int[size][size];
        for (int i = 0; i < pyramid.length; i++){
            fillLevelOfPyramid(pyramid, i);
        }
        return pyramid;
    }

    /**
     * Fills level of pyramid.
     * @param pyramid an array of array
     * @param level a pyramid's level
     */
    private static void fillLevelOfPyramid(int[][] pyramid, int level){
        for (int i = level; i < pyramid.length - level; i++){
            for (int j = level; j < pyramid[i].length - level; j++) {
                pyramid[i][j] = level + 1;
            }
        }
    }

    /**
     * Prints matrix to console
     * @param matrix a matrix
     */
    public static void printMatrix(int[][] matrix){
        for (int[] line : matrix){
            System.out.println(Arrays.toString(line));
        }
    }
}