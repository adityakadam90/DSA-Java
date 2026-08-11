public class binaryS {
    public static void main(String args[]){
        int arr[] = {12,34,44,56,77,89};
        int mid,start=0,end=arr.length-1,target = 90,hint=0;
        while(start != end){
            mid = (start+end)/2;
            if(target == arr[mid]){
                System.out.println("element found at index = "+(mid+1));
                hint++;
                break;
            }else if(arr[mid] > target){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        if(hint == 0){
            System.out.println("not found");
        }
    }
}
