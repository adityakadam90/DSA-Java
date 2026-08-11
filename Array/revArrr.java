import java.util.Arrays;

public class revArrr {
    public static void main(String args[]){
        int arr[] = {22,10,15,30,60,45};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
