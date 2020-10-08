package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        for (char symbol: board[row]) {
            if (symbol != 'X') {
                return false;
            }
        }
        return true;
    }
}
