package day4;
public class appliance {
    public static void main(String[] args) {
        new WashingMachine().start();
        new Refrigerator().start();
    }
}
class WashingMachine {
    void start() {
        System.out.println("Washing machine running...");
    }
}
class Refrigerator {
    void start() {
        System.out.println("Refrigerator cooling...");
    }
}