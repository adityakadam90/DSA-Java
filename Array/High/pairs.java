public class pairs {
    public static void main(String args[]){
        int arr[] = {2,7,4,5,2,6};
        int targetSum = 4;
        int p = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == targetSum){
                    System.out.println("this pairs hit target sum = "+"("+arr[i]+","+arr[j]+")");
                    p++;
                }
            }
            //System.out.println();
        }
        if(p == 0){
            System.out.println("not any pair hit target sum.");
        }
    }
    
}
