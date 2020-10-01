package ru.job4j;

public class ArgMethod {

    public static void hello() {
        System.out.println("Hello, null");
    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", " + age);
    }

    public static void hello(int age) {
        System.out.println("Hello, I'm "  + age + " years old");
    }

    public static void hello(String... name) {
        for (String n: name) {
            System.out.println("Hello, " + n);
        }
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello();

        ArgMethod.hello(name, age);

        ArgMethod.hello(age);

        ArgMethod.hello(name, name, name);
    }

}
