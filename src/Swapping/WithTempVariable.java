package Swapping;

public class WithTempVariable {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 100;
        int temp;
        System.out.println("Before swapping num1 and num2:" +num1+","+num2);
      temp = num1;
      num1 = num2;
        num2 = temp;
        System.out.println("After swapping num1 and num2:"+num1+","+num2);


    }
}
