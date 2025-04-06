package Arrays;

import java.util.Scanner;

public class Lab010_Pattern_Right_Triangle_Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//by user input
        System.out.println("Enter the number:");
        int n = sc.nextInt();
//        int n =5; by fixed number
        for (int i =0; i<n;i++){
            for (int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
