package LoopStatements;

import java.util.Scanner;

public class do_While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = sc.nextInt();
        do {
            System.out.println("do loop");

        }
        while (a <= 5); {
            System.out.println(a);
        }



    }
}
