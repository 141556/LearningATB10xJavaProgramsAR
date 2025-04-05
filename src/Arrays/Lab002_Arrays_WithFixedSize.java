package Arrays;

public class Lab002_Arrays_WithFixedSize {
    public static void main(String[] args) {
        int [] marks = {1,2,3,4,5,6};
        System.out.println(marks.length);//why function-() not used means in arrays we should use ( ) for length bcz this length is property of an array
        // we can create an array with new keyword
        int [] marks1 = new int[5];//when we are using anew key word we have to provide fixed value
        System.out.println(marks1.length);
        System.out.println(marks1[1]); //int[5] values are index [0 0 0 0 0 ]
        //incase of string it will be function ex below
        String s1 = "Aswini";
        System.out.println(s1.length());
        String [] names = {"As","Ry"};//Strings
        System.out.println(names[0]);
        String [] names1 = new String[3];
        System.out.println(names1[1]);

        //In the above program note a two points:
//        1. for integer the elements value is 0
//        int [] marks1 = new int[5];
//         System.out.println(marks1[1]);
//        2. for String the elements value is null
//        String [] names1 = new String[3];
//        System.out.println(names1[1]);

    }
}
