package assess1;
import java.util.*;
public class checknum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter search value: ");
        int search = sc.nextInt();
        sc.close();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
                break; 
            }
        }
        if (index == -1)
            System.out.println("element not found");
        else
            System.out.println("Found at index: " + index);
    }
}