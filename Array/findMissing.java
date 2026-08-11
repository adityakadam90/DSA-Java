public class findMissing {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5};
        int n = 5;
        int expected_sum= n *(n+1)/2 ;
        int actualSUm = 0;
        for(int i=0;i<arr.length;i++){
            actualSUm+=arr[i];
        }
        int miss = expected_sum - actualSUm;
        System.out.println("missing number is : "+miss);

    }
}
