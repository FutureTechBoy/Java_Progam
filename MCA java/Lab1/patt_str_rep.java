import java.util.Arrays;
import java.util.Scanner;

public class patt_str_rep {

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number, sum = 0, digits = 0;
        int temp = number;

        while (temp > 0) { // Finding number of digits
            temp /= 10;
            digits++;
        }

        temp = number;
        while (temp > 0) { // Calculating Armstrong sum
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == originalNumber;
    }

    // Method to sort an array of strings
    public static void sortStrings(String[] arr) {
        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
    }

    // Method to count vowels and consonants in a given text
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

    // Method for search and replace in a string
    public static String searchAndReplace(String text, String pattern, String replacement) {
        return text.replaceAll(pattern, replacement);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Checking Armstrong Number
        while (true) {
            System.out.print("Enter a number to check if it is an Armstrong number: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }

        System.out.println(number + (isArmstrong(number) ? " is an Armstrong number." : " is not an Armstrong number."));

        // Sorting Strings
        int n;
        while (true) {
            System.out.print("Enter the number of strings: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }

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

        // Counting vowels and consonants
        System.out.print("Enter a line of text: ");
        String text = scanner.nextLine().trim();

        if (!text.isEmpty()) {
            countVowelsAndConsonants(text);
        } else {
            System.out.println("No text provided. Skipping vowel and consonant count.");
        }

        // Search and Replace
        System.out.print("Enter the pattern to search: ");
        String pattern = scanner.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacement = scanner.nextLine();

        if (!pattern.isEmpty()) {
            String updatedText = searchAndReplace(text, pattern, replacement);
            System.out.println("Updated text: " + updatedText);
        } else {
            System.out.println("No valid pattern provided. Skipping search and replace.");
        }

        scanner.close();
    }
}
