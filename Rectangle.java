import java.util.Scanner;

public class Rectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length:");
        double length = sc.nextDouble();

        System.out.println("Enter the Width:");
        double width = sc.nextDouble();
        
        sc.close();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of the Rectangle: " + area);
        System.out.println("Perimeter of the Rectangle: " + perimeter);
    }
}
