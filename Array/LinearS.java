import java.util.Scanner;

public class LinearS {
    public static void main(String[] args) {
        int arr[] = {12,34,52,12,44,51,99};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number you search in array : ");
        int target = sc.nextInt();
        int hint = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("element found at index = "+(i+1));
                hint++;
                break;
            }
            
        }
        if(hint == 0){
                System.out.println("element not found...!");
        }
    }
    
}
