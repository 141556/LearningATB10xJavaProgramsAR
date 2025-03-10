package Tasks;

import java.util.Scanner;

public class name_Age_Salary_WithoutScanner {
    public static void main(String[] args) {

        String name = args[0];
        // age

        int age = Integer.parseInt(args[1]);
        //salary

        double salary = Double.parseDouble(args[2]);

        System.out.println("---User information---");
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
