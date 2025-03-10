package Tasks;

import java.util.Scanner;

public class fizzBuzz_forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int i =sc.nextInt();
        for(i=0;i>=2;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if (i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }











        }


    }
}
