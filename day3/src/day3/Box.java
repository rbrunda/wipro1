package day3;
import java.util.Scanner;
public class Box {
    double width, height, depth;
    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    public double getVolume() {
        return width * height * depth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w, h, d;
        System.out.print("Enter width: ");
        w = sc.nextDouble();
        while (w <= 0) {
            System.out.print("Width must be positive. Enter again: ");
            w = sc.nextDouble();
        }
        System.out.print("Enter height: ");
        h = sc.nextDouble();
        while (h <= 0) {
            System.out.print("Height must be positive. Enter again: ");
            h = sc.nextDouble();
        }
        System.out.print("Enter depth: ");
        d = sc.nextDouble();
        while (d <= 0) {
            System.out.print("Depth must be positive. Enter again: ");
            d = sc.nextDouble();
        }
        Box b = new Box(w, h, d);
        System.out.println("Volume: " + b.getVolume());
        sc.close();
    }
}