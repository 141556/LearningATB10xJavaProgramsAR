package ControlStatements;

public class statement_If {
    public static void main(String[] args) {
int age = Integer.parseInt(args[0]);//To pass different values during the execution we can use this format and you have to use edit configuration use dropdown up
        if (age >= 18)
        {
            System.out.println("eligible to vote");
            return;
        }
        System.out.println("not eligible to vote");
    }
}
