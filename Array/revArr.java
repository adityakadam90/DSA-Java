import java.util.Arrays;

public class revArr{
    public static void main(String args[]){
        int arr[] = {12,3,42,10,34};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i] = arr[i];
        }
        for(int i=n-1;i>=0;i--){
            arr[n-i-1] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}