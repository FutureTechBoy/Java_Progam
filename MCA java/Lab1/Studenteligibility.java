// importing Scanner class
import java.util.Scanner;  

public class Studenteligibility {
    public static void main(String[] args) {

        // create object for user's input
        Scanner sc = new Scanner(System.in);  

        // get  user's input for marks on each 
        System.out.print("Enter marks for Math: ");
        double maths = sc.nextDouble();

        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();

        // calculating total marks of each
        double total_marks = maths + physics + chemistry;
        double total_Math_Physics = maths + physics;

        //conditions for checking each subs marks
        if (maths >= 60 && physics >= 50 && chemistry >= 40 && total_marks >= 200) {
            System.out.println("The student is eligible");
        } else if (total_Math_Physics >= 150) {
            System.out.println("The student is eligible because of "+total_Math_Physics+ " total marks in maths and physics");
        } else {
            System.out.println("The student is not eligible");
        }


        System.out.println("Total Marks: " + total_marks);

        //closing scanner
        sc.close();
    }
}