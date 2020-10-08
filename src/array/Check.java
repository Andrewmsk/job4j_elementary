package array;

public class Check {

    public static boolean mono(boolean[] data) {
        for (boolean d : data) {
            if (data[0] != d) {
                return false;
            }
        }
        return true;
    }
}
