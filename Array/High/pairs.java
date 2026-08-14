public class pairs {
    public static void main(String args[]){
        int arr[] = {2,3,4,5,6};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    
}
