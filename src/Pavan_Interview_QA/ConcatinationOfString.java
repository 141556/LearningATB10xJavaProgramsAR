package Pavan_Interview_QA;

public class ConcatinationOfString {
    public static void main(String[] args) {
        String Str1 ="ABC";
        String Str2 ="DEF";
        String Str3 ="GHI";
        //Approach 1- Using Two varaibles
        String s1 = Str1.concat(Str2);
        String s2 = s1.concat(Str3);
        System.out.println(s2);

        //Approach 2 -Using one statement
        System.out.println(Str1.concat(Str2).concat(Str3));

    }
}
