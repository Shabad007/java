import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("25 + 25 = ");
    int answer1 = 50;
    int userAnswer1 = scanner.nextInt();
    if (userAnswer1 == answer1) {
      System.out.println("Correct");
    } else {
      System.out.println("Incorrect");
    }
   System.out.print("50 / 2 = ");
    int answer2 = 25;
    int userAnswer2 = scanner.nextInt();
    if (userAnswer2 == answer2) {
      System.out.println("Correct");
    } else {
      System.out.println("Incorrect");
    }
    System.out.print("5 * 8 = ");
    int answer3 = 40 ;
    int userAnswer3 = scanner.nextInt();
    if (userAnswer3 == answer3) {
      System.out.println("Correct");
    } else {
      System.out.println("Incorrect");
    }
    scanner.close();
  }
}
