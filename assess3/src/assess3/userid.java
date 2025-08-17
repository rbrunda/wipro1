package assess3;
import java.util.Scanner;
public class userid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String pin = sc.nextLine();
        int n = sc.nextInt();
        String smallerName, longerName;
        if (firstName.length() == lastName.length()) {
            if (firstName.compareToIgnoreCase(lastName) < 0) {
                smallerName = firstName;
                longerName = lastName;
            } else {
                smallerName = lastName;
                longerName = firstName;
            }
        } else if (firstName.length() < lastName.length()) {
            smallerName = firstName;
            longerName = lastName;
        } else {
            smallerName = lastName;
            longerName = firstName;
        }
        char lastLetter = smallerName.charAt(smallerName.length() - 1);
        char digitFromLeft = pin.charAt(n - 1);
        char digitFromRight = pin.charAt(pin.length() - n);
        String userId = lastLetter + longerName + digitFromLeft + digitFromRight;
        StringBuilder toggled = new StringBuilder();
        for (char ch : userId.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch);
            }
        }
        System.out.println(toggled.toString());
        sc.close();
    }
}
