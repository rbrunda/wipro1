package shoppingcartproject;
import java.util.*;
public class shopping_cart {
    // Product class
    static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
            this.quantity = 1;
        }

        public String getName() { return name; }
        public double getPrice() { return price; }
        public int getQuantity() { return quantity; }

        public void increaseQuantity() { quantity++; }
        public void decreaseQuantity() {
            if (quantity > 0) quantity--;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Product other) {
                return this.name.equalsIgnoreCase(other.name) && this.price == other.price;
            }
            return false;
        }

        @Override
        public String toString() {
            return name + " (₹" + price + ") x " + quantity;
        }
    }

    // ShoppingCart class
    static class ShoppingCart {
        private List<Product> cart = new ArrayList<>();
        private Deque<String> undoStack = new ArrayDeque<>();

        public void addProduct(String name, double price) {
            for (Product p : cart) {
                if (p.getName().equalsIgnoreCase(name) && p.getPrice() == price) {
                    p.increaseQuantity();
                    System.out.println("✅ Item already in cart. Increased quantity.");
                    recordAction("REMOVE|" + name + "|" + price);
                    return;
                }
            }
            Product newProduct = new Product(name, price);
            cart.add(newProduct);
            System.out.println("✅ Added to cart.");
            recordAction("REMOVE|" + name + "|" + price);
        }

        public void removeProduct(String name, double price) {
            Iterator<Product> iterator = cart.iterator();
            while (iterator.hasNext()) {
                Product p = iterator.next();
                if (p.getName().equalsIgnoreCase(name) && p.getPrice() == price) {
                    recordAction("ADD|" + name + "|" + price + "|" + p.getQuantity());
                    iterator.remove();
                    System.out.println("❌ Removed from cart.");
                    return;
                }
            }
            System.out.println("⚠ Item not found.");
        }

        public void displayCart() {
            System.out.println("\n🛒 Items in Cart:");
            if (cart.isEmpty()) {
                System.out.println("Cart is empty.");
                return;
            }

            double total = 0;
            for (Product p : cart) {
                System.out.println(p);
                total += p.getPrice() * p.getQuantity();
            }
            System.out.printf("💰 Total: ₹%.2f%n", total);
        }

        public void undo() {
            if (undoStack.isEmpty()) {
                System.out.println("⚠ Nothing to undo.");
                return;
            }

            String action = undoStack.pop();
            String[] parts = action.split("\\|");
            String type = parts[0];
            String name = parts[1];
            double price = Double.parseDouble(parts[2]);

            if (type.equals("REMOVE")) {
                removeProduct(name, price); // this will push an ADD back, but it's okay for now
                undoStack.pop(); // remove reverse action to keep stack consistent
            } else if (type.equals("ADD")) {
                int qty = Integer.parseInt(parts[3]);
                for (int i = 0; i < qty; i++) {
                    addProduct(name, price);
                }
                undoStack.pop(); // remove reverse
            }

            System.out.println("↩ Undid last action.");
        }

        private void recordAction(String action) {
            undoStack.push(action);
            if (undoStack.size() > 5) {
                // Keep only last 5 actions
                List<String> temp = new ArrayList<>(undoStack);
                undoStack.clear();
                for (int i = 0; i < 5; i++) {
                    undoStack.push(temp.get(i));
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n--- Flipkart Shopping Cart ---");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Cart");
            System.out.println("4. Undo Last Action");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String addName = sc.nextLine();
                    System.out.print("Enter product price: ");
                    double addPrice = sc.nextDouble();
                    cart.addProduct(addName, addPrice);
                    break;
                case 2:
                    System.out.print("Enter product name: ");
                    String remName = sc.nextLine();
                    System.out.print("Enter product price: ");
                    double remPrice = sc.nextDouble();
                    cart.removeProduct(remName, remPrice);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    cart.undo();
                    break;
                case 5:
                    System.out.println("👋 Exiting. Thank you!");
                    return;
                default:
                    System.out.println("❗ Invalid choice.");
            }
        }
    }
}