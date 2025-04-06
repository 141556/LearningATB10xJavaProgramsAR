package Arrays;

public class Lab005_Sum_Of_Array {
    public static void main(String[] args) {
        int[] numbers = {24,12,16};
        int sum =0;
//        for (int i =0; i< numbers.length;i++)
//        {
//            sum  = sum+(numbers[0]);
//        }
//        System.out.println(sum);

        //The below one is other example to sum this is called for each loop(works only with arrays and collection frameworks)-enhanced for loop
for(int n: numbers){
    sum = sum +n;

}
        System.out.println(sum);

    }
}
