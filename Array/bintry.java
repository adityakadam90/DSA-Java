public class bintry {
    public static void main(String args[]){
        int arr[] = {11,22,33,44,55,66,77,88,99};
        int target[] = {33,11,55,66,99,88,11,44,90};

        // int s = 0;
        // int l = arr.length-1;
        for(int i=0;i<target.length;i++){
            int count = 0;
            int iterations = 0;
             int s = 0;
            int l = arr.length-1;
            while(s <= l){
                int mid = (s+l) / 2;
                iterations++;
                if(arr[mid] == target[i]){
                    System.out.println(target[i]+" element found at = "+mid);
                    count = 1;
                    break;
                }else if(arr[mid] > target[i]){
                    l = mid - 1;
                }
                else {
                    s = mid+1;
                }
                // System.out.println("for "+target[i]+" this element iteration in this code is = "+iterations);
            }
            if(count == 0){
                System.out.println(target[i]+" element not found..!");
            }
            System.out.println("for "+target[i]+" this element iteration in this code is = "+iterations);
            System.out.println();
        }
    }
}
