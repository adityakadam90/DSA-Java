import java.util.Arrays;
import java.util.Scanner;
public class secSmallArr {
    public static void main(String args[]){
        
        // int arr[] = new int[5];
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter 5 element of array : ");
        // for(int i : arr){
        //     arr[i] = sc.nextInt();
        // }
        int arr[] = {34,56,1,0,45};
        System.out.println(Arrays.toString(arr));
        int smallest = arr[0];
        int secSmall = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] < smallest){
                secSmall = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<secSmall && arr[i] != smallest){
                secSmall = arr[i];
            }
        }
        System.out.println("second sallest element in array : "+secSmall);
    }
}
