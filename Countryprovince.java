import java.util.Scanner;

class Main{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Where are you from (Province or Country)? ");
String region = scanner.nextLine();
if (region.equalsIgnoreCase("Toronto")) {
System.out.println("Toronto is knows for its city and CN tower.");
} else if (region.equalsIgnoreCase("Canada")) {
System.out.println("Canada is known for its food culture and diversity.");
} else if (region.equalsIgnoreCase("USA")) {
System.out.println("The USA is known for its landmarks like Hollywood, New York, California, and etc.");
} else {
  System.out.println("I don't know anything about " + region);
        }
    }
}
