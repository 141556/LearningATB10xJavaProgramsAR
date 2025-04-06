package Arrays;

import javax.swing.*;
import java.util.Scanner;

public class Lab008_SecondLargest_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
      int size = sc.nextInt();
      int[] numbers = new int[size];
      for (int i = 0; i<size;i++){
          System.out.println("Enter the number");
          numbers[i] = sc.nextInt();

      }
      for(int i=0;i<numbers.length;i++){
          System.out.println(numbers[i]);
      }





    }
}
