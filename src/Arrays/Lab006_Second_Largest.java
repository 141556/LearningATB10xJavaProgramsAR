package Arrays;

import java.util.Arrays;

public class Lab006_Second_Largest {
    public static void main(String[] args) {
        int[] numbers = {24,15,145,456,10};
        Arrays.sort(numbers);
        //for (int i =0; i<numbers.length;i++)//To print in in sorting order
        //    System.out.println(numbers[i]);
        System.out.println(numbers[numbers.length-2]);
    }

}
