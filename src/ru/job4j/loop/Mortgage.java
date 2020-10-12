package ru.job4j.loop;

public class Mortgage {

    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount >= 0) {
            amount += (int) (amount * (percent / 100));
            year++;
            amount = amount - salary;
            if (year > 100) {
                break;
            }
        }
        return year;
    }
}