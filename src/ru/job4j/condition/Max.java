package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int... a) {
        if (a.length == 2) {
            return max(a[0], a[1]);
        } else if (a.length == 1) {
            return a[0];
        }
        int temp = max(a[0], a[1]);
        for (int i = 1; i < a.length - 1; i++) {
            int tempFor = max(a[i], a[i + 1]);
            temp = temp > tempFor ? temp : tempFor;
        }
        return temp;
    }
}