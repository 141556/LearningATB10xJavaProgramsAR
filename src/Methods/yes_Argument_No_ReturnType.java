package Methods;

public class yes_Argument_No_ReturnType {
   public static void m1 (int i){//int i is the argument and m1 is the method we are invoking in main method
       System.out.println ("m1()");
       return;
   }

    public static void main(String[] args) {
        System.out.println("main starts");
        m1(100);//this is the value of argument
    }
}
