package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException(String.format("Element \"%s\" not found", key));
    }

    public static void main(String[] args) {
        try {
            FindEl.indexOf(new String[] {"aaa"}, "bbb");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
