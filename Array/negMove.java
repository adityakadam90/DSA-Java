import java.util.Arrays;

public class negMove {
    public static void main(String[] args) {

        int arr[] = {-1, 3, -6, 3, 56, -8};

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

                index++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}