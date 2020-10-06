package array;

import java.util.Arrays;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        var prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Brad";
        names[1] = "John";
        names[2] = "Paul";
        names[3] = "Steve";
        Arrays.stream(names).iterator().forEachRemaining(System.out::println);
    }
}
