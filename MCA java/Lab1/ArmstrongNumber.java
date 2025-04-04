import java.util.Scanner;

public class ArmstrongNumber {
    
    public static boolean isArmstrong(int number) {
        if (number < 0) {
            return false; // Armstrong numbers are non-negative
        }

        int originalNumber = number;
        int sum = 0;
        int digits = Integer.toString(number).length();
        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive number.");
        } else if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}
