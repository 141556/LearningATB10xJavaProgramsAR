package Tasks;

import java.util.Scanner;

public class name_Age_Salary_Scanner {
    public static void main(String[] args) {
        //To provide name from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        // age
        System.out.println("Enter age");
        int age = sc.nextInt();
        //salary
        System.out.println("Enter salary");
        double salary = sc.nextDouble();

        System.out.println("---User information---");
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        sc.close();


    }
}
