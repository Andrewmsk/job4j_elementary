package ru.job4j.array;

import java.util.Arrays;

public class LengthArrayArrays {

    public static void main(String[] args) {
        int[][] numbers = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        Arrays.stream(numbers).forEach(a -> System.out.println(
                "Размер вложенного массива равен: " + a.length));
    }
}
