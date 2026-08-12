import java.util.Arrays;

public class leftSh{
    public static void main(String args[]){
        int arr[] = {34,55,67,12};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int first = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] =first; 
        System.out.println(Arrays.toString(arr));
    }
}