import java.util.Arrays;

public class rightSh {
    public static void main(String args[]){
        int arr[] = {12,10,101,55};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int last = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        
        arr[0] = last;
        System.out.println(Arrays.toString(arr));
    }
    
}
