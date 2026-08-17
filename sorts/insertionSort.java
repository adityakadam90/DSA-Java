import java.util.Arrays;

public class insertionSort {
    public static void main(String args[]){
        int arr[] = {4,5,2,3,1};

        for(int i=1;i<arr.length;i++){
            int prev = i-1;
            int curr = arr[i];
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        System.out.println(Arrays.toString(arr));
    
    }
    
}
