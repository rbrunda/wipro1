package day3;
import java.util.Arrays;
public class reversedigits {
    public static void main(String[] args) {
        int[] arr = {1789, 2035, 1899, 1456, 2013,
                     1458, 2458, 1254, 1472, 2365,
                     1456, 2165, 1457, 2456};
        System.out.println("Original array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}