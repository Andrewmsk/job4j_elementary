package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int partialResult1 = first > third ? first : third;
        int partialResult2 = second > third ? second : third;
        int result = first > second ? partialResult1 : partialResult2;
        return result;
    }
}