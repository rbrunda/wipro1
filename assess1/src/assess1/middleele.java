package assess1;
import java.util.Scanner;
public class middleele {
    public int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }
    public static void main(String[] args) {
        middleele me = new middleele();
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        System.out.println("Enter 3 elements for first array:");
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter 3 elements for second array:");
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }
        int[] result = me.middleWay(a, b);
        System.out.println("Middle elements: {" + result[0] + ", " + result[1] + "}");
        sc.close();
    }
}