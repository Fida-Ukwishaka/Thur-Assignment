import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = num.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++){
           int factorial = number*i;
        }
        System.out.println(number+"! = "+factorial);
    }
}
