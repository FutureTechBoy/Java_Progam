import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Maths mark:");
        double maths = sc.nextDouble();
        
        System.out.println("Enter Your Physics mark:");
        double physics = sc.nextDouble();
        
        System.out.println("Enter Your Chemistry mark:");
        double chemistry = sc.nextDouble();
        
        sc.close();
        
        int min_mark = 50; 

        if (maths >= min_mark && physics >= min_mark && chemistry >= min_mark) {
            System.out.println("You are eligible for higher studies.");
        } else if ((maths >= min_mark && physics >= min_mark) || 
                   (maths >= min_mark && chemistry >= min_mark) || 
                   (physics >= min_mark && chemistry >= min_mark)) {
            System.out.println("You are conditionally eligible for higher studies.");
        } else {
            System.out.println("You are not eligible for higher studies.");
        }
    }
}
