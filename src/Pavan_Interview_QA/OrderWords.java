package Pavan_Interview_QA;

public class OrderWords {
    public static void main(String[] args) {
         String s1 = "JAVA,SELENIUM,MAVEN,TESTNG";
//         String Str [] = new String[s1];
        //suing split word and array
         String[] Str = s1.split(",");
        System.out.println(Str[0]);
        System.out.println(Str[1]);
        System.out.println(Str[2]);
        System.out.println(Str[3]);


        //Using for loop
        for(String Strs :Str)
        {
            System.out.println(Strs);
        }



    }
}
