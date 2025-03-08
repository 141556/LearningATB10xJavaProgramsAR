package ControlStatements;

import java.util.Scanner;

public interface If_ElseIf_Else {
    public static void main(String[] args) {
        //num1 > num2
        //num2 >num1
        //num1 == num2
        Scanner sc = new Scanner(System.in);
        System.out.println("input the value of num1");
        int num1 = sc.nextInt();
        System.out.println("input the value of num2");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("num1");
        } else if (num2 > num1) {
            System.out.println("num2");
        } else {
            System.out.println("equal");
        }
        sc.close();
    }
}
