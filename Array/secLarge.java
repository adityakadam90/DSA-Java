public class secLarge{
    public static void main(String args[]){
        int arr[] = {2,38,22,4,2,1,2};
        int max = arr[0];
        int secmax = arr[0];
        for (int i=1;i<arr.length;i++){
            if(max < arr[i]){
                secmax = max;
                max = arr[i];

            }else if(secmax <arr[i] && arr[i] != max){
                secmax = arr[i];
            }
        } 
        System.out.println("second largest is : "+secmax);
    }
}