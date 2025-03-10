package Methods;

public class no_Argument_Yes_returnType {
    public static int m1(){
        System.out.println("m1()");
       return 10;
    }

    public static void main(String[] args) {
        System.out.println("main starts");
        m1();
        System.out.println("main ends");
        System.out.println(m1());
    }
}
