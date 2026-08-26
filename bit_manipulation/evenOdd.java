package bit_manipulation;
import java.util.Scanner;
public class evenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N : ");
        int n = sc.nextInt();
        if((n & 1) == 1){
            System.out.println("number is odd!");
        }else{
            System.out.println("NUMBER IS EVEN");
        }
    }
}