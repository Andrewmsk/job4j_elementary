package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        int matches = 11;
        int matchesPlayer;
        boolean player = true;
        System.out.println("Спичек - " + matches);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            while (true) {
                int numberPlayer = player ? 1 : 2;
                System.out.println(String.format("Игрок %s Введите кол-во спичек (от 1 до 3):", numberPlayer));
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
            player = !player;
        }
    }
}
