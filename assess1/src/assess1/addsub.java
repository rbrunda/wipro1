package assess1;
import java.util.Scanner;
public class addsub {
    public static int AddSub(int N, int opt) {
        int result = 0;
        int sign = 1;
        for (int i = N; i >= 1; i--) {
            if (opt == 1) {
                result += sign * i;
                sign *= -1; // Flip sign each time
            } else if (opt == 2) {
                result += ((N - i) % 2 == 0 ? 1 : -1) * i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N (1 ≤ N ≤ 10000): ");
        int N = sc.nextInt();
        System.out.print("Enter option (1 or 2): ");
        int opt = sc.nextInt();
        if (N < 1 || N > 10000 || (opt != 1 && opt != 2)) {
            System.out.println("Invalid input. Please enter N between 1 and 10000, and option as 1 or 2.");
        } else {
            int result = AddSub(N, opt);
            System.out.println("Result: " + result);
        }
        sc.close();
    }
}