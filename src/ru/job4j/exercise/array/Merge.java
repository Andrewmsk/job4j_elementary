package ru.job4j.exercise.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftCounter = 0;
        int rightCounter = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (leftCounter >= left.length) {
                rsl[i] = right[rightCounter];
                rightCounter++;
            } else if (rightCounter >= right.length) {
                rsl[i] = left[leftCounter];
                leftCounter++;
            } else if (left[leftCounter] <= right[rightCounter]) {
                rsl[i] = left[leftCounter];
                leftCounter++;
            } else {
                rsl[i] = right[rightCounter];
                rightCounter++;
            }
        }
        return rsl;
    }
}
