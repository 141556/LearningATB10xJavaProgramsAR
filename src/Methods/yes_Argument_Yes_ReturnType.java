package Methods;

public class yes_Argument_Yes_ReturnType {
    public static double display(int i, String s){
        System.out.println("display() is a double type");
        return 4.9;
    }

    public static void main(String[] args) {
        System.out.println("main starts");
        display(10,"java");
        System.out.println("==============");
        System.out.println(display(50, "mava"));

    }
}
