public class productArr {
    public static void main(String args[]){
        int arr[] = {2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                    if(i != j){
                        System.out.println(arr[i]+" x "+arr[j]+" = "+(arr[i]*arr[j]));
                    }
            }
            System.out.println();
        }
    }
    
}
