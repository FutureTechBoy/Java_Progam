import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking matrix size input with validation
        System.out.print("Enter the number of rows: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }
        int cols = scanner.nextInt();

        // Handle zero or negative dimensions
        if (rows <= 0 || cols <= 0) {
            System.out.println("Rows and columns must be greater than 0.");
            scanner.close();
            return;
        }

        int[][] matrix = new int[rows][cols];

        // Taking matrix input
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter only integers.");
                    scanner.close();
                    return;
                }
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculating row sums
        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum: " + rowSum);
        }

        // Calculating column sums
        System.out.println("Sum of each column:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum: " + colSum);
        }

        scanner.close();
    }
}
