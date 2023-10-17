import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.print("Enter three numbers: ");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();
    if (num1>num2){
    if (num1>num3){
    System.out.println("number 1 is the largest");
        }
    } else {   
    if(num2>num3){
    System.out.println("number 2 is largest");
          } else {
    System.out.println("number 3 is the largest");
      }
  }
    input.close();
  }
}
