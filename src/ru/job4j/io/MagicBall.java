package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
            Scanner scanner = new Scanner(System.in);
            String inputText = scanner.nextLine();
            int answer = new Random().nextInt(3);
            String answerText = answer == 0 ? "Да" : answer == 1 ? "Нет" : "Может быть";
            System.out.println(answerText + "\n");
        }
    }
}
