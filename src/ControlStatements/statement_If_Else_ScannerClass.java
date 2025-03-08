package ControlStatements;

import java.util.Scanner;

public class statement_If_Else_ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//syntax to take input from user
        System.out.println("Enter your age in numbers/Integer value");
        int age = sc.nextInt();// expecting the next integer value
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
