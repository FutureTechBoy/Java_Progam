import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter Your Employee Type (manager/developer/intern):");
        String type = sc.nextLine().trim().toLowerCase();

        double salary;

       
        switch (type) {
            case "manager":
                salary = 50000;
                break;
            case "developer":
                salary = 30000;
                break;
            case "intern":
                salary = 15000;
                break;
            default:
                System.out.println("Invalid type. Please enter 'manager', 'developer', or 'intern'.");
                sc.close();
                return;
        }

       
        System.out.println("Enter Your Experience (in years):");
        double experience = sc.nextDouble();

        sc.close(); 

        
        double bonus = 0;

        if (experience >= 3 && experience <= 5) {
            bonus = salary * 0.10;  
        } else if (experience > 5) {
            bonus = salary * 0.20; 
        }

     
        double totalSalary = salary + bonus;

        System.out.println("\n--- Salary Details ---");
        System.out.println("Base Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}
