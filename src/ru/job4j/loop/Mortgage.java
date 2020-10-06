package ru.job4j.loop;

public class Mortgage {

    public static int year(int amount, int salary, double percent) {
        int year = 1;
        amount = (int) (amount * (1 + percent / 100));
        while (amount >= salary) {
            year ++;
            amount = amount - salary;
            amount += (int) (amount * (percent / 100));
            if (year > 100) {
                break;      // sout "you are died"; exit 1;
            }
        }
        return year;
    }
}