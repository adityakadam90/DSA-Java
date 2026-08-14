public class kadans {
    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0;i<arr.length;i++){
            cs = arr[i] + cs;
            if(cs < 0){
                cs = 0;

            }
            ms = Math.max(ms,cs);
        }
        System.out.println("maximum sum of subarray is : "+ms);
    }
}