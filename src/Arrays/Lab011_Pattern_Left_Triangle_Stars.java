package Arrays;

import java.util.Scanner;

public class Lab011_Pattern_Left_Triangle_Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//by user input using scanner class
        System.out.println("Enter the number:");
        int n = sc.nextInt();
//        int n=5; //by fixed number
        for (int i =0; i<=n-1;i++){
            for (int j=0; j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
