import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Pizza");
        System.out.println("2. Fries");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Pizza();
                break;
            case 2:
                Fries();
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }

        scanner.close();
    }

    public static void Pizza() {
        System.out.println("You have chosen Pizza");
    }

    public static void Fries() {
        System.out.println("You have chosen Fries.");
    }
}
