package Arrays;

import java.util.Arrays;

public class Lab001_Arrays_PredefinedArrayValues {
    public static void main(String[] args) {
        int a = 10;
        int[] marks = {78, 80, 50, 80};
//        Array creation with predefined elements
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        //System.out.println(marks[4]);//ArrayIndexOutOfBoundsExceptio
        //since the index 4 value is not there will get an exception :Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        marks[0] = 100;
        marks[1] = 99;
        marks[2] = 89;
        marks[3] = 79;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println("==using for loop==");
        int i;
        for (i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));

    }
}
