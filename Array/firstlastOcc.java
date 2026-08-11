import java.util.Scanner;

public class firstlastOcc {
    public static void main(String[] args) {
        int arr[] = {12,13,2,4,13};
        Scanner sc = new Scanner(System.in);
        //System.out.print("enter number you search in array : ");
        //int target = sc.nextInt();
        int target = 12;
        int hint = 0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                System.out.println("element found at index : "+(i+1));
                hint++;
                break;
            }
        }
        if(hint == 0){
            System.out.println("element not found.....!");
        }
    
        
    }
}
