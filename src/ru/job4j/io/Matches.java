package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        int matches = 11;
        int matchesPlayer = 0;
        System.out.println("Спичек - " + matches);
        Scanner scanner = new Scanner(System.in);

        while (matches > 0) {
            for (int i = 1; i < 3; i++) {
                while (true) {
                    System.out.println("Игрок " + i + ", введите кол-во спичек (от 1 до 3):");
                    matchesPlayer = scanner.nextInt();
                    if (matchesPlayer > 0 && matchesPlayer < 4) {
                        matches -= matchesPlayer;
                        break;
                    }
                    System.out.println("Неправильное кол-во спичек повторите ввод");
                }
                if (matches <= 0) {
                    System.out.println("Вы победили! \n");
                    break;
                }
                System.out.println("Осталось спичек " + matches);
            }
        }
    }
}
