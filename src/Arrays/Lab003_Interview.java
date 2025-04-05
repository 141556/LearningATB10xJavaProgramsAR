package Arrays;

public class Lab003_Interview {
    public static void main(String[] args) {
        int[] array = {99, 29, 30};
        int Max_Output= Max_Output(array);
        int Min_Output= Min_Output(array);
        System.out.println(Max_Output);
        System.out.println(Min_Output);

    }

    static int Max_Output(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
            {
                max = array[i];

            }
        }
        return max;
    }
    static int Min_Output(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
            {
                min = array[i];

            }
        }
        return min;
    }

}