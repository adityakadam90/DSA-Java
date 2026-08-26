import java.util.Scanner;

public class longestStr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sentence : ");
        String sent = sc.nextLine();

        String sentarr[] = sent.split(" ");
        System.out.println(sentarr.length); 
        System.out.println();
        //System.out.println(sentarr[0].length());
        String max = "";
        int maxL = 0;
        for(int i=0;i<sentarr.length;i++){
            if(sentarr[i].length() > maxL){
                max=sentarr[i];
                maxL = sentarr[i].length();
            }
        }
        System.out.println("longest string is = "+max);
    }
}