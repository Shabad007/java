import java.util.Scanner;

class Main { 
  public static void main(String[] args) {
    double pi = 3.1415;
    Scanner input = new Scanner(System.in);
    System.out.print("ENTER RADIUS: ");
    double radius = input.nextDouble(); 
    if (radius > 0) {
    double area = pi * radius * radius;
    System.out.println("area =" + area);
    } 
    else {
    System.out.println("ENTER RADIUS GREATER THAN       ZERO");
    }
   input.close();
  }
}
  
