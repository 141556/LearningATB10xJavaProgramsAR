package Operators;

public class Miscelleanous_Condi_Ternary {
    public static void main(String[] args) {
        boolean result = true == false?true:false; //ans is true
        // true == false is condition and if it is true will assign the left part of true:false else will assign the right part;
        System.out.println(result);
        int result1 = 10>5?10:5;//ans is 10
        System.out.println(result1);
        int result2 = 10<5?10:5; // ans is 5
        System.out.println(result2);
        boolean result4 = (10==10)?true:false;
        System.out.println(result4);
    }
}
