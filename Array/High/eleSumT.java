public class eleSumT {
    public static void main(String args[]){
        int target = 9;
        int arr[] = {12,3,4,5,3,2,1,3,4};
        int p =0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;j<arr.length;j++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        System.out.println("target hit elemnt are : "+arr[i]+","+arr[j]+","+arr[k]);
                        p++;
                    }
                }
            }
        }
        if(p == 0){
            System.out.println("target not hit by  elements.!");
        }
    }
}
