public class large {
    public static void main(String args[]){
        int arr[] = {2,3,3,4,43,210};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("largest is : "+max);
    }
}