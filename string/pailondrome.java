import java.util.Scanner;
public class pailondrome {
    public static void main(String args[]){
        System.out.println("enter String : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        // int n = 909;
        // String name = String.valueOf(n);
        // int len = name.length();
        int n = name.length();
        int count = 0;
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i) != name.charAt(n-i-1)){
                count = 1;
            }
        }
        if(count == 0){
            System.out.println("string is pailondrome.");
        }else {
            System.out.println("string is not pailondrome!");
        }

        // int n = 9029;
        // String ns = String.valueOf(n);

    }
}