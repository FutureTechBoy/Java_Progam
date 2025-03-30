class Student {
    private int studentId;
    private String name;
    private double marks;

    // Constructor with validation
    public Student(int studentId, String name, double marks) {
        setStudentId(studentId);
        this.name = name;
        setMarks(marks);
    }

    // Setter for studentId with validation
    public void setStudentId(int studentId) {
        if (studentId > 0) {
            this.studentId = studentId;
        } else {
            System.out.println("Error: Student ID must be positive. Setting to default value 1.");
            this.studentId = 1;
        }
    }

    // Setter for marks with validation
    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Error: Marks must be between 0 and 100. Setting to 0.");
            this.marks = 0;
        }
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Method to check pass/fail status
    public boolean isPassed() {
        return marks >= 40;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Status: " + (isPassed() ? "Passed ✅" : "Failed ❌"));
    }
}

// Test Class
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice Johnson", 85.5);
        Student student2 = new Student(102, "Bob Smith", 39.0);
        Student student3 = new Student(103, "Charlie Davis", 60.0);
        Student student4 = new Student(104, "David Lee", -10.5); // Testing validation

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
    }
}
