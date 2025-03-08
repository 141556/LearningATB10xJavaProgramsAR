package ControlStatements;

import java.util.Scanner;

public class hackerRank {
    public static void main(String[] args) {
        //Grade calculation
        //A : 90-100
        //B : 80-89
        //C : 70 =79
        //D : 60 -69
        //E : below 60

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int marks = sc.nextInt();
        if (marks>=90 && marks<=100){
            System.out.println('A');
        }
        else if (marks>=80 && marks<=89) {
            System.out.println('B');
        }
        else if(marks>=70 && marks<=79){
            System.out.println('C');
        }
        else if(marks>=60 && marks<=69){
            System.out.println('D');
        }
        else
        {
            System.out.println('E');
        }
        sc.close();
    }
}
