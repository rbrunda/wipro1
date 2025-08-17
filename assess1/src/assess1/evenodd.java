package assess1;
import java.util.*;
public class evenodd {
    public int[] evenOdd(int[] nums) {
        int i = 0;
        while (i < nums.length && nums[i] % 2 == 0) {
            i++;
        }
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        evenodd eo = new evenodd();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = eo.evenOdd(nums);
        System.out.print("Array after even-odd arrangement: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}