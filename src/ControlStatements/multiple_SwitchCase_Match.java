package ControlStatements;

public class multiple_SwitchCase_Match {
    public static void main(String[] args) {
        int item = 001;
        switch (item) {
            case 001, 002, 003:
                System.out.println("all of them are electronic gadgets");
                break;

            case 004, 006:
                System.out.println("The mech");
                break;
            default:
                System.out.println("None");

        }

    }
}

