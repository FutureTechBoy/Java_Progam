import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber {
    
    public static boolean isArmstrong(int number) {
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

    public static void sortStrings(String[] arr) {
        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
    }

    public static void countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        text = text.toLowerCase();
        
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }

    public static String searchAndReplace(String text, String pattern, String replacement) {
        return text.replace(pattern, replacement);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Checking Armstrong Number
        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            scanner.nextLine(); // Clear buffer
            
            if (isArmstrong(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Clear invalid input
        }

        // Sorting Strings
        System.out.print("Enter the number of strings: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            if (n > 0) {
                String[] strings = new String[n];
                System.out.println("Enter the strings:");
                for (int i = 0; i < n; i++) {
                    strings[i] = scanner.nextLine();
                }
                
                sortStrings(strings);
                
                System.out.println("Sorted strings:");
                for (String str : strings) {
                    System.out.println(str);
                }
            } else {
                System.out.println("No strings to sort.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Clear invalid input
        }

        // Counting vowels and consonants
        System.out.print("Enter a line of text: ");
        String text = scanner.nextLine();
        countVowelsAndConsonants(text);
        
        // Search and Replace
        System.out.print("Enter the pattern to search: ");
        String pattern = scanner.nextLine();
        
        System.out.print("Enter the replacement string: ");
        String replacement = scanner.nextLine();
        
        String updatedText = searchAndReplace(text, pattern, replacement);
        System.out.println("Updated text: " + updatedText);
        
        scanner.close();
    }
}