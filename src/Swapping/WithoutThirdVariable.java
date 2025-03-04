package Swapping;

public class WithoutThirdVariable {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        System.out.println("Before swapping num1 and num2:" +a+","+b);
        a = a-b;
        b = a+b;
        System.out.println("After swapping num1 and num2:"+a+","+b);

    }


}
