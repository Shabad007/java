public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        
        while (i <= 100) {
            sum += i;
            i++;
        }
        
        System.out.println("Sum of natural numbers from 1 to 100: " + sum);
    }
}
