public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        
        do {
            sum += i;
            i++;
        } while (i <= 100);
        
        System.out.println("Sum of natural numbers from 1 to 100: " + sum);
    }
}
