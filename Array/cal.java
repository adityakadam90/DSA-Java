import java.util.Arrays;
public class cal {
    public static void main(String args[]){
        int arr[] = {2,3,4,5,6,7};
        int arr2[] = {7,8,9,2,4,6};
        int res [] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i] = arr[i] + arr2[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(res));
    }
    
}
