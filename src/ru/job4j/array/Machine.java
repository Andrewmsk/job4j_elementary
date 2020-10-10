package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    private final static int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int changeRemain = money - price;
        for (int coin: COINS) {
            while (changeRemain >= coin) {
                changeRemain -= coin;
                rsl[size] = coin;
                size += 1;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
