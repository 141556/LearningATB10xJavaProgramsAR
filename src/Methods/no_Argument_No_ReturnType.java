package Methods;

public class no_Argument_No_ReturnType {
    public static void main(String[] args) {
        System.out.println("main starts");
        System.out.println("main ends");

    }
    public static void display(){
        //declared the display() as a method but we didn't invoke or call in the main method that is the reason in output the below line is not visible
        System.out.println("display() is void type");
        return;
    }
}
