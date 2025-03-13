import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius:");
        double r = sc.nextDouble();
        sc.close();

        double area = Math.PI * r * r; 
        double circumference = 2 * Math.PI * r;

        System.out.println("Area is: " + area);
        System.out.println("Circumference is: " + circumference);
    }
}
