package ControlStatements;

import java.util.Scanner;

public class nested_If {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the age");
//        int age = sc.nextInt();
        if (200==100) {
            System.out.println("outer if block");

            if (100 == 500) {
                System.out.println("1st inner if block");
            }
            else{
                System.out.println("1st inner else block");
            }
            if(200>=500){
                System.out.println("2nd inner if block");
            }
            else{
                System.out.println("2nd inner else block");
            }
        }
        else{
            System.out.println("outer else block");
        }

        }
    }

