class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Parameterized constructor with validation
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Setter with validation
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Error: Length must be greater than zero. Setting to default value 1.");
            this.length = 1;
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Error: Width must be greater than zero. Setting to default value 1.");
            this.width = 1;
        }
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Calculate Area
    public double calculateArea() {
        return length * width;
    }

    // Calculate Perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Display Rectangle Information
    public void displayInfo() {
        System.out.println("\nRectangle Details:");
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

// Test Class
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(); 
        Rectangle rect2 = new Rectangle(5.0, 3.5);
        Rectangle rect3 = new Rectangle(-10, 4); // Testing validation

        rect1.displayInfo();
        rect2.displayInfo();
        rect3.displayInfo();
    }
}
