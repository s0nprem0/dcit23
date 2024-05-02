/**
 *
 * @author Jayson Bulugagao | BSIT 1-4
 */
import java.util.Scanner;
//  WHILE LOOP

import java.util.Scanner;

public class LaboratoryExercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String monitor = "Monitor";
        double monitorPrice = 7000.0;
        int monitorQty = 0;

        String mouse = "Mouse";
        double mousePrice = 800.0;
        int mouseQty = 0;

        String keyboard = "Keyboard";
        double keyboardPrice = 1000.0;
        int keyboardQty = 0;

        double totalPrice = 0;

        while (true) {
            System.out.println("Shopping Cart \n 1. Buy \n 2. Check Cart \n 3. Exit \n Enter your choice:");
            int s = sc.nextInt();

            if (s == 1) {
                System.out.println("AVAILABLE PRODUCTS");
                System.out.println("1. " + monitor + " - Php " + monitorPrice);
                System.out.println("2. " + mouse + " - Php " + mousePrice);
                System.out.println("3. " + keyboard + " - Php " + keyboardPrice);
                System.out.print("Enter product number (0 to cancel): ");
                int ps = sc.nextInt();
                if (ps == 0) {
                    continue;
                }
                if (ps == 1) {
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    monitorQty += quantity;
                    totalPrice += quantity * monitorPrice;
                } else if (ps == 2) {
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    mouseQty += quantity;
                    totalPrice += quantity * mousePrice;
                } else if (ps == 3) {
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    keyboardQty += quantity;
                    totalPrice += quantity * keyboardPrice;
                }
            }

            if (s == 2) {
                System.out.println("Shopping Cart:");
                System.out.println(monitor + ": " + monitorQty + " x Php " + monitorPrice + " = Php " + (monitorQty * monitorPrice));
                System.out.println(mouse + ": " + mouseQty + " x Php " + mousePrice + " = Php " + (mouseQty * mousePrice));
                System.out.println(keyboard + ": " + keyboardQty + " x Php " + keyboardPrice + " = Php " + (keyboardQty * keyboardPrice));
                System.out.println("Total Price: Php " + totalPrice);
            }

            if (s == 3) {
                System.out.println("Thank you for shopping and goodbye");
                break;
            }
        }
    }
}