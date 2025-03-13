import java.util.Scanner;

public class SearchAndReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the original text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the pattern to search: ");
        String pattern = scanner.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacement = scanner.nextLine();

        // Performing search and replace
        String updatedText = text.replaceAll(pattern, replacement);

        // Displaying result
        System.out.println("Updated text: " + updatedText);

        scanner.close();
    }
}
