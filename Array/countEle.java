import java.util.Arrays;

public class countEle {
    public static void main(String args[]){
        int arr[] = {3,5,6,2,3,9,3,9};
        int count[] = {1,1,1,1,1,1,1,1};
        int p = 0;
        for(int i=0;i<arr.length;i++){
            p = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j] && j != i){
                    count[i] = 1+count[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(count));
    }    
}
