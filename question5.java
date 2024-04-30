import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter the first boolean value (true/false): ");
        boolean value1 = scanner.nextBoolean();
      
        System.out.print("Enter the second boolean value (true/false): ");
        boolean value2 = scanner.nextBoolean();
      
        boolean resultAND = value1 && value2;
        System.out.println("Logical AND: " + resultAND);
      
        boolean resultOR = value1 || value2;
        System.out.println("Logical OR: " + resultOR);
      
        boolean resultNOT1 = !value1;
        System.out.println("Logical NOT (for first value): " + resultNOT1);
      
        boolean resultNOT2 = !value2;
        System.out.println("Logical NOT (for second value): " + resultNOT2);

        scanner.close();
    }
}
