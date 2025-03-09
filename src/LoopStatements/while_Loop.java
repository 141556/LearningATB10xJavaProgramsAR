package LoopStatements;

import java.util.Scanner;

public class while_Loop {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a value");
        int a = sc.nextInt();
        while(a<=5){
            System.out.println(a);
        }
    }
}
