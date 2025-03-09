package ControlStatements;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of side1:");
        double side1 = sc.nextDouble();
        System.out.println("Enter the values of side2:");
        double side2 = sc.nextDouble();
        System.out.println("Enter the values of side3:");
        double side3 = sc.nextDouble();
        // side1 == side2 == side3 - equilateral
        // side1 == side2 && side1 = side3 && side2 != side3 or side1 != side3 - Isolated
        //side1 != side2 != side3 - scalene

        if (side1 <=0 && side2 <=0 && side3<=0){
            System.out.println("Invalid input: The value must be positive");
        }
        else{
            if(side1 ==side2 && side2 ==side3 && side1 == side3)
            {
                System.out.println("The triangle is equilateral");
            }
            else if (side1==side2 ||side2 ==side3 || side1 ==side3){
                System.out.println("The triangle is isolated");
            }
            else{
                System.out.println("The triangle is scalene");

            }
        }

    }
}
