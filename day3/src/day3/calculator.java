package day3;
import java.util.Scanner;
public class calculator {
    public static int powerInt(int n1, int n2) {
        return (int) Math.pow(n1, n2);
    }
    public static double powerDouble(double n1, int n2) {
        return Math.pow(n1, n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (int): ");
        int intBase = sc.nextInt();
        System.out.print("Enter exponent (int): ");
        int intExp = sc.nextInt();
        int intResult = powerInt(intBase, intExp);
        System.out.println(intBase + "^" + intExp + " = " + intResult);
        System.out.print("Enter base (double): ");
        double doubleBase = sc.nextDouble();
        System.out.print("Enter exponent (int): ");
        int doubleExp = sc.nextInt();
        double doubleResult = powerDouble(doubleBase, doubleExp);
        System.out.println(doubleBase + "^" + doubleExp + " = " + doubleResult);
        sc.close();
    }
}