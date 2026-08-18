import java.util.Arrays;
import java.util.Collections;
public class inbuiltSort {
    public static void main(String args[]){
        Integer arr[] = {3,2,4,1,5};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}