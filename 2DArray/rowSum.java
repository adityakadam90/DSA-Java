public class rowSum {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[0].length;j++){
                sum = arr[i][j] + sum;
            }
            System.out.println("Sum of row "+i+" is = "+sum);
        }
    }
}
