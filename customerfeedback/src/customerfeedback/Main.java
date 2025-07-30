package customerfeedback;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FeedbackManager manager = new FeedbackManager();
        int choice;
        do {
            System.out.println("\n--- Customer Feedback Analyzer ---");
            System.out.println("1. Add Feedback");
            System.out.println("2. View All Feedback");
            System.out.println("3. Clean Text (manual)");
            System.out.println("4. Mask Emails/Phone in Stored Feedback");
            System.out.println("5. Count Keyword Occurrences");
            System.out.println("6. Feedback Summary Report");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // discard invalid input
            }
            choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter feedback: ");
                    String msg = sc.nextLine();
                    manager.addFeedback(msg);
                    break;
                case 2:
                    manager.viewFeedbacks();
                    break;
                case 3:
                    manager.viewFeedbacks();
                    System.out.print("Enter the feedback number to clean: ");
                    int cleanIdx = sc.nextInt();
                    sc.nextLine(); 
                    if (cleanIdx >= 1 && cleanIdx <= manager.getFeedbackList().size()) {
                        String original = manager.getFeedbackList().get(cleanIdx - 1).getMessage();
                        String cleaned = manager.cleanText(original);
                        manager.getFeedbackList().set(cleanIdx - 1, new Feedback(cleaned));
                        System.out.println("✅ Cleaned and updated successfully.");
                    } else {
                        System.out.println("❌ Invalid feedback number.");
                    }
                    break;
                case 4:
                    manager.viewFeedbacks();
                    System.out.print("Enter the feedback number to mask: ");
                    int idx = sc.nextInt();
                    sc.nextLine(); 
                    if (idx >= 1 && idx <= manager.getFeedbackList().size()) {
                        String original = manager.getFeedbackList().get(idx - 1).getMessage();
                        String masked = manager.maskSensitive(original);
                        manager.getFeedbackList().set(idx - 1, new Feedback(masked));
                        System.out.println("✅ Masked and updated successfully.");
                    } else {
                        System.out.println("❌ Invalid feedback number.");
                    }
                    break;
                case 5:
                    System.out.print("Enter keyword to count: ");
                    String keyword = sc.nextLine();
                    System.out.println("🔍 Occurrences of \"" + keyword + "\": " + manager.countKeyword(keyword));
                    break;
                case 6:
                    manager.generateSummary();
                    break;
                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 7);
        sc.close();
    }
}