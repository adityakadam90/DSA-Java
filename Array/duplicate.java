public class duplicate {
    public static void main(String args[]){
        int arr[] = {3,4,5,13,93,90};
        boolean check = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    check = true;
                }
            }
        }
        if(check == true){
            System.out.println("duplicates Available....!");
        }else {
            System.out.println("Duplicates not available...!");
        }
    }
}