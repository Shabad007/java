import java.util.Scanner;

public class DisplayNumber {
    public static void main(String[] args) 
        Scanner scanner = new Scanner(System.in);
        
System.out.print("Enter a number: ");
 int number = scanner.nextInt();

System.out.println("You entered: " + number);

   
 scanner.close();
    }
}
