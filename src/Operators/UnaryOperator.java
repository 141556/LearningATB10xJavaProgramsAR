package Operators;

public class UnaryOperator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++);// post increment
        System.out.println(++a); //pre increment
        System.out.println(+a); // it is normal operation doesn't happen anything here
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);
    }
}
