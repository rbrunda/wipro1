package assess1;
import java.util.*;
public class oneorfour {
	public boolean only14(int[] nums) {
		for (int i=0; i< nums.length; i++) {
			if (nums[i]!= 1 && nums[i] != 4) {
				return false;
				}
			}
		return true; 
		}
	public static void main(String[] args) {
        oneorfour one = new oneorfour();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] userArray = new int[n];
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            userArray[i] = sc.nextInt();
        }
        boolean result = one.only14(userArray);
        System.out.println("Result: " + result); // true if only 1s and 4s are present
        sc.close();
        }
}