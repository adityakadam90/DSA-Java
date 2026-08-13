
public class maxSubarrSum {
    public static void main(String args[]){
        int arr[] = {2,3,4,5,6,7,8,9};
        int hs = 0;
        int cs = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                cs = 0;
                for(int k=i;k<=j;k++){
                    cs = arr[k] + cs;
                    if(cs > hs){
                        hs = cs;
                    }
                }
            }
        }
        System.out.println(hs);
    }
}
