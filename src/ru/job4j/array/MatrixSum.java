package ru.job4j.array;

public class MatrixSum {

    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] secondArray : array) {
            for (int valueSecondArray : secondArray) {
                rsl += valueSecondArray;
            }
        }
        return rsl;
    }
}
